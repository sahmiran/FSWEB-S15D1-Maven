package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContact;

    public MobilePhone(String myNumber, List<Contact> myContact) {
        this.myNumber = myNumber;
        this.myContact = myContact;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContact;
    }

    public boolean addNewContact(Contact contact){
        if(!myContact.contains((contact))){
            myContact.add(contact);
            return true;
        }else{
            System.out.println("Contact listede mevcut: "+contact);
            return false;
        }
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        if(myContact.contains(oldContact)){
            myContact.set(myContact.indexOf(oldContact),newContact);
            return true;
        }else{
            System.out.println("Contact update yapılamadı: " +oldContact+" / "+newContact);
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(myContact.contains(contact)){
            myContact.remove(contact);
            return true;
        }else {
            System.out.println("Silinecek contact bulunamadı: "+contact);
            return false;
        }
    }
    public int findContact(Contact contact){

            return myContact.indexOf(contact);
    }
    public int findContact(String name){
        for(int i =0;i<myContact.size();i++){
            Contact contact = myContact.get(i);
            if(contact.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        int index = findContact(name);
        return myContact.get(index);

    }
    public void printContact(){
        for(Contact contact:myContact){
            System.out.println(contact);
        }
    }
}
