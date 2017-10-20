package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTeacherStudent {

    static ArrayList<Person> arrayPerson;
    static Teacher teacher;
    static Student student;
    static Person person;
    static Course studentCourse;
    static  ArrayList<Course> studentCourseList;
    static ArrayList<Course> teacherCourseList;

    public static void main(String[] args)
    {
           arrayPerson= new ArrayList<> (  );

           //arrayCourse= new ArrayList<> (  );


           String answer="";

        Scanner keyboard= new Scanner(System.in);
       // Student student = new Student();

        do{
                person= new Person();
                //student= new Student();

                System.out.println ("Enter the First Name of the person: " );
                person.setFirstName ( keyboard.nextLine () );

                System.out.println ("Enter the Last Name of the person: " );
                person.setLastName ( keyboard.nextLine () );


                System.out.println ("Enter the email of the person: " );
                person.setEmail ( keyboard.nextLine() );

                System.out.println ("Enter the Phone number of the person: " );
                person.setPhoneNumber ( keyboard.nextLine () );


            System.out.println ("Enter if the Person is a Teacher or Student ?" );
            person.setStatus (  keyboard.nextLine ());

            if(person.getStatus ().equalsIgnoreCase ( "Teacher" ))
            {

                Course course= new Course();
                 Teacher teacher= new Teacher();

                teacher.setCoursesTaught (  teacherCourse());

            }


            if(person.getStatus ().equalsIgnoreCase ( "Student" ))
            {
                student = new Student();
                student.setCoursesTaken (studentCourse () );

            }
                arrayPerson.add ( person );
            System.out.println ("Enter if you want to Add Another Person(Yes/No) " );
            answer=keyboard.nextLine ();


        }while(answer.equalsIgnoreCase ("yes"));


        System.out.println ("main method" );

           printing ();

    }





    public static ArrayList<Course> studentCourse() {
        studentCourseList = new ArrayList<> ( );

        Scanner keyboard;
        String answer;

        do{
            keyboard= new Scanner(System.in);
            studentCourse= new Course();
            System.out.println ("Enter the Course ID" );
            studentCourse.setCourseID (keyboard.nextLine ()  );

            System.out.println ("Enter the Course Name" );
            studentCourse.setCourseName ( keyboard.nextLine () );

            System.out.println ("Enter the credit hour" );
            studentCourse.setCreaditHour ( keyboard.nextLine () );

            studentCourseList.add ( studentCourse );


            System.out.println ("Do you want to Enter more courses?(Yes/No)" );

            answer= keyboard.nextLine ();
        }while(answer.equalsIgnoreCase ( "Yes" ));



        return studentCourseList;

    }

    public static ArrayList<Course> teacherCourse()
    {
            teacher= new Teacher();
           Scanner keyboard= new Scanner(System.in);
           teacherCourseList= new ArrayList<>();
           Course course;
           String answer;

           do{
               course= new Course();
               System.out.println ("Enter the Course ID" );
               course.setCourseID ( keyboard.nextLine () );

               System.out.println ("Enter the Course Name" );
               course.setCourseName ( keyboard.nextLine () );

               System.out.println ("Enter the Credit Hour of the Course" );
               course.setCreaditHour ( keyboard.nextLine () );

               teacherCourseList.add ( course );


               System.out.println ("Do you want to Enter more Courses?(Yes/No)" );
               answer=keyboard.nextLine ();
           }while(answer.equalsIgnoreCase ("yes"));


           return teacherCourseList;
    }
    public static void printing()
    {

        for(Person perList:arrayPerson )
       {

           System.out.println (perList.getFirstName ());
           System.out.println (perList.getLastName ());
           System.out.println (perList.getEmail () );
           System.out.println (perList.getPhoneNumber () );
           System.out.println (perList.getStatus () );
           if(perList.getStatus ().equalsIgnoreCase ( "Teacher" ))
           {
               for(Course cou:teacherCourseList)
               {
                   System.out.println (cou.getCourseName () );
                   System.out.println (cou.getCourseID () );
                   System.out.println (cou.getCreaditHour () );
               }
           }
           if(perList.getStatus ().equalsIgnoreCase ( "Student" )){
               for(Course cou:studentCourseList)
               {
                   System.out.println (cou.getCourseName () );
                   System.out.println (cou.getCourseID () );
                   System.out.println (cou.getCreaditHour () );
               }
           }
       }


    }


}
