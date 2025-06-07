import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    //int[] arr = {1,2,34,5,5,6};
    int[] arr = {1,75,24,2,123};
    for(int i =0; i < arr.length/2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length -1-i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
