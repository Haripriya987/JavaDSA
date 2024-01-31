public class Building {
    public static int countBuildings(int h[], int n) {
        int max=h[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(max<h[i]){
                count++;
                max=h[i];
            }
        }
        return count;

    }
    public static void main(String[] args){
    int H[] = {7, 4, 8, 2, 9};
        System.out.println(countBuildings(H,H.length));

    }
}
