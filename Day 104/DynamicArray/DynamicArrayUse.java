package DynamicArray;

public class DynamicArrayUse {
    public static void main(String[] args){
        DynamicArray ad=new DynamicArray();
        for(int i=1;i<10;i++){
            ad.add(10+i);
        }
        System.out.println(ad.getSize());
        System.out.println(ad.getValue(3));
    }
}
