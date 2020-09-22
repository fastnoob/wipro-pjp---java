package com.mainclass;

import com.accountclasses.FDAccount;
import com.accountclasses.RDAccount;
import com.accountclasses.SBAccount;
import java.util.*;

public class InterestCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("-----------------");
            System.out.print("M A I N   M E N U"+
                            "\n-----------------"+
                                    "\n1. Interest Calculator - SB"+
                                    "\n2. Interest Calculator - FD"+
                                    "\n3. Interest Calculator - RD"+
                                    "\n4. Exit"+
                                    "\n\nEnter your option (1..5) : ");

            choice  = sc.hasNextInt() ? sc.nextInt() : 0;

            switch (choice) {
                case 1:
                    SBAccount sbAccount = new SBAccount();
                    System.out.print("Enter the Average amount in your account: ");
                    sbAccount.setAmount(sc.nextDouble());
                    System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest()+"\n");
                    break;

                case 2:
                    FDAccount fdAccount = new FDAccount();
                    System.out.print("Enter the FD ammount: ");
                    fdAccount.setAmount(sc.nextDouble());

                    System.out.print("Enter number of days: ");
                    int noOfDays = sc.nextInt();
                    while (noOfDays < 0) {
                        System.out.println("Invalid Number of days. Please enter non - negative values.");
                        System.out.print("Enter number of days: ");
                        noOfDays = sc.nextInt();
                    }
                    fdAccount.setNoOfDays(noOfDays);

                    System.out.print("Enter your age: ");
                    int age = sc.nextInt();
                    while (age < 0) {
                        System.out.println("Invalid age. Please enter non - negative values.");
                        System.out.print("Enter your age: ");
                        age = sc.nextInt();
                    }
                    fdAccount.setAgeOfACHolder(age);

                    System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest()+"\n");
                    break;

                case 3:
                    RDAccount rdAccount = new RDAccount();
                    System.out.print("Enter the RD ammount: ");
                    rdAccount.setAmount(sc.nextDouble());

                    System.out.print("Enter number of months: ");
                    int noOfMonths = sc.nextInt();
                    while (noOfMonths < 0) {
                        System.out.println("Invalid Number of months. Please enter non - negative values.");
                        System.out.print("Enter number of months: ");
                        noOfMonths = sc.nextInt();
                    }
                    rdAccount.setNoOfMonth(noOfMonths);

                    System.out.print("Enter your age: ");
                    age = sc.nextInt();
                    while (age < 0) {
                        System.out.println("Invalid age. Please enter non - negative values.");
                        System.out.print("Enter your age: ");
                        age = sc.nextInt();
                    }
                    rdAccount.setAgeOfACHolder(age);

                    System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest()+"\n");
                    break;

                case 4:
                    System.out.println("Thanks for using.");
                    break;

                default:
                    System.out.println("\nPlease enter a valid option.\n");
                    break;
            }

        } while (choice != 4);
    }

}
