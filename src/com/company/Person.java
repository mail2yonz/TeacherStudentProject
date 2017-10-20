/*
Yonatan Mengesha
Address Book Project
Java Boot camp
 */

package com.company;
//this is a person class
public class Person {

    //declaring the variables needed for the address
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;


    private String Status;

    //private Teacher teacher;

   // private Student student;

public Person()
{
//    Teacher teacher= new Teacher();
//    Course course= new Course();
//    Student student = new Student();
    System.out.println ("Person Created" );
}










    //Generating a setter getter method for the variables

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
