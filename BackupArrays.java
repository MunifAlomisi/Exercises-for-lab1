import java.util.Arrays;

//create in 2022/1/20
//HomeWork lab2 Data structure

public class BackupArrays {
    public static void main(String[] args) {
        int [] x={2,4,6,8,10};
        System.out.println("Source Array");
        System.out.println(Arrays.toString(x));
        System.out.println("Backup Array ");
        System.out.println(Arrays.toString(backup(x)));
    }
    public static int[] backup(int[] source)
    {
        int[] backup=new int[source.length];
        for (int i = 0; i < source.length; i++)
            backup[i]=source[i];
            return backup;



    }
}
