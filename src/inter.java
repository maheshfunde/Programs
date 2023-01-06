import java.util.ArrayList;
import java.util.List;

public class inter {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(6);
        l1.add(9);

        l1.stream().forEach(a->System.out.println(a));
    }
}
