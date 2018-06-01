package com.company;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Locale locale = new Locale("en", "US");
         NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);



        System.out.print("Enter Customer ID: ");
        int cusID = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Customer First Name and Last Name: ");
        String cusName = keyboard.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmt = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter Tax Code: ");
        String taxCode = keyboard.nextLine();
        taxCode = taxCode.toLowerCase();



        double taxRate = 0.0;

        switch (taxCode) {
            case "nrm": taxRate = 0.06;
                    break;
            case "npf": taxRate = 0;
                break;
            case "biz": taxRate = 0.045;
                break;
        }

        double salesTax = salesAmt * taxRate;
        double totalAmt = salesAmt + salesTax;
        taxCode = taxCode.toUpperCase();

        System.out.printf("%-15s: %d%n", "Customer ID: ", cusID);
        System.out.printf("%-15s: %s%n", "Customer Name: ", cusName);
        System.out.printf("%-15s: %s%n", "Sales Amount: ", currencyFormatter.format(salesAmt));
        System.out.printf("%-15s: %s%n", "Tax Code: ", taxCode);
        if (taxRate > 0)  {
            System.out.printf("%-15s: %s%n", "Sales Tax: ", salesTax);
        }
        System.out.printf("%-15s: %s%n", "Total Amount: ", currencyFormatter.format(totalAmt));


    }
}
