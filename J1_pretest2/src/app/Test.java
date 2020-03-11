package app;

import data.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.menu();
            
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        String op = null;
        while (true) {
            System.out.println("======= MENU =======");
            System.out.println("1. Add a new cylinder");
            System.out.println("2. Display all cylinders");
            System.out.println("3. Display all cylinders having required volume");
            System.out.println("4. Exit");
            System.out.print("\tPlease choose [1-4]:");
            op = in.nextLine();
            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    try {
                        System.out.print("Input volume: ");
                        float v = Float.parseFloat(in.nextLine().trim());
                        display(v);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Wrong input!!!!");
                    break;
            }
        }
    }

    int max = 5;
    int next = 0;
    Cylinder[] cList = new Cylinder[max];

    void add() {
        if (max == next) {
            System.out.println("HT FULL!!! Khong the nhap lieu!!!");
            return;
        }
        Cylinder c = new Cylinder();
        c.accept();
        cList[next++] = c;
    }

    void display() {
        if (next == 0) {
            System.out.println("HT chua co du lieu !!!");
            return;
        }
        for (int i = 0; i < next; i++) {
            System.out.println(cList[i]);
        }
    }

    void display(float v) {
        if (next == 0) {
            System.out.println("HT chua co du lieu !!!");
            return;
        }
        int cntv = 0;
        for (int i = 0; i < next; i++) {
            if (cList[i].volume() >= v) {
                cList[i].printInfo();
                cntv++;
            }
        }
        if (cntv == 0) {
            System.out.println("Khong co hinh tru the tich > " + v);
        }
    }

}
