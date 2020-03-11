
package demo;

import java.util.Scanner;

public class Student {

   public String Name, id, batch;
   public int mark;

    public Student() {
        Name = "Ân";
        id = "002";
        batch = "t01";
        mark = 90;
    }
    

    public Student(String Name, String id, String batch, int mark) {
        this.Name = Name;
        this.id = id;
        this.batch = batch;
        this.mark = mark;
    }
    
   
void input(){
    Scanner SC = new Scanner(System.in);
    System.out.println("Nhap id:");
    id = SC.nextLine();
    System.out.println("Nhap Name:");
    Name = SC.nextLine();
    System.out.println("Nhap batch:");
    batch = SC.nextLine();
    System.out.println("Nhap Mark:");
    mark = SC.nextInt();
    
}
void output(){
    System.out.println("In ra thông tin sinh vien:");
    System.out.println("ID:"+id);
    System.out.println("Mane:"+Name);
    System.out.println("Batch:"+batch);
    System.out.println("Mark:"+mark);
}

}
