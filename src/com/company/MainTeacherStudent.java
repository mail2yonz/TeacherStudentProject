package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTeacherStudent {

    public static void main(String[] args)
    {
           ArrayList<Person> arrayPerson= new ArrayList<> (  );

           ArrayList<Course> arrayCourse= new ArrayList<> (  );

           Student student= new Student();
           String answer="";

        Scanner keyboard= new Scanner(System.in);
       // Student student = new Student();

        do{
            if(answer.equalsIgnoreCase ( "Teacher" ))
            {
                System.out.println ("Enter the First Name of the person: " );
                student.setFirstName ( keyboard.nextLine () );

                System.out.println ("Enter the Last Name of the person: " );
                student.setLastName ( keyboard.nextLine () );


                System.out.println ("Enter the email of the person: " );
                student.setEmail ( keyboard.nextLine() );

                System.out.println ("Enter the Phone number of the person: " );
                student.setPhoneNumber ( keyboard.nextLine () );
            }
            System.out.println ("Teacher or Student ?" );
            answer= keyboard.nextLine ();

        }while(answer.equalsIgnoreCase ( "Student" ));

        Teacher teacher= new Teacher();

        System.out.println ("Enter the First Name of the person: " );
        teacher.setFirstName ( keyboard.nextLine () );

        System.out.println ("Enter the Last Name of the person: " );
        teacher.setLastName ( keyboard.nextLine () );

        System.out.println ("Enter the email of the person: " );
        teacher.setEmail ( keyboard.nextLine() );

        System.out.println ("Enter the Phone number of the person: " );
        teacher.setPhoneNumber ( keyboard.nextLine () );




    }





    public ArrayList<Person> studentPerson() {
        ArrayList<Student> newstudent = new ArrayList<> ( );
        Student student= new Student();
        return null;

    }

    public ArrayList<Person> teacherPerson()
    {
           Teacher teacher= new Teacher();
           return null;
    }


}
