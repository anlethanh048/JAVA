
package data;

import java.util.Scanner;

public class Computer {
    public String id, desc;
    public int price;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id=sc.nextLine().trim(); //trim : xóa vùng đệm thừa trước và sau
        System.out.print("Nhap mo ta: ");
        desc=sc.nextLine().trim();
        System.out.print("Nhap don gia: ");
        price=Integer.parseInt(sc.nextLine().trim());
    }
    
    @Override
    public String toString(){
        return String.format("%s - %s - %d", id,desc,price);
    }
}
