package mywebapp.app.controller;


import java.util.List;
 
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zhtml.Messagebox;
 
public class InlineEditingViewModel {
 
 private BookData data = new BookData();
 
 private boolean displayEdit = true;
 private boolean isAddNew = false;
 
   public boolean isDisplayEdit() {
        return displayEdit;
 }
 
   @NotifyChange({ "allBooks", "displayEdit" })
    public void setDisplayEdit(boolean displayEdit) {
       this.displayEdit = displayEdit;
 }
 
   public List<Book> getAllBooks() {
     return data.getAllBooks();
  }
 
   @Command
    public void changeEditableStatus(@BindingParam("currentBook") Book book) {
      if (isAddNew == true) {
         data.getAllBooks().remove(book);
            isAddNew = false;
       } else
          book.setEditingStatus(!book.getEditingStatus());
        refreshRowTemplate(book);
 
   }
 
   @Command
    public void confirm(@BindingParam("currentBook") Book book) {
       if (isAddNew == true) {
         if (book.getAuthor().equalsIgnoreCase("")
                   || book.getTitle().equalsIgnoreCase("")) {
              Messagebox.show(" Please enter the values");
                return;
         } else
              isAddNew = false;
       }
       book.setEditingStatus(!book.getEditingStatus());
        refreshRowTemplate(book);
   }
 
   public void refreshRowTemplate(Book lcs) {
      /*
       * This code is special and notifies ZK that the bean's value has
        * changed as it is used in the template mechanism. This stops the
       * entire Grid's data from being refreshed
       */
     BindUtils.postNotifyChange(null, null, lcs, "editingStatus");
   }
 
   @Command
    @NotifyChange({ "allBooks", "displayEdit" })
    public void onAddNew() {
        data.getAllBooks().add(0, new Book("", "", true));
      isAddNew = true;
    }
    
    @Command
    @NotifyChange({ "allBooks", "displayEdit" })
    public void onDelete(@BindingParam("currentBook") Book book)
    {
       data.getAllBooks().remove(book);
    }
}