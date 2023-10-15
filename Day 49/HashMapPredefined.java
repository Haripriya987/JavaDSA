import java.util.*;
public class HashMapPredefined {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"ONE");
        hm.put(2,"TWO");
        hm.put(3,"THREE");
        hm.put(null,"NULL");
        System.out.println(hm.get(2));
        System.out.println(hm.containsValue("NULL"));
        System.out.println(hm);
        hm.put(2,"two");
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.size());
        hm.remove(null);
        System.out.println(hm.entrySet());
    }
}
