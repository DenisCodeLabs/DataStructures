import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
  public static void main(String[] args) {
    ArrayList<String> book = new ArrayList<>();

    book.add("Java");
    book.add("C");
    book.add("Python");
    book.add("Javascript");
    System.out.println("Book ArrayList: " + book);
    Collections.reverse(book); // it does not sort anything, it simply flips the order
    System.out.println(book);
  } 
}