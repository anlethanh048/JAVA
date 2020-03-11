package app;
// lớp con của Computer
import data.*;
import java.util.Scanner;
public class Desktop extends Computer{
    public boolean camera;
    
    @Override
    public void input() {
        super.input(); //gọi lại hàm input() cua lop cha computer
        
        // viet tiếp lệnh nhập camera
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap camera (co/khong): ");
        camera = sc.nextLine().trim().equalsIgnoreCase("co");
    }
    
    // hiện thị camera có hay không bên lớp cha TestComputer
    @Override
    public String toString(){
        String s=super.toString();
        return s + " - camera: "+(camera?"co":"khong");
    }
}
