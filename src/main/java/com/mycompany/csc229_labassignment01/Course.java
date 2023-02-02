package com.mycompany.csc229_labassignment01;

public class Course {
    private int ID;
    private String name;
    private String code;

//this is our default constructor
public Course(){}

//here we overload the constructor
public Course(int ID,String name, String code){
    this.ID = ID;
    this.name = name;
    this.code = code;
}
//starting from here is our getters and setters
public int getID(){
    return ID;
}
public void setID(int ID){
    this.ID = ID;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getCode(){
    return code;
}
public void setCode(String code){
    this.code = code;
}
}