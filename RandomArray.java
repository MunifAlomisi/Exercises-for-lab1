import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//create in 2022/1/20
//HomeWork lab2 Data structure

public class RandomArray {
     public static void main(String[] args) {
         int [] m=new int[5];
         int [] m2=new int[20];

         remove(m);


         remove(m2);

         for (int i = 0; i < m.length; i++) {
             System.out.println(m[i]);

         }

     }
     static boolean check(int [] array){
         boolean exist=true;
         for (int i = 0; i < array.length ; i++) {
             if(array[i]>-1){
                 exist=true;
                 break;}
             else
                 exist=false;}
         if(exist)
             return true;
             else
                 return false;}
    static void remove(int [] x){
         int numOfindex;

         while (check(x)){
             numOfindex=(int) (Math.random()*x.length);
             x[numOfindex]=-1;}

        System.out.println("done");

         }
     }
