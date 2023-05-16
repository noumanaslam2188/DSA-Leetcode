import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Count_Items {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ans=0;
        String rulekey="color";
        String keyvalue="silver";

        ArrayList<ArrayList<String>> items=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            items.add(new ArrayList<>());
        }
        System.out.println("Enter the list");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                items.get(i).add(input.next());

            }
            System.out.println(items);

        }
//
        if(rulekey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(keyvalue)) {
                    ans++;
                }
            }
        }
            else if(rulekey.equals("color")) {
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(1).equals(keyvalue)) {
                        ans++;
                    }
                }
            }
            else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(keyvalue)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
