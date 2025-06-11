import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    
    Set<String> names = new HashSet<>();

    names.add("Walter");
    names.add("Jesse");
    names.add("Skyler");
    names.add("Mike");
    names.add("Saul");
    names.add("Saul");

    System.out.println(names.size());

    for(String name: names ){
      System.out.println(name);
    }
    System.out.println("======= Begin ForEach =======");
    names.forEach(System.out::println);
    System.out.println("======= End ForEach =======");
    Iterator <String> namesIterator = names.iterator();
    while (namesIterator.hasNext()) {
      System.out.println(namesIterator.next());
    }

    System.out.println(names);
    System.out.println(names.contains("Saul") || names.contains("saul"));
    names.clear();
    System.out.println("Before clear");
    System.out.println(names.isEmpty());

    List<Integer> numberList = new ArrayList<>();
    numberList.add(1);
    numberList.add(2);
    numberList.add(3);
    numberList.add(2);
    numberList.add(2);
    numberList.add(1);
    System.out.println(numberList);

    Set<Integer> numberSet = new HashSet<>();
    numberSet.addAll(numberList);
    System.out.println(numberSet);
  }
}