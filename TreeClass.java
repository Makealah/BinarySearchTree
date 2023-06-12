//Programmer: Makealah Miller
//Class: CS &145
//Date: 05/30/2023
//Assignment: Lab 6
//Purpose: Allows the user to add to, search, and delete individuals in a company
//database using a binary search tree.

import java.util.*;

public class TreeClass //start of TreeClass
{
   public static void main(String[] args) //start of main method
   {
      Scanner input = new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
      String menuInput;
      String address = "";
      String firstName = "";
      String lastName = "";
      String city = "";
      String state = "";
      String zip = "";
      String number = "";
      String email = "";
      int idNum;
      String id = "";
      
      DirectoryManager directory = new DirectoryManager();
      
      System.out.println("Hello! Thank you for using Borpo's Pizza Employee Directory.");
       
      do //start of do/while for menu
      {
        System.out.println("Please type a command.");
        System.out.println("1 - Add an employee");
        System.out.println("2 - Delete an employee");
        System.out.println("3 - View employee database");
        System.out.println("4 - Search for an employee");
        System.out.println("5 - Edit an employee");
        System.out.println("0 - Quit");
        menuInput = input.next();
        
        if(menuInput.equals("1")) //start of if/else to add contact
        {
           System.out.println("What is the employee's first name?");
           firstName = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's last name?");
           lastName = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's street address?");
           address = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's city of residence?");
           city = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's state of residence?");
           state = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's zip code?");
           zip = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's phone number?");
           number = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's email address?");
           email = scan.nextLine(); //takes input from user
           
           System.out.println("What is the employee's employee identification number?");
           System.out.println("Please enter numerical values only.");
           id = scan.nextLine(); //takes input from user
           idNum = Integer.parseInt(id); 
            
           String[] employeeData = {id, firstName, lastName, address, city, state,
           zip, number, email,};
           
           directory.add(employeeData);
          
        }
        else if(menuInput.equals("2"))
        {
           System.out.println("What is the identification number of the employee you'd like to delete?");
           id = scan.nextLine(); //takes input from user
           idNum = Integer.parseInt(id);
           directory.deleteEmployee(idNum);
           System.out.println("The employee data has been removed.");
        }
        else if(menuInput.equals("3"))
        {
           directory.preOrderPrint();
        }
        else if(menuInput.equals("4"))
        {
           System.out.println("What is the identification number of the employee you'd like to search for?");
           id = scan.nextLine(); //takes input from user
           idNum = Integer.parseInt(id);
           directory.search(idNum);
        }
        else if(menuInput.equals("5"))
        {
           System.out.println("What is the identification number of the employee you'd like to edit?");
           id = scan.nextLine(); //takes input from user
           idNum = Integer.parseInt(id);
           directory.edit(idNum);
        }
        else if(menuInput.equals("0"))
        {
           System.out.println("Thank you for using Borpo's Pizza Employee Directory.");
           System.out.println("Have an out of this world day!");
        } //end of if/else
     } //end of do/while
     while (!menuInput.equals("0")); 
     
   }
}