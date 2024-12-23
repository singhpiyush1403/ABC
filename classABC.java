public class classABC {
    int a =10;
    static int b= 30;
    public static void main(String args[]){
        classABC obj1= new classABC ();
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.a=200;
        obj1.b= 300;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.a= 2000;
        obj1.b= 3000;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

    }
}
