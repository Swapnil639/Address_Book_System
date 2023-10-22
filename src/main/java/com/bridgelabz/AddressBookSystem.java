package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, AddressBook> addressBookMap = new HashMap<>();

    public static void main(String[] args) {
        AddressBookSystem addressBookSystem=new AddressBookSystem();
        addressBookSystem.multiplyAddressBook();
        System.out.println(addressBookMap);
    }
    private void multiplyAddressBook() {
        System.out.println("how many Address Book are creating");
        int numberOfAddressBook = scanner.nextInt();
        for (int i = 1; i <= numberOfAddressBook; i++) {
            System.out.println("Enter " + i + " the Address Book Name");
            String addressBookName = scanner.next();
            AddressBook addressBook = new AddressBook();
            addressBook.setAddressBookName(addressBookName);
            addressBook.multiplyContact();
            addressBook.editDeleteContact();
            addressBookMap.put(addressBookName, addressBook);
        }
    }
}
