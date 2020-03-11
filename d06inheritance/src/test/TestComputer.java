package test;
import app.*;
import data.*;
public class TestComputer {

    public static void main(String[] args) {
       app. Laptop c = new Laptop();// new app.Laptop
        c.input();
        
        app.Desktop d= new Desktop();
        d.input();
        
        System.out.println("Laptop : "+c);
        System.out.println("Desktop : "+d);
        
        Computer c1= new Laptop();
        c1.input(); // hàm input của lớp Laptop được gọi. Bởi vì tham chiếu đến laptop (đối tượng là computer)
        Computer c2 = new Desktop();
        c2.input();
        
        Computer[] ds = new Computer[10];
        ds[0]= new Laptop();
        ds[1]= new Computer();
        ds[2]= new Desktop();
     
    }
    
}
