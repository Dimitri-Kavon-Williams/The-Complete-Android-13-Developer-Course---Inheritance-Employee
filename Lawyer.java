package com.example.javacourse;

public class Lawyer extends Employee{

    public int getHours(){
        return 40;
    }

    public double getSalary(){
        return 4000.0;
    }

    public int getVacationDays(){
        return 10;
    }

    // Add this method only for lawyers
    public char getLawyerPosition(){
        return 'm';
    }

}
