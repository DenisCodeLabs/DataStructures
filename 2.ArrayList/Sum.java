//find the sum of all elements in the ArrayList
import java.util.ArrayList;

public class Sum {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    int total = 0;

    numbers.add(5);
    numbers.add(134);
    numbers.add(15);
    numbers.add(423);
    numbers.add(53);

    for(int i = 0; i<numbers.size(); i++){
      total += numbers.get(i);
    }
    System.out.println("Total: " + total);
  }  
}
