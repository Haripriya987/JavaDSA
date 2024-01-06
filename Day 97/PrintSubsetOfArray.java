import java.util.ArrayList;
import java.util.List;

public class PrintSubsetOfArray {

        public static ArrayList<ArrayList<Integer>> printSubSet(int arr[], int index) {
            if (arr.length == index) {
                ArrayList<ArrayList<Integer>> al = new ArrayList<>();
                al.add(new ArrayList<>());  // Add an empty subset
                return al;
            }

            ArrayList<ArrayList<Integer>> smaller = printSubSet(arr, index + 1);
            ArrayList<ArrayList<Integer>> al = new ArrayList<>();

            for (int i = 0; i < smaller.size(); i++) {
                al.add(new ArrayList<>(smaller.get(i)));  // Copy existing subsets
            }

            for (int j = 0; j < smaller.size(); j++) {
                ArrayList<Integer> subsetWithCurrentElement = new ArrayList<>(smaller.get(j));
                subsetWithCurrentElement.add(arr[index]);
                al.add(subsetWithCurrentElement);
            }

            return al;
        }

    public static void main(String[] args){
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> res=printSubSet(arr,0);
       // System.out.println(res);
        for(ArrayList<Integer> l:res){
            System.out.println(l);
        }
    }
}
