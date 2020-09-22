package com.shayanwipropjp.handson1;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
        KidUsers kidUsers = new KidUsers();
    //POSITIVE TESTS
        kidUsers.setAge(10);
        kidUsers.setBookType("KIDS");
        kidUsers.registerAccount();
        kidUsers.requestBook();
    //NEGATIVE TESTS
        System.out.println();
        kidUsers.setAge(18);
        kidUsers.setBookType("Fiction");
        kidUsers.registerAccount();
        kidUsers.requestBook();

        System.out.println("\n");
        AdultUsers adultUser = new AdultUsers();
    //POSITIVE TESTS
        adultUser.setAge(20);
        adultUser.setBookType("FICTION");
        adultUser.registerAccount();
        adultUser.requestBook();
    //NEGATIVE TESTS
        System.out.println();
        adultUser.setAge(3);
        adultUser.setBookType("KIDS");
        adultUser.registerAccount();
        adultUser.requestBook();

    }
}
