package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner=new Scanner(System.in);
    Contact person1 =new Contact();
    public static void main(String[] args) {
       AddressBook addressBook=new AddressBook();
       addressBook.addContactDetail();
       addressBook.editContactDetail();
    }
    public void addContactDetail(){
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
    public void editContactDetail() {
        System.out.println("Edit the Contact");
        String s;
        do {
            System.out.println("Choose an option \n1.First name \n2.Last name \n3.Address \n4.City \n5.state \n6.Email Id \n7.Zip \n8.Phone Number");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter First name :");
                    person1.setFirstName(scanner.next());
                    break;
                case 2:
                    System.out.println("Enter Last name :");
                    person1.setLastName(scanner.next());
                    break;
                case 3:
                    System.out.println("Enter Address :");
                    person1.setAddress(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter City :");
                    person1.setCity(scanner.next());
                    break;

                case 5:
                    System.out.println("Enter State :");
                    person1.setState(scanner.next());
                    break;
                case 6:
                    System.out.println("Enter Email ID :");
                    person1.setEmailId(scanner.next());
                    break;
                case 7:
                    System.out.println("Enter Zip :");
                    person1.setZip(scanner.nextInt());
                    break;
                case 8:
                    System.out.println("Enter Phone Number :");
                    person1.setPhoneNumber(scanner.nextLong());
                    break;
                default:
                    System.out.println("Invalid option");

            }
            System.out.println(person1);
            System.out.println("If you want to continue press y or Y");
            s=scanner.next();
        }while (s.equals("y") || s.equals("Y"));
    }
}
