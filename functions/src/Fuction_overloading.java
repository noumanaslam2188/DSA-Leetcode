import javax.xml.namespace.QName;

public class Fuction_overloading {
    public static void main(String[] args) {

        fun(65);
        fun("Nouman",69);
    }
    static void fun(int a){
        System.out.println(a);

        }
    static void fun(String b,int c){
        System.out.println(b + c);
    }
}
