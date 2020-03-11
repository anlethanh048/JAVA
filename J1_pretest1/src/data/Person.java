/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author THUYLM
 */
import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public abstract class Person {

    public int yob;
    public String id, name;

    public Person() {

    }

    public void accept() {
        Scanner read = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap ID: ");
                id = read.nextLine().trim();
                if (id.isEmpty()) {
                    throw new DataFormatException("ID khong duoc de trong!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap ten: ");
                name = read.nextLine().trim();
                if (name.isEmpty()) {
                    throw new DataFormatException("Ten khong duoc de trong!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap nam sinh: ");
                yob = Integer.parseInt(read.nextLine().trim());
                if (yob < 1940 || yob > 2000) {
                    throw new DataFormatException("nam sinh phai trong khoang 1940-2000");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public abstract void printInfo();

}
