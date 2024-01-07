public class wildCardPattern {

public static void replace(String str,int index){
    if(index==str.length()){
        System.out.println(str);
        return;
    }
    if(str.charAt(index)=='?'){
        replace(str.substring(0,index)+'0'+str.substring(index+1),index+1);
        replace(str.substring(0,index)+'1'+str.substring(index+1),index+1);
    }
    else{
        replace(str,index+1);
    }
}
    public static void main(String args[]){
    replace("1?00?010??1",0);

    }
}
