public class ArrayPrograms {
    public static void main(String[] args) {

        String s1="aabca";
        String s2="acabagh";

        int[] count=new int[256];

        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;

        }
        for (int i=0;i<256;i++) {
            if (count[i] != 0)
                System.out.println("not anagram");
        }

            System.out.println("is anagram");
            }
        }



