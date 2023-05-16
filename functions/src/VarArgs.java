import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun("Nouman","Choudhary",92,32,78);
    }
    static void fun(String name,String ch,int...v){
        System.out.println(Arrays.toString(v));
    }
}
