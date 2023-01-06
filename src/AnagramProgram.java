public class AnagramProgram {
    public static void main(String[] args) {
        String s1="cbal52k";
        String s2="cbal52k";
        boolean isAnagram=true;


        char[] a=new char[256];
        char b[]=new char[256];

        for (char c :
                s1.toCharArray()) {
            int i = (int) c;
            a[i]++;
        }
        for (char c :
                s2.toCharArray()) {
            int i = (int) c;
            b[i]++;
        }

        for (int i=0;i<256;i++){
            if (a[i]!=b[i]){
                isAnagram=false;
                break;
            }

        }
        if (isAnagram){
            System.out.println("is anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
