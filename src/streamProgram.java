import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamProgram {
    public static void main(String[] args) {
        Integer[] a={1,5,4,9,8,7};
        Integer[] b={1,6,9,3,2};

        Stream<Integer> fullList=Stream.concat(Arrays.asList(a).stream(),Arrays.asList(b).stream());

        List<Integer> l1=fullList.collect(Collectors.toList());
        System.out.println(l1);
        //unique elements
        System.out.println("unique elements");
        Set<Integer> unq = new HashSet<>(l1);
        System.out.println(unq);



    }
}
