import java.util.HashSet;
public class UnionAndIntersectionElements {
public static void main(String args[]){

    int arr1[]={1,3,5,7,23,56,68,31};
    int arr2[]={3,6,8,9,17,23,57,86,31};
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
