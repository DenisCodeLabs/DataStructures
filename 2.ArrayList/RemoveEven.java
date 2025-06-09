//Create an ArrayList of integers from 1 to 10, then remove all even numbers 
// and print the result
import java.util.ArrayList;

public class RemoveEven {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    for(int i =1; i<=10; i++){
      if(i%2!=0)
        numbers.add(i);
    }
    System.out.println(numbers);
  } 
}