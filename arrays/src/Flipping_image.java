//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Flipping_image {
//    public static void main(String[] args) {
//
//        int[][] result=flipAndInvertImage();
//
//
//
//
//
//        }
//    static int[][] flipAndInvertImage() {
//
//        Scanner input=new Scanner(System.in);
//
//        int[][] image=new int[3][];
//        System.out.println("Enter the input");
//
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                image[i][j]=input.nextInt();
//            }
//        }
//
//        int n = image.length;
//        for (int i = 0; i < n; i++) {
//            // Reverse the row horizontally
//            int left = 0, right = image[i].length - 1;
//            while (left < right) {
//                int temp = image[i][left];
//                image[i][left] = image[i][right];
//                image[i][right] = temp;
//                left++;
//                right--;
//            }
//            // Invert the values in the row
//            for (int j = 0; j < image[i].length; j++) {
//                image[i][j] ^= 1;
//            }
//        }
//        return image;
//    }
//
//
//}
//
