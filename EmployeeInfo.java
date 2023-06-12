//Programmer: Makealah Miller
//Class: CS &145
//Date: 05/30/2023
//Assignment: Lab 6 - Binary Search Tree Directory
//Purpose: This is the object class for the Binary Search Tree lab.

import java.util.*;

public class EmployeeInfo //start of EmployeeInfo class
{
   private String firstName;
   private String lastName;
   private String address;
   private String city;
   private String state;
   private String zip;
   private String number;
   private String email;
   private int id;
   
   protected EmployeeInfo right;
   protected EmployeeInfo left;
   
   public EmployeeInfo(String[] employeeData) //start of EmployeeInfo
   {
      this.id = Integer.parseInt(employeeData[0]);
      this.firstName = employeeData[1];
      this.lastName = employeeData[2]; 
      this.address = employeeData[3];
      this.city = employeeData[4];
      this.state = employeeData[5];
      this.zip = employeeData[6];      
      this.number = employeeData[7];
      this.email = employeeData[8];
      this.right = null;
      this.left = null;
   } //end of EmployeeInfo
   
   public int getId() //start of getId
   {
      return id;
   } //end of getId
   
   public void setId(int newId) //start of setId
   {
      this.id = newId; 
   } //end of setId
   
   public String toString() //start of toString
   {
      return(this.id + " " + this.firstName + " " + this.lastName + " " + this.address + " " +
      this.city + " " + this.state + " " + this.zip + " " + this.number + " " +
      this.email);
   } //end of toString
   
   public void changeFirstName(String newFirstName) //start of changeFirstName
   {
      this.firstName = newFirstName; 
   } //end of changeFirstName
   
   public void changeLastName(String newLastName) //start of changeLastName
   {
      this.lastName = newLastName; 
   } //end of changeLastName
   
   public void changeAddress(String newAddress) //start of changeAddress
   {
      this.address = newAddress; 
   } //end of changeAddress
   
   public void changeCity(String newCity) //start of changeCity
   {
      this.city = newCity; 
   } //end of changeCity
   
   public void changeState(String newState) //start of changeState
   {
      this.state = newState; 
   } //end of changeState
   
   public void changeZip(String newZip) //start of changeZip
   {
      this.zip = newZip; 
   } //end of changeZip
   
   public void changeEmail(String newEmail) //start of changeEmail
   {
      this.email = newEmail; 
   } //end of changeEmail
   
   public void changeNumber(String newNumber) //start of changeNumber
   {
      this.number = newNumber; 
   } //end of changeNumber
   
} // end of EmployeeInfo class