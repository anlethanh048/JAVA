/*

kiem thu tinh nang vong lap for
 */
package app;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Demo_FOR {
    public static void main(String[] args){
        Demo_FOR o =new Demo_FOR();
        o.testFOR();
       o.inDS();
       o.inDS2();
    }
    
    void testFOR(){
        //chung trinh in ra bang cuu chuong
        Scanner sc = new Scanner(System.in);
        System.out.print("vui long nhap mot so nguyen: ");
        int n=sc.nextInt();
        System.out.println("==bang cuu chung "+n+ "==");
        for (int i=0; i<10;i++){
            System.out.printf("%d*%d=%d:\n",n,i,n*i);
        }
        
    }
//Khai bao 1 mang chua danh sach ten cac sinh vien
    String[] ds =  {"Hung","Huy","Kim","Buu","Hung","An","Thu","Hoa"};
    void inDS(){
        System.err.println("\n >> Bang danh sach sinh vien << ");
        for (int i=0; i<ds.length; i++){
            System.out.printf("%s,  ",ds[i]);
        }
        System.out.printf("Tong cong %d sinh vien \n", ds.length);
    }
    void inDS2(){
        System.err.println("\n>> bang danh sach sinh vien<<");
        for(String tenSV:ds){
            System.out.println(tenSV);
            
        }
    }
}

