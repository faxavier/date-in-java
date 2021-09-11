/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateshow;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter;

public class DateShow {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
    LocalTime myOb = LocalTime.now();
    System.out.println(myOb);
    // display all at the same time
    LocalDateTime Obj = LocalDateTime.now();
    System.out.println(Obj);
    
    //to give format to date and time
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
    String formattedDate = Obj.format(myFormatObj);  
    System.out.println("After Formatting: " + formattedDate);  
  
    
  }
}