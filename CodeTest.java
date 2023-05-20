package com.example.javacourse;

public class CodeTest {

    public static void main(String[] args){

        // Creation of objects
        Employee employee  = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();

        System.out.println(employee.getVacationDays());
        System.out.println(lawyer.getLawyerPosition());
        System.out.println(secretary.getVacationDays());
        System.out.println(legalSecretary.getVacationDays());
        System.out.println(marketer.insideMarket());
    }
}
