public class MaximumArray {
  public static void main(String[] args) {
    int[] arr = {14, 33, 15, 36, 78, 21, 43};
    int max = 0;
    
    for(int i = 0; i<arr.length; i++){

      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}