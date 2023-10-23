import java.util.HashMap;
import java.util.Map;

public class RepetitiveElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 3, 8, 9, 3, 1, 7, 9, 5, 2, 6};//6 is repeated more no of times in this Array
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))
            hm.put(arr[i],1);
            else{
                int value=hm.get(arr[i]);
                hm.put(arr[i],value+1);
            }

        }RepetitiveElement
        int maxValue=0;
        int rele=0;
        for(Map.Entry<Integer,Integer>  entry:hm.entrySet()){
            Integer Key=entry.getKey();
            Integer Value= entry.getValue();
            if(maxValue<Value){
                maxValue=Value;
                rele=Key;
            }
        }
        System.out.println(rele);
    }
}
