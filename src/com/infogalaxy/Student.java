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
class Internal extends Student {
    int m1;
    int m2;
    void setMarks() {
        System.out.println("Enter The M1 Marks :");
        m1 = sc.nextInt();
        System.out.println("Enter The M2 Marks :");
        m2 = sc.nextInt();
    }
}