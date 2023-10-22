package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       AddressBook addressBook=new AddressBook();
       addressBook.createContact();
    }
    public void createContact(){
        Contact person1 =new Contact();

        System.out.println("Enter First Name :");
        String firstName=scanner.nextLine();
        person1.setFirstName(firstName);

        System.out.println("Enter Last Name :");
        String lastName=scanner.nextLine();
        person1.setLastName(lastName);

        System.out.println("Enter Address :");
        String address=scanner.nextLine();
        person1.setAddress(address);

        System.out.println("Enter City :");
        String city=scanner.nextLine();
        person1.setCity(city);

        System.out.println("Enter State :");
        String state=scanner.nextLine();
        person1.setState(state);

        System.out.println("Enter Email Id :");
        String email=scanner.nextLine();
        person1.setEmailId(email);

        System.out.println("Enter Zip :");
        int zip=scanner.nextInt();
        person1.setZip(zip);

        System.out.println("Enter Phone Number :");
        long phoneNumber=scanner.nextLong();
        person1.setPhoneNumber(phoneNumber);

        System.out.println(person1);
    }
}
