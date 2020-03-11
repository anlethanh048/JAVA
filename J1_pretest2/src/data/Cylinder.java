package data;

import java.util.Scanner;

public class Cylinder extends Shape implements IGeometry {

    public double radius, height;

    public Cylinder() {
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("\tNhap ban kinh: ");
                radius = Double.parseDouble(sc.nextLine().trim());
                if (radius < 0) {
                    throw new NumberFormatException("Ban kinh phai lon hon 0 !!! ");
                }
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("\tNhap chieu cao: ");
                height = Double.parseDouble(sc.nextLine().trim());
                if (height < 0) {
                    throw new NumberFormatException("Chieu cao phai lon hon 0 !!! ");
                }
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Ban kinh: " + radius);
        System.out.println("Chieu cao: " + height);
        System.out.printf("Dien tich hinh tru: %.2f\n", area());
        System.out.printf("The tich: %.2f\n\n" , volume());
    }

    @Override
    public double area() {
        double dtday = PI * radius * radius;
        double dtxq = height * peripheral();
        return dtxq + dtday * 2;
    }

    @Override
    public double peripheral() {
        return radius * 2 * PI;
    }

    @Override
    public double volume() {
        double dtday = PI * radius * radius;
        return dtday * height;
    }

    @Override
    public String toString() {
        return String.format("%7.2f, %7.2f, %12.2f, %12.2f", radius, height, area(), volume());
    }

}
