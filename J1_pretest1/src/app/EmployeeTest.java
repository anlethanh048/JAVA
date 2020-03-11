/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Scanner;
import data.*;
import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public class EmployeeTest {

    int max = 5;
    int next = 0;
    Employee[] eList = new Employee[max];

    public static void main(String[] args) {
        EmployeeTest test = new EmployeeTest();
        test.menu();
    }

    public void menu() {
        Scanner read = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("=== Chuong trinh quan ly nhan vien ===");
            System.out.println("Chon 1 trong nhung lua chon duoi.");
            System.out.println("1. Them nhan vien");
            System.out.println("2. In danh sach");
            System.out.println("3. Tim kiem nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Thoat chuong trinh");
            
            input = read.nextLine();
            switch (input) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.println("Nhap ten nguoi can tim: ");
                    String search = read.nextLine();
                    display(search);
                    break;
                case "4":
                    System.out.println("Nhap ma so nhan vien muon xoa: ");
                    String searchID = read.nextLine();
                    remove(searchID);
                    break;
                case "5": return;
            }
        }
    }

    public void add() {
        if (next == max) {
            System.out.println("Danh sach da day!");
        } else {
            Employee c = new Employee();
            c.accept();
            
            for (int i = 0; i < next; i++) {
                if (eList[i].id.equals(c.id)) {
                    System.out.println("ID da ton tai. Ko the them moi !!!");
                    return;
                }
            }
            
            eList[next++] = c;
        }
    }

    public void display() {
        if (next == 0) {
            System.out.println("Danh sach trong!");
        } else {
            for (int i = 0; i < next; i++) {
                eList[i].printInfo();
            }
        }
    }

    public void display(String eName) {
        if (next == 0) {
            System.out.println("Danh sach trong!");
        } else {
            int cnt = 0;
            for (int i = 0; i < next; i++) {
                if (eList[i].name.contains(eName)) {
                    eList[i].printInfo();
                    cnt++;
                }
            }
            if (cnt == 0) {
                System.out.println("khong tim thay nhan vien co ten " + eName);
            }
        }
    }

    public void remove(String eID) {
        if (next == 0) {
            System.out.println("Danh sach trong!");
        } else {
            for (int i = 0; i < next; i++) {
                if (eList[i].id.equals(eID)) {
                    for (int j = i; j < next - 1; j++) {
                        eList[j] = eList[j + 1];
                    }
                    next--;
                    System.out.println("Da xoa thanh cong");
                    return;
                }
            }
            System.out.println("khong tim thay nhan vien co ma so " + eID);
        }
    }

}
