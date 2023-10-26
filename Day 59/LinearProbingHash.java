import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinearProbingHash {
    public static void main(String[] args){
        LPHash lp=new LPHash();
        lp.put(12,"Hello");
        System.out.println(lp);
        lp.put(12,"Hi");
        lp.put(22,"HOW");
        lp.put(13,"WHY");
        System.out.println(lp.get(13));
        System.out.println(lp);
        System.out.println(lp.get(12));
        System.out.println(lp);
        System.out.println(lp.containsKey(22));
        System.out.println(lp.containsValue("Hi"));



    }
}
class LPHash{
private class Entry {
    private int key;
    private String value;
    public Entry(){
    }
    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}
    private Entry[] entries=new Entry[10];
    private int count=0;
    public void put(int key,String value){
        if(isFull())
            throw new IllegalStateException();

        var currEntry=new Entry(key, value);
        int index=hash(key);
        if(entries[index]!=null)
            entries[index].value=value;
        else{
            entries[index]=currEntry;
            count++;
        }
    }
    public int size(){
        return count;
    }
    private boolean isFull() {
        return count==entries.length;
    }
    private boolean isEmpty(){
        return count==0;
    }
   private int hash(int key){
        int index=key% entries.length;
        int start=0;
        while(entries[start] != null && start< entries.length ) {
            if ( entries[start].key == key)
                return start;
            start++;
        }
            while(entries[index]!=null){
                if ( entries[index].key == key)
                    return index;

                index=(index+1)% entries.length;
        }
            return index;
    }
    private Integer getIndex(int key){
        int index=key%entries.length;
        if(entries[index]==null)
            return index;
        if(entries[index].key==key)
            return index;
        int start=0;

        while(start<entries.length){
            if( entries[start]!=null && entries[start].key==key)
                return start;
            start++;
        }
        return -1;
    }
    public String get(int key){
        if(isEmpty())
            throw new IllegalStateException();
        int index=getIndex(key);
        if(index==-1 || entries[index]==null)
            throw new NoSuchElementException();
        return entries[index].value;
    }
    public boolean containsKey(int key){
        if(isEmpty())
            throw new IllegalStateException();
        int index=getIndex(key);
        if(  index==-1 || entries[index]==null )
            return false;
        return true;
    }
    public boolean containsValue(String valuer){
        if(isEmpty())
            throw new IllegalStateException();
        int start=0;
        while(start<entries.length){
            if(entries[start]!=null  && entries[start].value.equals(valuer)){
                return true;
            }
            start++;
        }
        return false;
    }
    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
    public void remove(int key){
        if(isEmpty())
            throw new IllegalStateException();
        int index=getIndex(key);
        if(entries[index]==null)
            throw new NoSuchElementException();

        entries[index]=null;
        count--;
    }
}
