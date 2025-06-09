import java.util.ArrayList;

public class Principal{
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    for(int i = 0; i<fruits.size(); i++){
      System.out.println(fruits.get(i));
    }
    System.out.println("===========");
    for(String fruit: fruits){
      System.out.println(fruit);
    }
  }
}