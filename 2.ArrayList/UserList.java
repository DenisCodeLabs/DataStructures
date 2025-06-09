import java.util.ArrayList;
import java.util.Scanner;

public class UserList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    String word;
    int r;
    boolean flag = true;
    
    while (flag){
      System.out.println("Add an Name: ");
      word = sc.nextLine();  
      
      if(word.equalsIgnoreCase("exit")){
        flag = false;  
        break;
      }
      names.add(word);
    }
    System.out.println("Are you need to remove anyone? yes/no");
    System.out.println(names);
    word = sc.nextLine();

    if(word.equalsIgnoreCase("yes")){
      System.out.println("Type the number in the List that you need to remove: ");
      r = sc.nextInt();
      names.remove(r);
      System.out.println("List after to remove: " + names);
    }
  }
}