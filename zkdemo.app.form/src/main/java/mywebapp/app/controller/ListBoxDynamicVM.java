package mywebapp.app.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zul.Messagebox;
 
public class ListBoxDynamicVM {
 
 private String templatetype;
    private List<Person> persons;
 
 public List<Person> getPersons() {
        return persons;
 }
 
   public void setPersons(List<Person> persons) {
        this.persons = persons;
 }
 
   public String getTemplatetype() {
       return templatetype;
    }
 
   public void setTemplatetype(String templatetype) {
      this.templatetype = templatetype;
   }
 
   @AfterCompose
   public void initSetup(@ContextParam(ContextType.VIEW) Component view) {
     Selectors.wireComponents(view, this, false);
 
        System.out.println("starting creating list");
       persons = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
           persons.add(new Person("firstname_" + i, "lastname_" + i,
                   "address_" + i, "city_" + i));
      }
 
       this.templatetype = "simple";
   }
 
   @NotifyChange("templatetype")
   @Command
    public void onTemplate(@BindingParam("type") String type) {
 
     this.templatetype = type;
       Messagebox.show(" " + templatetype);
    }
 
   public static class Person {
        private String firstName;
       private String lastName;
        private String address1;
        private String city;
 
        public Person(String firstName, String lastName, String address1,
               String city) {
          this.firstName = firstName;
         this.lastName = lastName;
           this.address1 = address1;
           this.city = city;
 
       }
 
       public String getFirstName() {
          System.out.println(" " + this.firstName);
           return firstName;
       }
 
       public void setFirstName(String firstName) {
            this.firstName = firstName;
     }
 
       public String getLastName() {
           return lastName;
        }
 
       public void setLastName(String lastName) {
          this.lastName = lastName;
       }
 
       public String getAddress1() {
           return address1;
        }
 
       public void setAddress1(String address1) {
          this.address1 = address1;
       }
 
       public String getCity() {
           return city;
        }
 
       public void setCity(String city) {
          this.city = city;
       }
 
   }
}