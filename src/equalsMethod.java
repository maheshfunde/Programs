public class equalsMethod {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = new String("hello world");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}
