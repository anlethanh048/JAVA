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
public class CD {

    public String id, title, type;
    public int price, year;

    public CD() {
    }

    public CD(String id, String title, String type, int price, int year) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter ID");
                id = in.nextLine().trim();
                if (id.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Title");
                title = in.nextLine().trim();
                if (title.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Type");
                type = in.nextLine().trim();
                if (type.equalsIgnoreCase("Audio") || type.equalsIgnoreCase("Video")) {

                    break;
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }

        try {
            System.out.println("Enter Price");
            price = Integer.parseInt(in.nextLine().trim());

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        try {
            System.out.println("Enter Year");
            year = Integer.parseInt(in.nextLine().trim());

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Type: " + (type.equalsIgnoreCase("Audio") ? "Audio" : "video"));
        System.out.println("Price: " + price);
        System.out.println("year: " + year);
    }

}
