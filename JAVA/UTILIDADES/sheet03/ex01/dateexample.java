package UTILIDADES.sheet03.ex01;

import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

class DateExample {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();

     DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1 = myDateObj.format(format1);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate2 = myDateObj.format(format2);

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy");
        String formattedDate3 = myDateObj.format(format3);

        System.out.println("Formato 1: " + formattedDate1);
        System.out.println("Formato 2: " + formattedDate2);
        System.out.println("Formato 3: " + formattedDate3);
  }
}
