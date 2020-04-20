package com.prata;

class Student {
    String sName;
    int sRoll;
    String sClass;
    int sYear;

    Student(String sName,int sRoll,String sClass,int sYear){
        this.sName = sName;
        this.sRoll = sRoll;
        this.sClass = sClass;
        this.sYear = sYear;
    }

    public String getDetails(){
        return "Name :" + sName + "\n" + "sRoll : " + sRoll + "\n" + "Class Name : " + sClass + "\n";

    }
}

class SecondStudent extends Student {

    SecondStudent(String sName, int sRoll, String sClass, int sYear) {
        super(sName, sRoll, sClass, sYear);
    }
}

public class Inheritence{
    public static void main(String[] args){
        Student s1 = new Student("Pratap",100,"2nd class",1);
        System.out.print(s1.getDetails());

        SecondStudent s2 = new SecondStudent("Dummi",102,"0th class",1);
        System.out.println(s2.getDetails());
    }
}
