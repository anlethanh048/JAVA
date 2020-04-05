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
public class DoctorTest {

    /**
     * @param args the command line arguments
     */
    public void menu() {
        Doctor c = new Doctor();
        String op = "";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n *=*=*MENU*=*=\n"
                    + "1. Doctor information\n"
                    + "2. Display doctor\n"
                    + "3. In leves\n"
                    + "4. Total incom\n"
                    + "5. Exit\n"
                    + "\t---Choose[1-5]---");

            op = in.nextLine().trim();
            switch (op) {
                case "1":
                    c.input();
                    break;
                case "2":
                    c.print();
                    break;
                case "3":

                    System.out.println("Enter ID:");
                    String id = in.nextLine().trim();
                    c.print(id);
                    break;
                case "4":
                    System.out.println("Enter days:");
                    int days = Integer.parseInt(in.nextLine().trim());
                    c.print(days);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Enter again");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        DoctorTest c = new DoctorTest();
        c.menu();
    }

}
