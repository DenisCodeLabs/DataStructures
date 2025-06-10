// Hashmaps only has duplicates in the values,
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicates {
  public static void main(String[] args) {
    Map<Integer,String> names = new HashMap<>();
    names.put(1,"Denis");
    names.put(2,"John");
    names.put(3,"John");
    names.put(4, "Alice");
    names.put(5,"Alice");

    Set<String> seen = new HashSet<>();
    Set<String> duplicates = new HashSet<>();

    for(String name: names.values()){
      if(!seen.add(name))
        duplicates.add(name);
    }
    System.out.println("Duplicates from names: " + duplicates);
  }
}