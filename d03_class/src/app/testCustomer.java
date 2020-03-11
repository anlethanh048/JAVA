/*
 * To change this license header, choose Lic2
ense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author LENOV
 */
public class testCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       THUYLM c1= new THUYLM();
         THUYLM c4= new THUYLM();
         THUYLM c3= new THUYLM( "c03", "Dung","dung@hotmail.con",2000,false);
       c1.accept();
       c1.display();
      c4.display();
       c3.display();
        
        // TODO code application logic here
    }
    
}
