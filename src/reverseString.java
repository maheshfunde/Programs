public class reverseString {

    static void reverse(char[] str, int index, int n)
    {
        if (index == n) // return if we reached at last index or at the end of the string
        {
            return;
        }
        char temp = str[index]; // storing each character starting from index 0 in function call stack;
        reverse(str, index + 1, n); // calling recursive function by increasing index everytime
        System.out.print(temp); // printing each stored character while recurring back

    }

    public static void main(String[] args) {
        char a[] = "Geeks for Geeks".toCharArray();
        int n = a.length;
        reverse(a, 0, n);
    }
}
