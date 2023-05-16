public class Reverse {
    public static void main(String[] args) {
        //Reverse the string

        String name="abcdcba";

        int i;
        int j=name.length()-1;

        for(i=0; i<j; i++) {
            for(j=name.length()-1; j>i; j--){

                if(name.charAt(i) != name.charAt(j)){
                    System.out.println("not palindrome");

                }


            }
        }



//        while (i<j){
//
//            if(name.charAt(i) != name.charAt(j)){
//                System.out.println("String is not palindrome");
//                System.exit(0);
//
//            }
//            i++;
//            j--;
//
//            {
//                System.out.println("String is palindrome");
//            }


       // }





    }
}
