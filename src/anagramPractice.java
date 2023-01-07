public class anagramPractice {
    public static void main(String[] args) {
        String s1="abccba";
        String s2="abc";
        boolean isAnagram=true;

        char[] a=new char[256];
        char[] b=new char[256];

        for (char c :
                s1.toCharArray()) {
            int i = c;
            a[i]++;

        }
        for (char c :
                s2.toCharArray()) {
            int i = c;
            b[i]++;
        }

        for (int i=0;i<256;i++){
            if (a[i]!=b[i]){
               isAnagram=false;
               break;
            }
        }
        if (isAnagram){
            System.out.println("Strings are anagram");
        }else {
            System.out.println("String are not anagram");
        }


    }
}
