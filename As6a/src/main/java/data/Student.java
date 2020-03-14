
package data;

import java.util.Scanner;

public class Student {
    public String id,name;
    public boolean gender;
    public float theory,practice;

    public Student() {
    }

    public Student(String id, String name, boolean gender, float theory, float practice) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.theory = theory;
        this.practice = practice;
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Nhập mã số SV:");
                id = in.nextLine().trim();
                if(id.length()>0){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi:" + e.getMessage());
            }
        }
        while(true){
            try {
                System.out.println("Nhập tên SV:");
                name = in.nextLine().trim();
                if(name.length()>0){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi:" + e.getMessage());
            }
        }
        while(true){
            try {
                System.out.println("Nhập tên giới tính Nam/Nu:");
               String s = in.nextLine().trim().toLowerCase();
               if(s.equals("nam")||s.equals("nu")){
                    gender = s.equals("nam");
                   break; 
               }
             
            } catch (Exception e) {
                System.out.println("Lỗi:" + e.getMessage());
            }
        }
            while(true){
            System.out.println("Nhập theory [0-100]:");
            theory=in.nextFloat();
            if(theory>=0&&theory<=100){
                break;
            }
            System.out.println("Vui lòng nhập lại giá trị [0-100]");
        }
        //Nhập practice
        while(true){
            System.out.println("Nhập practice [0-100]:");
            practice=in.nextFloat();
            if(practice>=0&&practice<=100){
                break;
            }
            System.out.println("Vui lòng nhập lại giá trị [0-100]");
        }        
    }
    public void print(){
        System.out.println("ID:" + id);
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ (gender?"nam":"nu"));
        System.out.println("Theory: "+theory);
        System.out.println("Practice: "+ practice);
    }
    public float getmidium(){
        return (theory+practice)/2;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - .2%f - .2%f",id,name,(gender?"name":"nu"),theory,practice);
    }
    
    }
    

