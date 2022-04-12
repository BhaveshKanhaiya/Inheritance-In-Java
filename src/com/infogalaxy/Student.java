package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void setStudent(){
        System.out.println("Enter The ID :");
        id = sc.nextInt();
        System.out.println("Enter The Name :");
        name = sc.next();
    }
}
class Result extends Student {
    int per;
    void setPer() {
        System.out.println("Enter The Percentage :");
        per = sc.nextInt();
    }
    void getResult() {
        System.out.println("ID :" +id);
        System.out.println("Name :" +name);
        System.out.println("Percentage :" +per);
    }
}
class Main {
    public static void main(String [] args) {
        Result result = new Result();
        result.setStudent();
        result.setPer();
        result.getResult();
    }
}