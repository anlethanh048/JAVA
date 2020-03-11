
package demo;

public class teststudent {

    public static void main(String[] args) {
    Student st = new Student();
    Student st2 = new Student("Minh Tam","SV2","007",99);
    teststudent o = new teststudent();
 //st.input();
 //st.output();
// st2.output();
 //o.add( 5,6);
 int x =20;
 int y = 14;
 o.add(x, y);
        System.out.printf("Sau phép cộng: x =%d, y =%d\n",x,y);
    }
        void add(int x, int y){
        int kq = x+y;
        System.out.printf("%d+%d = %d\n",x,y,kq);
        x=x*2;
        y= y+10; 
    }
}
