//Programmer: Makealah Miller
//Class: CS &145
//Date: 05/30/2023
//Assignment: Lab 6 Binary Search Tree 
//Purpose: Manager class for the employee binary search tree directory. 

import java.util.*;

public class DirectoryManager //start of manager class
{
   private EmployeeInfo front = null;
   private Scanner input = new Scanner(System.in);

   protected void add(String[] employeeData) //method to add a new employee into the tree
   {      
      int id =Integer.parseInt(employeeData[0]);
      EmployeeInfo root; //declaring root 
      if (front == null) 
      {
         front = new EmployeeInfo(employeeData);
      }
      else
      {
         root = front; 
         do
         {
            if(id < root.getId())
            {
               if(root.left == null)
               {
                  root.left = new EmployeeInfo(employeeData); 
                  break; 
               }
               else
               {
                  root = root.left; 
               }
            }
            else if(id > root.getId())
            {  
               if(root.right == null) 
               {
                root.right = new EmployeeInfo(employeeData); 
                break; 
                
               }else
                {
                 root = root.right; 
                }
            }
         }
         while(root != null);
      }
   }//end of add 
   
    public void deleteEmployee(int id) //method to delete an employee from the tree
    { 
        EmployeeInfo curr = front;
        EmployeeInfo prev = null;
 
        while (curr != null && curr.getId() != id) 
        {
            prev = curr;
            if (id < curr.getId())
                curr = curr.left;
            else
                curr = curr.right;
        }
 
        if (curr == null) 
        {
            System.out.println("Employee ID " + id + " is not in the database.");
            return;
        }
 
        // Check if the node has a child
        if (curr.left == null || curr.right == null) 
        {
            // newCurr will replace the node we are deleting 
            EmployeeInfo newCurr;
 
            // if the left child does not exist.
            if (curr.left == null)
                newCurr = curr.right;
            else
                newCurr = curr.left;
 
            // checks if the node is the root
            if (prev == null)
            {
               this.front = newCurr;
               return;
            }

            // if the node is a previous node's child then it is replaced with new current
            if (curr == prev.left)
                prev.left = newCurr;
            else
                prev.right = newCurr;
        }
 
        // this is for if the node has two branches
        else 
        {
            EmployeeInfo p = null;
            EmployeeInfo temp;

            temp = curr.right;
            while (temp.left != null) 
            {
                p = temp;
                temp = temp.left;
            }
            if (p != null)
                p.left = temp.right;
            else
                curr.right = temp.right;
 
            curr.setId(temp.getId()); 
        }
    } //end deleteEmployee
   
   public void preOrderPrint() //start of preOrderPrint
   {  
      Stack<EmployeeInfo> treeStack = new Stack<EmployeeInfo>();
      EmployeeInfo root = this.front;  
      if(root == null) return; 
      while(root != null || treeStack.empty() == false)
      {
         if(root != null)
         {
            System.out.println(root.toString());
            treeStack.push(root);
            root = root.left; 
         }
         else
         {
            EmployeeInfo previousRoot = treeStack.pop(); 
            root = previousRoot.right; 
         }
      }
   } //end of preOrderPrint
   public void search(int id) //start of search
   {
      EmployeeInfo root = this.front; 
      // Traverse until root reaches to dead end
       while (root.getId() != -1234574321) //number assigned for an employee id that won't exist
       {
           if (id > root.getId())
               root = root.right;
 
           else if (id < root.getId())
               root = root.left;
           else
           {
               System.out.println(root.toString()); // if the employee is found, print it
               return;
           } 
       }
       System.out.println("The employee identification number you entered does not exist.");
   }//end of search
   
   public void edit(int id) //start of edit
   {
      Scanner input = new Scanner(System.in);
      EmployeeInfo root = this.front; 
      // Traverse until root reaches to dead end
       while (root.getId() != -1234574321) //number assigned for an employee id that won't exist
       {
           if (id > root.getId())
               root = root.right;
 
           else if (id < root.getId())
               root = root.left;
           else
           {
               System.out.println(root.toString());
               System.out.println("What would you like to edit about this employee?");
               System.out.println("1 - First Name | 2 - Last name | 3 - Street Address | 4 - City");
               System.out.println("5 - State | 6 - Zip Code | 7 - Phone number | 8 - E-Mail address");
               String answer = input.nextLine();
               if(answer.equals("1"))
               {
                  System.out.println("What is the new first name?");
                  String firstName = input.nextLine();
                  root.changeFirstName(firstName);
                  return;
               }
               else if(answer.equals("2"))
               {
                  System.out.println("What is the new last name?");
                  String lastName = input.nextLine();
                  root.changeLastName(lastName);
                  return;
               }
               else if(answer.equals("3"))
               {
                  System.out.println("What is the new street address?");
                  String address = input.nextLine();
                  root.changeAddress(address);
                  return;
               }
               else if(answer.equals("4"))
               {
                  System.out.println("What is the new city?");
                  String city = input.nextLine();
                  root.changeCity(city);
                  return;
               }
               else if(answer.equals("5"))
               {
                  System.out.println("What is the new state?");
                  String state = input.nextLine();
                  root.changeState(state);
                  return;
               }
               else if(answer.equals("6"))
               {
                  System.out.println("What is the new zip code?");
                  String zip = input.nextLine();
                  root.changeZip(zip);
                  return;
               }
               else if(answer.equals("7"))
               {
                  System.out.println("What is the new phone number?");
                  String number = input.nextLine();
                  root.changeNumber(number);
                  return;
               }
               else if(answer.equals("8"))
               {
                  System.out.println("What is the new E-Mail address?");
                  String email = input.nextLine();
                  root.changeEmail(email);
                  return;
               }
           } 
       }
       System.out.println("The employee identification number you entered does not exist.");
   }//end of edit 
}// end of DirectoryManager class