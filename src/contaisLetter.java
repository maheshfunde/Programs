import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class contaisLetter {
    public static void main(String[] args) {

        List<Integer> list=List.of(2,4,21,65,62,85,69);
        System.out.println(list);
        List<Integer> listEven=new ArrayList<>();
        for (Integer i : list
        ){
            if (i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //using stream api

        Stream<Integer> stream=list.stream();
        List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);


    }
}
