public class TowersOfHanoi {
    public static void towersOfHanoi(int disks,char S,char A,char D){
        if(disks==0)
            return;

        towersOfHanoi(disks-1,S,D,A);
        System.out.println(disks+" " +S+"  ->  "+D);
        towersOfHanoi(disks-1,A,S,D);

    }
    public static void main(String[] args){
        int n=3;
        towersOfHanoi(n,'S','A','D');
    }

}
