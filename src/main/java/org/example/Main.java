package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact("Test", "12345678");
        ArrayList<Contact> liste = new ArrayList<>();
        MobilePhone mobilePhone=new MobilePhone("12342134",liste);
        mobilePhone.addNewContact(contact);
        mobilePhone.printContact();

    }


}
