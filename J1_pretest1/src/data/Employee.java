/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import java.time.*;

/**
 *
 * @author THUYLM
 */
public class Employee extends Person {

    public int salary, workedDays;
    public String position;

    public Employee() {
    }

    @Override
    public void accept() {
        super.accept();
        Scanner read = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap luong: ");
                salary = Integer.parseInt(read.nextLine().trim());
                if (salary < 200 || salary > 10000) {
                    throw new NumberFormatException("Luong phai trong khoang 200-10000");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap ngay lam: ");
                workedDays = Integer.parseInt(read.nextLine().trim());
                if (workedDays < 0 || workedDays > 27) {
                    throw new NumberFormatException("So ngay lam phai trong khoang 0-27");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhap chuc vu: ");
        position = read.nextLine().trim();
    }

    @Override
    public void printInfo() {
        System.out.println("\nThong tin cua nhan vien.");
        System.out.println("Id: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + (Year.now().getValue()-yob));
        System.out.println("Luong: " + salary);
        System.out.println("So ngay lam: " + workedDays);
        System.out.println("Thu nhap: " + (salary*workedDays/26));
    }

    public String toString() {
        return "\nID: " + id + "\n" +
            "Ten: " + name + "\n" +
            "Tuoi: " + (Year.now().getValue()-yob) + "\n" +
            "Luong: " + salary + "\n" +
            "So ngay lam: " + workedDays + "\n" + 
            "Thu nhap: " + (salary*workedDays/26) + "\n";
    }
}
