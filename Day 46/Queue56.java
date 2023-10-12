import java.util.*;
public class Queue56 {
    static void fiveSixSeries(int n){
        Queue<String> Qs=new ArrayDeque<>();
        Qs.add("5");
        Qs.add("6");
        for(int i=0;i<n;i++){
            String temp=Qs.poll();
            System.out.println(temp);
            Qs.add(temp+"5");
            Qs.add(temp+"6");
        }


    }
    public static void main(String[] args){
        fiveSixSeries(6);
    }
}
