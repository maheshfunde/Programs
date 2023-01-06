public class printSubArrays {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int totalSubarrays=0;

        for (int i=0;i<numbers.length;i++){
            int start=i;
            System.out.println(" ");
            for (int j=i;j<numbers.length;j++){
                int end=j;
                for (int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                totalSubarrays++;
                System.out.println(" ");
            }
        }
        System.out.println("total subarrays:"+totalSubarrays);
    }
}
