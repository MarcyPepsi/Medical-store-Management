/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.scene.control.Alert;

/**
 *
 * @author Marcy GADEU
 */
public class functions {
    public static Calendar  checkValidDate(String date)
    {
        String formatdate = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        
        if(date.matches(formatdate))
        
        System.out.println("good");
        String [] tokens = date.split("/");
        int day = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
       
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Calendar c = new GregorianCalendar(year, month-1, day);
        
        
        return c;
    }
   
    public static Date getDate(String date) throws ParseException {
        String format = "^(3[01]|[12][0-9]|0?[1-9])/(1[0-2]|0?[1-9])/[1-9][0-9]{3}$";
       
        boolean isDateValid = false, isDateAfter = false;
        
                if (!date.matches(format)) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Wrong date format");
                    alert.setContentText("The date entered should be in the form dd/MM/yyyy"+ ".\nRe-enter:");
                    alert.showAndWait();
                }
             else  if(date.matches(format)){
                String[] tokens = date.split("/");
                int day = Integer.parseInt(tokens[0]);
                int year = Integer.parseInt(tokens[2]);
                int month = Integer.parseInt(tokens[1]);
                isDateValid = isValidDate(day, (month - 1), year);
                if (!isDateValid) {
                     Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Not valid date");
                    alert.setContentText("The date entered should be a valid one\n.Re-enter:");
                    alert.showAndWait();
                }
                    
//                } else {
//                    isDateAfter = new SimpleDateFormat("dd/MM/yyyy").parse(date).after(new Date());
//                    if (isDateAfter) {
//                        System.out.printf("The date entered is after today's date.\n"
//                                + "Re-enter:");
//                    }
//                }
            }

      

        return new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }
    
   
    
     public static String displayDate(Date date){
         String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String newDate = simpleDateFormat.format(date);
        return newDate;
     }
     public static boolean isValidDate(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);

        try {
            calendar.set(year, month, day);
            calendar.getTime();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
//    public static int checkMonth(String month)
//    {
//        if(month.equals("January"))
//            return 0;
//        else if(month.equals("February"))
//          return 1;
//        else if(month.equals("March"))
//          return 2;
//        else if(month.equals("April"))
//          return 3;
//        else if(month.equals("May"))
//          return 4;
//       
//        else if(month.equals("June"))
//            return 5;
//        else if(month.equals("July"))
//            return 6;
//        else if(month.equals("August"))
//            return 7;
//       else if(month.equals("September"))
//            return 8;
//        else if(month.equals("October"))
//            return 9;
//        else if(month.equals( "November"))
//            return 10;
//        else if(month.equals("December" ))
//            return 11;
//        else
//         return -1;
//    }
//    public static String checkMonth(int month)
//    {
//        if(month == 0)
//            return "January";
//        else if(month == 1)
//          return "February";
//        else if(month == 2)
//          return "March";
//        else if(month == 3)
//          return "April";
//        else if(month == 4)
//          return "May";
//        else if(month == 5)
//            return "June";
//        else if(month == 6)
//            return "July";
//        else if(month == 7)
//            return "August";
//       else if(month == 8)
//            return "September";
//        else if(month == 9)
//            return "October";
//        else if(month == 10)
//            return "November";
//        else if(month == 11)
//            return "December";
//        else
//         return "";
//    }
      public static Date haveDate(String date) throws ParseException {
        String format = "^(3[01]|[12][0-9]|0?[1-9])/(1[0-2]|0?[1-9])/[1-9][0-9]{3}$";
        if (!date.matches(format)) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Wrong date format");
                    alert.setContentText("The date entered should be in the form dd/MM/yyyy"+ ".\nRe-enter:");
                    alert.showAndWait();
                }
             else  if(date.matches(format)){
                String[] tokens = date.split("/");
                int day = Integer.parseInt(tokens[0]);
                int year = Integer.parseInt(tokens[2]);
                int month = Integer.parseInt(tokens[1]);}
        return new SimpleDateFormat("dd/MM/yyyy").parse(date);
    
      }
    
}
