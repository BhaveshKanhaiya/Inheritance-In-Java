package com.infogalaxy;

public class Result extends Student implements Sportssector{
    int per;
    void setPer() {
        System.out.println("Enter The Percentage :");
        per = sc.nextInt();
    }
    @Override
    public void calculate(){
        if(per < 35 && per > 30) {
            per = per + sperc;
        }
    }
    void showResult() {
        System.out.println("ID :" +id);
        System.out.println("Name :" +name);
        System.out.println("Percentage :" +per);
    }
}
