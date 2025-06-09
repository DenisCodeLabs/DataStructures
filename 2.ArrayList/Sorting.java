import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();

    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Mango");

    numbers.add("1");
    numbers.add("-2");
    numbers.add("4");
    numbers.add("3");

    System.out.println("Before Ascending Sort: " + fruits);
    Collections.sort(fruits);
    System.out.println("After Ascending Sort: " + fruits);
    System.out.println();
    System.out.println("Before Descending sort: " + fruits);
    Collections.sort(fruits,Collections.reverseOrder());
    System.out.println("After Descending Sort: " + fruits);

    //R

    /* 

    System.out.println("after Sorting: " + fruits);

    System.out.println("Before Sorting: " + numbers);
    Collections.sort(numbers);
    System.out.println("after Sorting: " + numbers);


    System.out.println("Before coping");
    Collections.copy(fruits, numbers);
    System.out.println("After Coping");
    System.out.println(fruits);
    System.out.println(numbers);

    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println(numbers);*/
  }
}