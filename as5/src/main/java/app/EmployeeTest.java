/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EmployeeTest {

    ArrayList<Employee> eList = new ArrayList<>();

    public void add() {
        Employee c = new Employee();
        c.input();
        eList.add(c);
    }

    public void display() {

        if (eList.size() == 0) {
            System.out.println("System Do not have data");
            return;
        }
        for (int i = 0; i < eList.size(); i++) {
            eList.get(i).print();
        }
    }

    public void display(int amt) {
        if (eList.isEmpty()) {
            System.out.println("System Do not have data");
            return;
        }
        int cntamt = 0;
        for (int i = 0; i < eList.size(); i++) {
            if (eList.get(i).baseSalary > amt) {
                eList.get(i).print();
                cntamt++;
            }
        }
        if (cntamt > 0) {
            System.out.println("There are " + cntamt + "Employee found.");
        } else {
            System.out.println("Do not any employee found.");
        }
    }

    public void display(String ename) {
        if (eList.isEmpty()) {
            System.out.println("System do not have data");
            return;
        }
        int cntname = 0;
        for (int i = 0; i < eList.size(); i++) {
            if (eList.get(i).name.equals(ename)) {
                eList.get(i).print();
                cntname++;
            }
        }
        if (cntname > 0) {
            System.out.println("There are " + cntname + "Employee found.");
        } else {
            System.out.println("Do not any employee found.");
        }
    }

    public static void main(String[] args) {
        EmployeeTest o = new EmployeeTest();
        Scanner in = new Scanner(System.in);
        String op = "";
        while (true) {
            System.out.println("****** MENU ********");
            System.out.println("1. Add one employee.");
            System.out.println("2. Display all employee.");
            System.out.println("3. Look for employee by ID");
            System.out.println("4. Look for employee by name");
            System.out.println("5. Exit");
            System.out.println("--------Pls choose[1-5]-----------");
            op = in.nextLine().trim();
            switch (op) {
                case "1":
                    o.add();
                    break;
                case "2":
                    o.display();
                    break;
                case "3":
                    System.out.println("Enter salary to search");
                    int amt = Integer.parseInt(in.nextLine().trim());
                    o.display(amt);
                    break;
                case "4":
                    System.out.println("Enter name to search");
                    String ename = in.nextLine().trim();
                    o.display(ename);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Wrong!! pls reEnter.");
                    break;
            }
        }

    }

}
