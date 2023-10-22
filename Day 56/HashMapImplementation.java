import java.util.LinkedList;

public class HashMapImplementation {
    public static void main(String[] args){
        HashTable ht=new HashTable();
        ht.put(32,"Hello");
        ht.put(12,"Hi");
        System.out.println(ht.get(12));
        ht.remove(12);
        System.out.println(ht.get(12));
        System.out.println(ht.containsKey(32));
    }

}
class HashTable{
    private class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
        private LinkedList<Entry>[] entries=new LinkedList[10];
        private int hash(int key){
            return key%entries.length;
        }
        public void put(int key,String value){
            int index=hash(key);
            if(isEmpty(index))
                entries[index]=new LinkedList<>();

            var bucket=entries[index];
            for(var entry:bucket){
                if(entry.key==key){
                    entry.value=value;
                    return;
                }
            }

            var entry=new Entry(key, value);
            entries[index].addLast(entry);
        }
        private boolean isEmpty(int index){
            return entries[index]==null;
        }
        public String get(int key){
            int index=hash(key);
            var bucket=entries[index];
            if(bucket!=null){
                for(var entry:bucket){
                    if(entry.key==key)
                        return entry.value;
                }
            }
            return null;
        }
        public void remove(int key){
            int index=hash(key);
            var bucket=entries[index];
            if(bucket!=null){
                for(var entry:bucket){
                    if(entry.key==key){
                        entries[index].remove(entry);
                        return;
                    }
                }
            }
        }
        public boolean containsKey(int key){
            int index=hash(key);
            var bucket=entries[index];
            if(bucket!=null){
                for(var entry:bucket) {
                    if (entry.key == key)
                        return true;
                }
                }
            return false;
        }

}
