import java.util.Scanner;
/* Summary in java(oop)
      create in 11/1/2022
 */
//EXERCISE NUM:5
public class Methods {
    public static void main(String[] args) {
        int []a=new int[5];
        insert(a);
        print(a);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
    public static void insert(int v[]){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<v.length;i++) {
            v[i]=in.nextInt();
        }
    }
}
