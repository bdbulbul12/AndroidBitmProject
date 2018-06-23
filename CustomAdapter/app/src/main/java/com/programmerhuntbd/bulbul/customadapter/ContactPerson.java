package com.programmerhuntbd.bulbul.customadapter;

import java.util.ArrayList;

/**
 * Created by bulbul on 6/23/2018.
 */

public class ContactPerson {
    private String personName;
    private String phoneNumber;
    private int personImage;

    public ContactPerson(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public ContactPerson(String personName, String phoneNumber, int personImage) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.personImage = personImage;
    }

    public ContactPerson(){

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public ArrayList<ContactPerson> getAllPerson(){
        ArrayList<ContactPerson> person = new ArrayList<>();
        person.add(new ContactPerson("Bulbul Ahmed","01753155400"));
        person.add(new ContactPerson("Riad Ahmed","01753155400"));
        person.add(new ContactPerson("Tamin Ahmed","01753155400"));
        person.add(new ContactPerson("Sakib Ahmed","01753155400"));
        person.add(new ContactPerson("Saiful Ahmed","01753155400"));
        person.add(new ContactPerson("Musfiq Ahmed","01753155400"));
        person.add(new ContactPerson("Mortuza Ahmed","01753155400"));
        person.add(new ContactPerson("Kasem Ahmed","01753155400"));

        return person;
    }
}
