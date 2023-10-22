package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner=new Scanner(System.in);
    ArrayList<Contact> contactList = new ArrayList<Contact>();

    public static void main(String[] args) {
        AddressBook addressbook = new AddressBook();
        String s;
        do {
            System.out.println("1.Add Contact" + "\n" + "2.Edit contact" + "\n" + "3.Delete contact" + "\n" + "4.AddMultipleContacts");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressbook.addContactDetails();
                    break;
                case 2:
                    addressbook.editContactDetails();
                    break;
                case 3:
                    addressbook.deleteContactDetails();
                    break;
                case 4:
                    addressbook.addMultipleContact();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("If you want to continue press y or Y");
            s=scanner.next();
        }while (s.equals("y")||s.equals("Y"));
    }


    public Contact addContactDetails() {

        Contact contact = new Contact();

        System.out.println("Enter First name");
        String firstName = scanner.next();
        contact.setFirstName(firstName);

        System.out.println("Enter Last name");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        System.out.println("Enter Address");
        String address = scanner.next();
        contact.setAddress(address);

        System.out.println("Enter City name");
        String city = scanner.next();
        contact.setCity(city);

        System.out.println("Enter State name");
        String state = scanner.next();
        contact.setState(state);

        System.out.println("Enter Zip code");
        int zip = scanner.nextInt();
        contact.setZip(zip);

        System.out.println("Enter Phone number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email");
        String email = scanner.next();
        contact.setEmailId(email);

        contactList.add(contact);
        System.out.println(contactList);
        System.out.println("Successfully created contacts");
        return contact;


    }

    public void editContactDetails() {
        System.out.println("Enter first name for edit:");
        String editName = scanner.next();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(editName)) {
                System.out.println("Select options");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.Email");
                int editOption = scanner.nextInt();
                switch (editOption) {
                    case 1:
                        System.out.println("Enter First name:");
                        contactList.get(i).setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter Last name:");
                        contactList.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter Address:");
                        contactList.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter City:");
                        contactList.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter State:");
                        contactList.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip code:");
                        contactList.get(i).setZip(Integer.parseInt(scanner.next()));
                        break;
                    case 7:
                        System.out.println("Enter Phone number:");
                        contactList.get(i).setPhoneNumber(Long.parseLong(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Email :");
                        contactList.get(i).setEmailId(scanner.next());
                        break;
                    default:
                        System.out.println("Enter valid contact");
                }
            }
            System.out.println("Edited list is:");
            System.out.println(contactList);
        }
    }

    public void deleteContactDetails() {
        System.out.println("Confirm first name to delete contact");
        String confirmName = scanner.next();
        System.out.println(confirmName);
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(confirmName)) ;
            Contact person = contactList.get(i);
            contactList.remove(person);

        }
        System.out.println(contactList);

    }

    public void addMultipleContact() {
        System.out.println("Enter Number of Contacts to Add into Contact Book");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            addContactDetails();
            System.out.println(i + 1 + " Contact added Successfully.. ");

        }
    }
}
