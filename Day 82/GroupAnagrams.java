import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> hm=new HashMap<>();
        List<List<String>> ls=new ArrayList<>();

        for(String word:strs){
            char[] charr=word.toCharArray();
            Arrays.sort(charr);

            String str=String.valueOf(charr);

            if(!hm.containsKey(str)){
                hm.put(str,new ArrayList<>());
            }
            hm.get(str).add(word);
        }
        ls.addAll(hm.values());

        return ls;
    }
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String arr[]={"tea","eat","tan","ate","nat","bat"};
        //String arr[]={""};
    List<List<String>> res=groupAnagrams(arr);
    for(int i=0;i<res.size();i++){
        System.out.println(res.get(i));
    }


    }
}
