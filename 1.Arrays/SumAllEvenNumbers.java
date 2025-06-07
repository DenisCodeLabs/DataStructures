public class SumAllEvenNumbers {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int total = 0;

    for(int i = 0; i<arr.length; i++){
      if(arr[i]%2 == 0)
        total += arr[i];    
    }
    System.out.println("Total: " + total);
  } 
}