public class KadanesMaxSum {
    public static void main(String[] args) {
        int[] ar={-4,5,-9,8,3,7};
        int csum=0;
        int msum=0;

        for (int i=0;i<ar.length;i++){
            csum+=ar[i];
            if (csum<0)
                csum=0;
            if (csum>msum){
                msum=csum;
            }

        }
        System.out.println("max sum subarray is:"+msum);
    }
}
