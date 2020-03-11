package app;

import java.util.*;
import data.*;

/*
Quan ly danh sach may tinh trong ArrayList bao gom chuc nang: them, duyet, tim kiem, xoa
*/
public class ComputerArrayList {
    ArrayList<computer> ds = new ArrayList<>();
    
    void addNewComputer() {
        
        computer c = new computer();
        c.input();

        //dua may tinh moi tao vo trong ArrayList ds
        ds.add(c);
    }
    
    void displayAll() {
        //kiem tra ds co du lieu ko ?
        if (ds.isEmpty()) {
            System.out.println("HT chua co du lieu");
            return;
        }

        //in ra tat ca cac may tinh hien dang co trong ds
        for (computer b : ds) {
            System.out.println(b);
        }
    }
    
    //tim kiem 1 mt theo mo ta
    void display(String mota) {
        //kiem tra ds co du lieu ko ?
        if (ds.isEmpty()) {
            System.out.println("HT chua co du lieu");
            return;
        }

        //in ra tat ca cac may tinh hien dang co mo ta nhu yeu cau trong ds
        int cntMota = 0;
        for (computer d : ds) {
            if (d.description.contains(mota)) {
                System.out.println(d);
                cntMota++;
            }
        } //kt vong lap FOR

        if (cntMota == 0) {
            System.out.println("Ko Tim Thay May Tinh co mo ta nhu yeu cau !!!");
        }
    }
    
    
    
    //ham xoa 1 may tinh theo ma so duoc cung cap
    void remove(String ms) {
        //kiem tra ds co du lieu ko ?
        if (ds.isEmpty()) {
            System.out.println("HT chua co du lieu");
            return;
        }

        //tim may tinh co ma so muon xoa trong ds
        int cntMS = 0;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).id.equals(ms)) {
                //tim thay roi, thi xoa may tinh ra khoi ds
                // còn câu lệnh xóa????????????????
                cntMS++;

                ds.remove(i);
                break;
            }
        }//kt vong lap FOR

        if (cntMS == 0) {
            System.out.println("Ko Tim Thay May Tinh co ma so muon xoa !!!");
        }else{
            System.out.println("Da xoa May Tinh co ma so " + ms);
        }
    }

   

}
