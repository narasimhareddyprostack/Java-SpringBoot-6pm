public class Test{
    int a=100;
    public void m1(){
        System.out.println("method m1");
    }
    public static void main(String[] args){
       Test t1=new Test();
       t1.m1();
       System.out.println(t1.a);
    }

}