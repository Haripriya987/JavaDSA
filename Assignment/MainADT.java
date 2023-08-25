
import java.util.*;
public class MainADT {
    public static void main(String[] args){
        DArray arr=new DArray();
        arr.add(34);
        arr.add(48);
        arr.addFirst(45);
        arr.add(45);
        arr.addFirst(79);
        arr.print();
        System.out.println( arr.size());
        arr.removeLast();
        System.out.println(arr.count);
        arr.addAt(8,108);
        arr.addAt(1,90);
        arr.print();
        System.out.println( arr.size());
        int a[]={34,45,21,54,12};
        arr.intersect(a);
        arr.max();
        arr.min();
        arr.avg();

    }
}
class DArray{
    int[] items;
    int count;
    DArray(){
        items=new int[10];
    }
    void add(int value){
        //full or not
        int newItems[];
        if(count==items.length){
            newItems =new int[count*2];
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            items=newItems;
        }
        items[count]=value;
        count++;
    }
    void addFirst(int value){
        int newItems[];
        if(count==items.length){
            newItems =new int[count*2];
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            items=newItems;
        }
        count++;
        for(int i=count;i>=1;i--) {
            items[i] = items[i - 1];
        }

        items[0]=value;
    }
    void search(int element){
        int a=0;
        for(int i=0;i<count;i++){
            if(items[i]==element){
                a++;
                System.out.println("item is at : "+i+1);
            }
        }
        if(a==0)
            System.out.println("Element not found in array");
    }
    void atIndex(int index){
        if(count>=index)
            System.out.println("Element at this index is : "+items[index]);
        else
            System.out.println("Element does not exist at that Index");
    }


    void print(){
        System.out.print("[");
        for(int i=0;i< count;i++)
            System.out.print(items[i]+" ");
        System.out.print("]");

    }

    void removeLast(){
        count--;

    }

    void removeFirst(){
        for(int i=1;i<count;i--){
            items[i-1]=items[i];
        }
        count--;
    }
    int size(){
        return count;

    }
    void max(){
        int m=items[0];
        for(int i=0;i<count;i++)
            if(items[i]>m)
                m=items[i];

        System.out.println("Maximum element in an array is : "+m);
    }
    void min(){
        int m=items[0];
        for(int i=0;i<count;i++)
            if(items[i]<m)
                m=items[i];

        System.out.println("Minimum element in an array is : "+m);

    }
   void intersect(int arr[]){
        System.out.print("common elements are " +"[");
        for(int i=0;i<count;i++){
            int z=items[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==z)
                    System.out.print(z+" ");

            }
        }
        System.out.println("]");
   }
   void avg(){
        int sum=0;
        for(int i=0;i<count;i++)
            sum+=items[i];

        float avg=(float)sum/count;
        System.out.println(avg);

   }
    void addAt(int index,int n){
        int newI[];
            if(index>=count) {
                int diff = index - count;
                if (count == items.length) {
                    newI = new int[count * 2 + diff];
                    for (int i = 0; i < count; i++) {
                        newI[i] = items[i];
                    }
                    items = newI;
                }
                count += diff;
               items[index-1]=n;

            }
            else{
                count++;
            for(int i=count;i>index;i--)
                items[i] = items[i - 1];

            items[index]=n;

          }
        }
        void clear(){
        count=0;
        }
    }
