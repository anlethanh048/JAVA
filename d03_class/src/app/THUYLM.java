/*
lop mo ta thong tin cua mot khach hang, bao gom thuoc tinh: ten , ma so , email, nam sinh , gioi tinh
phuong thuc su ly: nhap du lieu, xuat du lieu
 */
package app;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class THUYLM {
    // khai bao cac thuoc tinh
    public String id, name, email;
    public int yob;
    public boolean gener;
    // ham dung khong tham so

    public THUYLM() {
        id = "C00";
        name = "khach vang lai";
        email ="khong biet";
        yob = 2010;
        gener = true;
                
    } 
// ham dung chua tham so
    public THUYLM(String id, String name, String email, int yob, boolean gener) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.yob = yob;
        this.gener = gener;
    }
    
    
    // phuong thuc nhap thong tin khach hang
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma so: ");
        id = sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
        // nhap nam sinh[1900-2015]
        while(true){
            System.out.println("nhap nam sinh [1999-2015]:");
            yob = sc.nextInt();
            if (yob>1999 && yob <2015){
                break;
            }
            System.out.println("Nam sinh khong hop le vui long nhap lai!");
            
        }
      sc = new Scanner(System.in);
        //Nhap gioi tinh [nam/nu]
        while(true){
            System.out.print("Nhap goi tinh [nam/nu]: ");
            String s = sc.nextLine().trim().toLowerCase();
            if(s.equals("nam") || s.equals("nu")){
                gener = s.equals("nam");
                break;
            }
            System.out.println("Gioi tinh ko hop le. Vui long nhap lai !!!");
        }
        
         
    }
    public void display (){
  System.out.println("\n >> Thong ti chi tiet khach hang: ");
        
        System.out.println("Ma so: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Email: " + email);
        System.out.printf("Nam sinh: %d - Tuoi: %d\n ", yob, 2020-yob );
        System.out.printf("Gioi tinh: %s\n", gener? "nam":"nu");
    }
    
}

