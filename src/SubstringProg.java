public class SubstringProg {
    public static void main(String[] args) {
        String s= "abcaabcdba";

        char[] c=s.toCharArray();
        for (int i=0;i<c.length;i++){
            int start=i;
            System.out.println("");
            for (int j=i;j<c.length;j++){
                int end=j;
                System.out.println(" ");
                for (int k=start;k<=end;k++){
                    System.out.print(c[k]+" ");
                }
            }
        }

//        for (char letter :
//                c) {
//            System.out.print(letter);
//        }
    }
}
