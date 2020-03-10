/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Doctor {

    public String docNO, name, specification;
    public int exp_years, salary;

    public Doctor() {
    }

    public Doctor(String docNO, String name, String specification, int exp_years, int salary) {
        this.docNO = docNO;
        this.name = name;
        this.specification = specification;
        this.exp_years = exp_years;
        this.salary = salary;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter docNo:");
                docNO = in.nextLine().trim();
                if (docNO.length() <= 0) {
                    System.out.println("docNO is not null");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Name:");
                name = in.nextLine().trim();
                if (name.length() <= 0) {
                    System.out.println("Name is not null");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter specification:");
                specification = in.nextLine().trim();
                if (specification.length() <= 0) {
                    System.out.println("specification is not null");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Exp-years:");
                exp_years = Integer.parseInt(in.nextLine().trim());
                if (exp_years < 0) {
                    System.out.println("exp_years is not <0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Salary:");
                salary = Integer.parseInt(in.nextLine().trim());
                if (salary < 0) {
                    System.out.println("salary is not <0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void print() {
        System.out.println("docNo: " + docNO);
        System.out.println("Doctor's name: " + name);
        System.out.println("specification: " + specification);
        System.out.println("Exp_years: " + exp_years);
        System.out.println("Salary: " + salary);
    }

    public void print(String id) {
        String leves;
        if (id.equals(docNO)) {
            if (exp_years >= 15) {
                leves = "A";
            } else if (exp_years >= 10) {
                leves = "B";
            } else if (exp_years >= 5) {
                leves = "C";
            } else {
                leves = "D";
            }
            System.out.println("The doctor have id: " + docNO + "\n" + "Leves is:" + leves);
        } else {
            System.out.println("'Error' Not found");
        }
    }

    public void print(int days) {
        int allwance = 0;
        float incom;
        if (exp_years >= 15) {
            allwance = 1000;
        }
        if (exp_years >= 10) {
            allwance = 600;
        }
        if (exp_years >= 5) {
            allwance = 300;
        }
        if(exp_years<5){
            allwance =100;
        }
        incom = (salary*days)/24 + allwance;
        System.out.println("Total income: "+incom);

    }
}
