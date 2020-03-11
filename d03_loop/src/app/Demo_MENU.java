/*
Kiem thu cay truc vong lap while and do while
 */
package app;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Demo_MENU {
    public static void main(String[] args){
        Demo_MENU o = new Demo_MENU();
        o.menu();
    }
    // thiet ke menu thuc hien chuc nang cho phep chay chuong trinh
    void menu (){
        Scanner sc = new Scanner (System.in);
        String op ="";
        do {
            System.out.println("\n >> Menu<<");
            System.out.println("1. in bang cuu chung");
            System.out.println("2. In danh dach sinh vien[FOR-i]");
            System.out.println("3. in ds sinh vien [FOR-Each");
            System.out.println("4. Dung chung trinh");
            System.out.println(" Vui long chon chuc nang [1-4]");
            op = sc.nextLine();// cho phep user nhap va luu gia tri
            switch(op){
                case"1":
                    testFOR();
                    break;
                case"2":
                        inDS();
                    break;
                case"3":
                    inDS2();
                    break;
                case"4":
                    return;
                default:
                    System.out.println("chon sai chuc nang roi !!!");
            }
        }while(true);
    }
       void testFOR(){
        //chung trinh in ra bang cuu chuong N
           
        Scanner sc = new Scanner(System.in);
        int n=0;
        while(n<2 || n>9){
        System.out.print("vui lo1ng nhap mot so nguyen: ");
         n=sc.nextInt();
         if(n>=2 && n<=9){
             break;// thoat ra khoi vong lap- neu n la gia tri hop le
         }
            System.out.println("Gia tri khong hop le!!! vui long nhap lai");
        }
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
        System.out.println("\n>> bang danh sach sinh vien<<");
        for(String tenSV:ds){
            System.out.println(tenSV);
            
        }
    } 
}
