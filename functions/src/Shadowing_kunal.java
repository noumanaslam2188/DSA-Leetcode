public class Shadowing_kunal {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);

        int x=70;
        System.out.println(x);
    }
}
