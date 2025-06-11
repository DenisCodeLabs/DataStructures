// Matematica de conjuntos con java 
// union, interseccion, diferencia

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjuntos {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<>(List.of("A","B","C"));
    Set<String> set2 = new HashSet<>(List.of("B","C","D"));

    // Interseccion
    Set<String> intersection = new HashSet<>(set1);

    intersection.retainAll(set2);
    System.out.println(intersection);

    // union
    Set<String> union = new HashSet<>(set1);
    union.addAll(set2);
    System.out.println(union);

    // diferencia
    Set<String> diferencia = new HashSet<>(set1);
    diferencia.removeAll(set2);
    System.out.println(diferencia);
  }
}