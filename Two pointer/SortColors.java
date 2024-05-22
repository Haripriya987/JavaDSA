
public class SortColors {

  public static void sortedarr(int[] arr){
    int start=0;
    int end=arr.length-1;
    int current=0;
    while(current<=end){
      if(arr[current]==0){ 

        if(arr[start]!=0){
          int temp=arr[start];
          arr[start]=arr[current];
          arr[current]=temp;
        }
          current++;
          start++;

      }
      else if(arr[current]==1){
        current++;
      }
      else {
        if(arr[end]!=2){
        int temp=arr[end];
          arr[end]=arr[current];
          arr[current]=temp;
        }
          end--;

      }
    }

  }

  public static void main(String[] args) {
    int[] arr={1,0,2,0,1,2,0,0,2,1};
    sortedarr(arr);
    System.out.println("Hello");
    for(int x:arr){
      System.out.print(x+" ");
    }
    System.out.println();

  }
  
}
