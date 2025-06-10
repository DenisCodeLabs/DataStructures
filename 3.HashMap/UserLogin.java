import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, String> users = new HashMap<>();
    String user,pass;

    System.out.println("Welcome, create a new account");
    
    System.out.println("User: ");
    user = sc.nextLine();

    System.out.println("Pass: ");
    pass = sc.nextLine();
    users.put(user, pass);

    for(Map.Entry<String, String> entry: users.entrySet() ){
      System.out.println("User: " + entry.getKey() + "| Pass: " + entry.getValue());
    }

    System.out.println("with lambdas");
  
    users.forEach((key, value) -> {
      System.out.println(key +", " + value);
    });
  }
}