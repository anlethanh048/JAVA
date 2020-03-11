/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


public class testmethod {
 void add(int...x){
    int tong =0;
    for(int i:x){
        tong +=i; }
    System.out.println("tong so:"+tong);
}
   
 void add(float x, float y){
  
     
 }
 void add(){
     System.out.println("Test ham không đối số");
 }
void add(float x, String s)  {
    
}  
    public static void main(String[] args) {
        testmethod o=new testmethod();
        o.add(20,10,20,20);
        o.add(50,30);
    }
    
}
