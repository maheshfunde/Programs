public class kadanesAlgoArray {
    public static void main(String[] args) {
        int[] numbers={-2,3,4,-1,-2,-3};
        int startIndex=0;
        int endIndex=0;

        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+",");



            currentSum=currentSum+numbers[i];

            if (currentSum<0){
                currentSum=0;
                startIndex=i;
            }

            maxSum=Math.max(currentSum,maxSum);
            endIndex=i;
        }
        System.out.println("");
        for (int i=startIndex+1;i<endIndex;i++){
            System.out.print(numbers[i]+"   ");
        }
        System.out.println("max sum is: "+maxSum);
    }
}
