import java.util.*;
public class firstNonRepeatingCharacter {
public static void main(String[] args){
    String str="skills speak more than words";
    System.out.println(firstNonRepeatingCharacter(str));
    firstNonRepeatingCharacters(str);
}
public static void firstNonRepeatingCharacters(String str){
    Map<Character,Integer> map=new HashMap<>();
    for(var ch:str.toCharArray()){
//       if(!map.containsKey(ch)){
//           map.put(ch,1);
//       }
//       else{
//           int count=map.get(ch);
//           map.put(ch,count+1);
//       }
        var count= map.getOrDefault(ch, 0);
        map.put(ch,count+1);
    }
    for (var c:str.toCharArray()){
        if(map.get(c)>1)
            System.out.println(c);
    }
}
    public static char firstNonRepeatingCharacter(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(var ch:str.toCharArray()){
       if(!map.containsKey(ch)){
           map.put(ch,1);
       }
       else{
           int count=map.get(ch);
           map.put(ch,count+1);
       }

        }
        for (var c:str.toCharArray()){
            if(map.get(c)==1)
                return c;
        }
         return Character.MIN_VALUE;
    }

}
