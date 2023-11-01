import java.util.HashMap;
public class PairSumOfArray {
    public static void main(String args[]){
        int a[]={1,6,2,4,7,0,3,8};
        HashMap<Integer,int[]> mp=new HashMap<>();
        for(int i=0;i< a.length;i++){
            for(int j=i;j< a.length;j++){
                int sum=a[i]+a[j];
                if(mp.containsKey(sum)){
                    int temp[]=mp.get(sum);
                    System.out.print("{ "+a[i]+" , "+a[j]+" }  : ");
                    System.out.println("{ "+temp[0]+" , "+temp[1]+" }");
                }
                else{
                    int[] d={a[i],a[j]};
                    mp.put(sum,d);
                }
            }
        }
    }
}
