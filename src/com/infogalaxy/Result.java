package com.infogalaxy;

public class Result extends Internal {
        int per;
        int total;
        void setPer() {
            //System.out.println("Enter The Percentage :");
            //per = sc.nextInt();
            total = m1 + m2;
            per = total/2;
        }
        void getResult() {
            System.out.println("ID :" +id);
            System.out.println("Name :" +name);
            System.out.println("M1 Marks :" +m1);
            System.out.println("M2 Marks :" +m2);
            System.out.println("Total Marks :" +total);
            System.out.println("Percentage :" +per);
        }
    }
    class Main {
        public static void main(String [] args) {
            com.infogalaxy.Result result = new com.infogalaxy.Result();
            result.setStudent();
            result.setMarks();
            result.setPer();
            result.getResult();
        }
    }

