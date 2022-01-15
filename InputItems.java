import java.util.Scanner;
/* Summary in java(oop)
      create in 11/1/2022
 */
//EXERCISE NUM:3
// In this program we will input some numbers and print them
public class InputItems {
    public static void main(String[] args) {
        System.out.println("Please enter any numbers:");
        int[] a=new int[5];
        Scanner in=new Scanner(System.in);
        int i;
        for(i = 0; i<a.length; i++){
            a[i]= in.nextInt();}

        for(i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
