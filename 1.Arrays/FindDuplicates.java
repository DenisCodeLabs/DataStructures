public class FindDuplicates {
  public static void main(String[] args) {
    int[] arr = {1,2,1,3,4,5,6,3};
    int temp;

    for(int i = 0; i<arr.length; i++){
      temp = arr[i];
      for(int j = i+1; j<arr.length; j++){
        if(temp == arr[j])
          System.out.println("El num: " +temp+ " se repite");
      }
    } 
  }
}