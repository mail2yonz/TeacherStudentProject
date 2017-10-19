/*
Yonatan Mengesha
Address Book Project
Java Boot camp
 */

package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //a String answere that askes the user for another input
        String answer="";
        //create a scanner object with the name keyboard
        Scanner keyboard= new Scanner (System.in);


        //Create an ArrayList of type person with the name pArrayList
        ArrayList<Person> pArrayList= new ArrayList<> ();


//do while loop to enter different persons
        do{
            //creating a person
            Person person= new Person ();
            Teacher teacher= new Teacher ();
            Student student= new Student ();



            //Askes the user for First name and accepts from the keyboard
            System.out.print ("Enter Persons First Name: " );
            String firstName= keyboard.nextLine ();
            person.setFirstName (firstName);


            //Askes the user for Last name and accepts from the keyboard
            System.out.print ("Enter Persons Last Name: " );
            person.setLastName ( keyboard.nextLine () );



            //Askes the user for Address  and accepts from the keyboard
//            System.out.print ("Enter the Persons Address: " );
//            person.setAddress ( keyboard.nextLine () );


            //Askes the user for Phone number  and accepts from the keyboard
            System.out.print ("Enter the Persons Phone number: " );
            person.setPhoneNumber ( keyboard.nextLine () );


            //Askes the user for Email  and accepts from the keyboard
            System.out.print ("Enter the Persons Email: " );
            person.setEmail ( keyboard.nextLine () );

            System.out.println ( );
            //  person.Display ();
            System.out.println ( );

            //Adds the newly created person in to the pArrayList
            pArrayList.add ( person );

            //Do while loop that validates it the response of the user is other than yes or no
            do{
                System.out.println ("Do you want to Enter another Person?(yes/no)" );
                answer= keyboard.nextLine ();
                if(!answer.equalsIgnoreCase ( "yes" )&&!answer.equalsIgnoreCase ( "no" )){
                    System.out.println ("Invalid entry please enter yes or no" );
                }

            }while(!answer.equalsIgnoreCase ( "yes" )&&!answer.equalsIgnoreCase ( "no" ));


            //Asks the user to enter another record or not and accepts from the keyboard

//            if(!answere.equalsIgnoreCase ( "yes" )||!answere.equalsIgnoreCase ( "no" ))
//            {
//                break;
//            }


        }while( answer.equalsIgnoreCase ("yes")&& !answer.equalsIgnoreCase ( "no" ));

        //For each loop to display the firstName of the 5 persons
        System.out.println ("             Address Book                 " );
        System.out.println ("==========================================" );
        for(Person person1:pArrayList)
        {
            System.out.println (person1.getFirstName () );
            System.out.println (person1.getLastName () );
            System.out.println (person1.getPhoneNumber () );
            System.out.println (person1.getEmail () );


            System.out.println ( );

        }

      //Searching for the a persons address

         //Askes the user for first name and accepts from the keyboard
        System.out.println ("Enter the First name of the Person you want to see information  of: " );
                String name= keyboard.nextLine ();

                //iterates in the arraylist using lambda expression and searches by firstname
         pArrayList.forEach ( item->{
         if( item.getFirstName ().equalsIgnoreCase ( name ))
         {
             System.out.println ("Address  of the Person you searched for is    ") ;
             System.out.println ("===============================================" );

             System.out.println ("Firstname: " +item.getFirstName () );
             System.out.println ("LastName: "+item.getLastName ());
             System.out.println ("PhoneNumber "+item.getPhoneNumber () );
             System.out.println ("Email: "+item.getEmail () );
             System.out.println ( );
         }else{
             System.out.println ("Invalid search entry" );

         }



      } );

          //Deleting an item from the list
//         pArrayList.forEach ( item->{
//
//             System.out.println ("Enter the first name of the person you want to delete the Address of :" );
//
//             String dName= keyboard.nextLine ();
//             if( item.getFirstName ().equalsIgnoreCase ( dName ))
//             {
//                 pArrayList.remove ( item );
//
//                 System.out.println (item.getFirstName ()+" Removed." );
//
//             }else{
//                 System.out.println ("Enter a valid input." );
//             }
//
//         } );

        Iterator<Person> personIterator =pArrayList.listIterator ();

        while(personIterator.hasNext ())
        {
                Person per= personIterator.next ();
            System.out.println ("Enter the first Name of the person you want to delete the Address of: " );

            String dname= keyboard.nextLine ();
                if( per.getFirstName ().equalsIgnoreCase ( dname ))
                {
                    personIterator.remove ();


                    System.out.println (dname +"  Deleted." );
                }else
                {
                    System.out.println ("Enter a correct First Name" );
                }
        }

        //Testing if the objects are deleted
           for(Person per:pArrayList)
           {
               System.out.println (per.getFirstName ());
           }


            System.out.println ( );



    }
}
