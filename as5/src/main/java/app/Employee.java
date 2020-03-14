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
public class Employee {

    public String id, name, position;
    public int baseSalary;

    public Employee() {
    }

    public Employee(String id, String name, String position, int baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter ID:" + id);
                id = in.nextLine().trim();
                if (id.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Name: " + name);
                name = in.nextLine().trim();
                if (name.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter baseSalary: " + baseSalary);
                baseSalary = Integer.parseInt(in.nextLine().trim());
                if (baseSalary < 100 || baseSalary > 2000) {
                    System.out.println("baseSalary must be between 100 to 2000");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter position: " + position);
                position = in.nextLine().trim();
                if (position.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public void print(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Position: "+position);
        System.out.println("Basesalary: "+baseSalary);
    }
    
}
