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
public class CDtest {

    CD[] ds;
    int max, cnt;

    public CDtest() {

        max = 5;
        cnt = 0;
        ds = new CD[max];
    }

    public void add() {
        if (cnt == max) {
            System.out.println("Full data!! can not add more");
            return;
        }
        CD c = new CD();
        c.input();
        ds[cnt] = c;
        cnt++;

    }

    public void search(String cid) {
        CD c = new CD();
        if (cnt == 0) {
            System.out.println("No data yet");
            return;
        }
        int cntms = 0;
        for (int i = 0; i < cnt; i++) {
            if (cid.equals(ds[i].id)) {
                ds[i].print();
                cntms++;
            }
        }
        if (cntms > 0) {
            System.out.println("There are" + cntms + "CD found");
        } else {
            System.out.println("No found any CD has ID is" + cid);
        }
    }

    public void display() {
        if (cnt == 0) {
            System.out.println("No data yet");
            return;
        }
        for (int i = 0; i < cnt; i++) {
            ds[i].print();
        }
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        String option = "";
        CD c = new CD();
        while (true) {
            System.out.println("-----MENU------");
            System.out.println("1. Add one CD.");
            System.out.println("2. Display all CD.");
            System.out.println("3. Search and dispaly some CD by ID.");
            System.out.println("4. Exit.");
            System.out.println("pls choose [1-4]");
            option = in.nextLine().trim();
            switch (option) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.println("Enter cid");
                    String cid = in.nextLine().trim();
                    search(cid);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Error!!! Pls enter again");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        CDtest c =  new CDtest();
        c.menu();

    }

}
