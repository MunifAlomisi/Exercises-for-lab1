import java.util.Arrays;

//create in 2022/1/20
//HomeWork lab2 Data structure


public class ReverseArrays {
    public static void main(String[] args) {
        int [] a ={10,20,30,40,50};

        System.out.println(Arrays.toString(a));
        System.out.println("After reverse");
        System.out.println(Arrays.toString(reverse(a)));
    }

        public static int[] reverse(int[] y)
        {
            int n=y.length-1;
            for (int i = 0; i <y.length/2 ; i++) {
                int t= y[i];
                y[i]= y[n];
                y[n]=t;
                n--;
            }
            return y;
        }

    }



