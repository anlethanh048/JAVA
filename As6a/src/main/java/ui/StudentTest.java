package ui;

import data.Student;
import java.util.Scanner;

public class StudentTest {

    int max = 5;
    int count = 0;
    Student[] ds;

    public StudentTest() {
        ds = new Student[max];
    }

    public StudentTest(Student[] ds) {
        this.ds = ds;
    }

    public void add() {
        if (count == max) {
            System.out.println("Dữ liệu đầy!! từ chối thêm mới!");
            return;
        }
        Student c = new Student();
        c.input();
        ds[count] = c;
        count++;
    }

    public void display() {
        if (count == 0) {
            System.out.println("Hệ thông chư co dữ liệu!");
            return;
        }
        for (int i = 0; i < count; i++) {
            ds[i].print();
        }
    }

    public void display(int m) {
        if (count == 0) {
            System.out.println("hệ thông chưa có dữ liệu");
            return;
        }
        int cntm = 0;
        for (int i = 0; i < count; i++) {
            if (ds[i].getmidium() > m) {
                System.out.println(ds[i].toString());
                cntm++;
            }
        }
        if (cntm > 0) {
            System.out.println("Có" + cntm + "sinh viên có điểm trung bình lớn hơn" + m);
        } else {
            System.out.println("Không có sv nòa có điểm trung bình lớn hơn" + m);
        }
    }

    public void display(String ename) {
        if (count == 0) {
            System.out.println("hệ thông chưa có dữ liệu!!");
            return;
        }
        int cntname = 0;
        for (int i = 0; i < count; i++) {
            if (ds[i].name.toLowerCase().equalsIgnoreCase(ename)) {
                System.out.println(ds[i].toString());
                cntname++;
            }
            if (cntname > 0) {
                System.out.println("Có" + cntname + "sinh viên có tên chưa" + ename);
            } else {
                System.out.println("Không có sv nào có tên chứa" + ename);
            }
        }
    }

    public void menu() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("*******MENU********");
            System.out.println("1. Thêm mới một sinh viên");
            System.out.println("2. Hiển thị tất cả danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên có điểm TB lớn hơn giá trị tùy chọn");
            System.out.println("4. Tìm kiếm danh sách sinh theo tên");
            System.out.println("5. Thoát");
            System.out.println("\t Chọn chức năng [1-5]");
            String op = in.nextLine().trim();
            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    while (true) {
                        try {
                            System.out.println("Nhâp số điểm");
                            int m = Integer.parseInt(in.nextLine().trim());
                            display(m);
                            break;

                        } catch (Exception e) {
                            System.out.println("Lỗi: " + e.getMessage());
                        }
                    }

                case "4":
                    System.out.println("Nhập tên muốn tìm kiếm");
                    String ename = in.nextLine().trim();
                    display(ename);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhập sai chức năng");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        StudentTest c = new StudentTest();
        c.menu();

    }

}
