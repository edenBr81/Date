package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.OffsetDateTime.parse;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String theDate = "";
        LocalDate returnDate = null;
        DateTimeFormatter shortDateFormat= DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Enter your date MM/dd/yyy");
        theDate = scan.nextLine();
        returnDate= LocalDate.parse(theDate,shortDateFormat);
        System.out.println("you Entered:"+returnDate);
        System.out.println("The Day Of Week:"+returnDate.getDayOfWeek());
        System.out.println("The Month Of Year for this date is:"+returnDate.getMonth());
        String futurepast=returnDate.isAfter(LocalDate.now())?"future":"past";
        System.out.println("This is a"+(returnDate.isAfter(LocalDate.now())?"future":"past")+"date");


    }
}
