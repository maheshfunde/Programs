import java.util.Arrays;

public class ShiftZero {
    public static void main(String[] args) {
        int[] a={0,5,0,4,0,7,8,0};
        //using two arrays
        int[] op=new int[a.length];
        int k=0;
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length;i++){

            if (a[i]>0){
                op[k]=a[i];
                k++;
            }

        }

        System.out.println("All zeroes at last of array");
        System.out.println(Arrays.toString(op));

        //using only one array

        int x=0;

        for (int c :
                a) {
            if (c > 0) {
                a[x] = c;
                x++;
            }
        }
            for (int i=x;i<a.length;i++){
                a[i]=0;
            }
            System.out.println(Arrays.toString(a));

    }
}
