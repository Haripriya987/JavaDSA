package DynamicArray;

public class DynamicArray {
    private int[] arr;
    private int size=0;
    private int  nextElementIndex;
    public DynamicArray(){
        this.arr=new int[5];
        nextElementIndex=0;
        size=arr.length;
    }
    public DynamicArray(int s){
        this.arr=new int[s];
        nextElementIndex=0;
        size=s;
    }
    public void add(int value){
        if(nextElementIndex==size){
            doubleCapacity();
        }
        arr[nextElementIndex]=value;
        nextElementIndex++;

    }

    private void doubleCapacity(){
        size=this.arr.length*2;
        int[] newarr =new int[size];
        if (nextElementIndex >= 0) System.arraycopy(arr, 0, newarr, 0, nextElementIndex);
        this.arr=newarr;
    }

    public int getSize() {
        return nextElementIndex;
    }
    public void set(int index,int value){
        if(index<nextElementIndex){
            arr[index]=value;
        }
        else{
            System.out.println("Change the index ");
        }
    }

    public int getValue(int index){
        if(index>=nextElementIndex)
            //System.out.println("That may elements are not there in array");
        return -1;

        else
            return arr[index];
    }
    public void remove(int index){
        if(index>=nextElementIndex)
            return;

        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }

        nextElementIndex--;
    }
    public int removeLast(){
        if(nextElementIndex==0)
            return -1;
        int temp=arr[nextElementIndex-1];
        arr[nextElementIndex]=0;
        nextElementIndex--;

        return temp;
    }
}
