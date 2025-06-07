//Leer 7 números por teclado para llenar un arreglo y a 
//continuación calcular el promedio de los números positivos, 
//el promedio de los negativos y contar el número de ceros.

public class Estadistico {
  public static void main(String[] args) {
    int[] arr = {1,2,-3,4,-5,6,0};
    int p=0,n=0,c=0;

    for(int i = 0; i< arr.length; i++){
      if(arr[i]>0){
        p++;
      }
      if(arr[i]<0){
        n++;
      }
      if(arr[i]==0){
        c++;
      }
    }
    System.out.println("El promedio de numeros positivos es: " + p + "/"+arr.length);
    System.out.println("El promedio de numeros negativos es: " + n + "/"+arr.length);
    System.out.println("El numero de ceros es: " + c);
  }
}