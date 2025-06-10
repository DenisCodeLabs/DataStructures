import java.util.HashMap;
import java.util.Map;

public class Principal {
  public static void main(String[] args) {
    Map<Integer,String> mapEmp = new HashMap<>();

    mapEmp.put(1223,"Hola Mundo");
    mapEmp.put(1224,"Hello world");
    mapEmp.put(1225,"Hi world");

    boolean isValueExist = mapEmp.containsValue("Hola Mundo");
    System.out.println(isValueExist);
    boolean isKeyExist = mapEmp.containsKey(1223);
    System.out.println(isKeyExist); 

    System.out.println(mapEmp.values());
    System.out.println(mapEmp.keySet());

    String nombre = mapEmp.get(1224);
    System.out.println(nombre);

    mapEmp.remove(1225);
    System.out.println(mapEmp.values());
  }  
}