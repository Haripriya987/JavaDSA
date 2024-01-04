public class StairCase {
    public static int stairCase(int steps){
        if(steps<0)
            return 0;

        if(steps==0)
            return 1;

        return stairCase(steps-1)+stairCase(steps-2)+stairCase(steps-3);

    }
    public static void main(String[] args){
        System.out.println(stairCase(3));

    }
}
