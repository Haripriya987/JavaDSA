import java.util.Arrays;
import java.util.HashSet;
public class UnionAndIntersectionElements {
  public static void unionN(int arr1[],int arr2[]) {
      int i = 0, j = 0;
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      System.out.print("Union Elements are :  ");
      while(i<arr1.length && j< arr2.length){
          if(arr1[i]==arr2[j]){
              System.out.print(arr1[i]+" ");
              i++;
              j++;
          } else if (arr1[i]>arr2[j]) {
              System.out.print(arr2[j]+" ");
              j++;
          }
          else{
              System.out.print(arr1[i]+" ");
              i++;

          }

      }
        System.out.println();

  }
    public static void intersectN(int arr1[],int arr2[]){
      System.out.print(" Intersection Elements are :  ");
        int i = 0, j = 0;
        for ( i = 0; i < arr1.length; i++) {

            for( j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+" ");
                }

            }
        }
        System.out.println();

    }
public static void main(String args[]){

    int arr1[]={1,3,5,7,23,56,68,31};
    int arr2[]={3,6,8,9,17,23,57,86,31};
    unionN(arr1,arr2);
    intersectN(arr1,arr2);
    HashSet<Integer> uset=new HashSet<Integer>();
    System.out.print("Intersection Elements are: ");
    for(int i=0;i<arr1.length;i++){
        if(!uset.contains(arr1[i]))
          uset.add(arr1[i]);
        else
            System.out.print(arr1[i]+" ");
    }
    for(int i=0;i<arr2.length;i++){
        if(!uset.contains(arr2[i]))
            uset.add(arr2[i]);
        else
            System.out.print(arr2[i]+" ");
    }
    System.out.println();
    System.out.print("Union Elements are : ");
    for(Integer y:uset)
        System.out.print(y+" ");

    }
}
