public class FindMaximumElement{
  public static void main(String[] args) {
    int[] arr = {2,30,4,1,54,64,23,2};
    int max = 0;
    
    for(int i =0; i<arr.length; i++){
      if(arr[i]>max)
        max=arr[i];
    }
    System.out.println("The max number is: " + max);
  }
}