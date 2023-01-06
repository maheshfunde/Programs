public class reverseVowels {

    public boolean isVowel(char c){
        return(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }


    public static void main(String[] args) {


        String s= "mahesh";
        char[] ar=s.toCharArray();
        int i=0;
        int j=s.length()-1;

        reverseVowels r1=new reverseVowels();

        while(i<j){

            if (r1.isVowel(ar[i]) && r1.isVowel(ar[j])){
                char temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
           else if (!r1.isVowel(ar[i])){
               i++;
            } else if (!r1.isVowel(ar[j])) {
               j--;
            }
        }
        System.out.println(ar);
    }
}
