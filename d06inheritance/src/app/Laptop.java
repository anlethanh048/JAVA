/*
La lop con (sub class) cua lop Computer nam trong gói data
 */
package app;
import data.*;
import java.util.Scanner;
public class Laptop extends Computer {// data.computer 
//    void test(){
//        input();
//    }
    public float weight;

    @Override
    public void input() {
        super.input(); //gọi lại hàm input() cua lop cha computer
        
        // viet tiếp lệnh nhập trọng lượng
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap trong luong: ");
        weight = Float.parseFloat(sc.nextLine().trim());
    }
    @Override
    public String toString() {
        return super.toString() + " - trong luong: " + weight;
    }
}
