// Remove the duplicates
import java.util.ArrayList;

public class Duplicates {
  public static void main(String[] args) {
    ArrayList<Integer> numb = new ArrayList<>();
    
    numb.add(1);
    numb.add(1);
    numb.add(2);
    numb.add(3);
    numb.add(4);
    numb.add(4);

    for(int i = 0; i<numb.size(); i++){
      for(int j = i+1; j<numb.size(); j++){
        if(numb.get(i).equals(numb.get(j))){
          numb.remove(j);
        }    
      }
    }
    System.out.println(numb);
  }
}