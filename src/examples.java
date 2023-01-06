import java.util.Arrays;

public class examples{
    public static void main(String[] args) {


        func f1 = () -> {
            return "this is method in functional interface";
        };

        System.out.println("val="+f1.getValue());
    }
}

