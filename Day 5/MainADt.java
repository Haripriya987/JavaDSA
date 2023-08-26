
import java.util.*;
public class MainADT {
    public static void main(String[] args){
        DArray arr=new DArray();
        arr.add(234);
        arr.addFirst(456);
        arr.add(34);
        arr.add(67);
        arr.addAt(5,78);
        arr.print();
        int a[]={34,45,21,54,12};
        arr.intersect(a);
        arr.max();
        arr.min();
        arr.avg();
        arr.sortArray();
        arr.print();
        arr.subArray(3,4);

    }
}
class DArray{
   private  int[] items;
   private int count;
    DArray(){
        items=new int[10];
    }
    private void resize(){
        //full or not
        int newItems[];
        if(count==items.length){
            newItems =new int[count*2];
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            items=newItems;
        }

    }
   void add(int value){
        //full or not
        resize();
        items[count]=value;
        count++;
    }
     void addFirst(int value){
        resize();
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
                resize();

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
      void sortArray(){
        int[] temp=new int[count];
        for(int i=0;i<count;i++){
            temp[i]=items[i];
        }

        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        }
     void clear(){
        count=0;
        }
      void trimToSize(){

        items=Arrays.copyOf(items,count);
        }

        void subArray(int left,int right){

        if(left>=0 && left<right  && right<=count){
            System.out.println("subArray");
            int x=right-left;
            int[] sArray=new int[x];
            for(int i=0;i<x;i++) {
                sArray[i] = items[left + i];
            }

            for(int num:sArray){
                System.out.println(num+" ");
            }

        }
        else{
            System.out.println("subArray");
            System.out.println("Not possible to create subArray.Change left and right elements");

        }


        }
    }
