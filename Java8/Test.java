import java.util.*;
import java.util.stream.Collectors;

public class Test
{

    private static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main (String[] args)
    {

        List<String> list = Arrays.asList("bhoomi", "pooja");
        List<Integer> number = Arrays.asList(1, 2, 3, 4);
        list.forEach(i -> System.out.println(i));
        list.forEach(System.out::println);
        list.stream().map(name -> name.length()).forEach(System.out::println);
        number.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

    }

}

