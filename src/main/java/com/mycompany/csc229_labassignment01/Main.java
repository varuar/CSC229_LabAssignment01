package com.mycompany.csc229_labassignment01;

public class Main {

    public static void main(String[] args) {
 
        //here we instantiate the course class
        Course course = new Course();

        //now we need to call the setters
        course.setID(1);
        course.setName("Computer Science");
        course.setCode("CSC229");

        //now we call the getters
         System.out.println("ID: " + course.getID());
         System.out.println("Name: " + course.getName());
         System.out.println("Code: " + course.getCode());

    }

}