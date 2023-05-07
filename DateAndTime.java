/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Record;

/**
 *
 * @author mahaa
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DateAndTime {
    Scanner in = new Scanner(System.in);
   
    Date dt = new Date();
    GregorianCalendar Gr = new GregorianCalendar();
    Date date2;
    DateFormat dateFormat;
     String d;
     
     // The DateAndTime Class Determines the day and month that the customer chooses to attend 
     // the event they chose 
    public void GetDate(){
               System.out.println("Date of birth: month"); 
                int month = (in.nextInt() - 1);// Stores the month the customer wants
                System.out.println("Enter the day: "); 
                int day = in.nextInt();// Stores the day the customer wants
                GregorianCalendar Gr2 = new GregorianCalendar(2022, month,day); // play in time 
                Gr2.add(GregorianCalendar.DATE, 0);
                date2 = Gr2.getTime();
                dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
                  this.d = dateFormat.format(date2);
//                 System.out.print(d); 
    }
  @Override
 public String toString(){
        return d;
    }
    
}
