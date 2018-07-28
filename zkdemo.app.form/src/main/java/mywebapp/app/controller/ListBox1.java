package mywebapp.app.controller;

import java.util.ArrayList;
import java.util.List;
 
public class ListBox1 {
 
    private List<person> allPersons = new ArrayList<person>();
 
  public List<person> getAllPersons() {
     return allPersons;
  }
 
   public void setAllPersons(List<person> allPersons) {
      this.allPersons = allPersons;
   }
 
   public ListBox1() {
 
     allPersons.add(new person("John", "James", "JohnJames@yahoo.com"));
     allPersons.add(new person("Taylor", "Harris", "Harris@yahoo.com"));
     allPersons.add(new person("Allen", "Scott", "Scott@yahoo.com"));
 
    }
 
   // inner class
  public class person {
       private String firstName;
       private String lastName;
        private String email;
 
       public person(String firstName, String lastName, String email) {
            this.firstName = firstName;
         this.lastName = lastName;
           this.email = email;
     }
 
       public String getFirstName() {
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
 
       public String getEmail() {
          return email;
       }
 
       public void setEmail(String email) {
            this.email = email;
     }
 
   }
}