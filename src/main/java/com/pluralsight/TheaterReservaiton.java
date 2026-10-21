package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservaiton {
    public static void main(String[] args) {

        LocalDate localDate;
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter;

        System.out.printf("Please Enter your full name: ");
        String fullName = input.nextLine();
        String[] userName = fullName.split(" ");
        String adjustedName = userName[1]+" , "+userName[0];

        System.out.printf("Please Enter the date you will be coming (MM/dd/yyyy): ");
        String date = input.nextLine();
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        localDate = LocalDate.parse(date, formatter);

        System.out.printf("How many Tickets would you like? ");
        int tickets = input.nextInt();
        if (tickets > 1){
            System.out.printf("%d tickets ", tickets);
        } else if (tickets == 1){
            System.out.printf("%d ticket ", tickets);
        }else {
            System.out.printf("invalid number ");
            return;
        }


        System.out.printf("reserved for "+ localDate + " under "+ adjustedName);







    }
}
