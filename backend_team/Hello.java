import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(10, 20, 5, 70, 23, 46);
    List<Integer> collect = list.stream().sorted((x, y) -> y - x).skip(1).limit(1).collect(Collectors.toList());
    System.out.println(collect);
    System.out.println("Hello World");
    System.out.println("Hello World");
  }
}