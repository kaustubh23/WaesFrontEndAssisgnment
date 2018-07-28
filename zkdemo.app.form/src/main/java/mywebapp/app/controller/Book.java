package mywebapp.app.controller;

public class Book {
    private String author, title ;
  private boolean editingStatus;
 
  public Book(String author, String title, boolean editingStatus) {
       this.author = author;
       this.title = title;
     this.editingStatus = editingStatus;
 
 }
 
   public String getAuthor() {
     return author;
  }
 
   public void setAuthor(String author) {
      this.author = author;
   }
 
   public String getTitle() {
      return title;
   }
 
   public void setTitle(String title) {
        this.title = title;
 }
 
  
  public boolean getEditingStatus() {
     return editingStatus;
   }
 
   public void setEditingStatus(boolean editingStatus) {
       this.editingStatus = editingStatus;
 }
 
}
