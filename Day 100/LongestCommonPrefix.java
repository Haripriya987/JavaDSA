public class LongestCommonPrefix {

    public static String returnPrefix(String str1,String str2){
        int i=0;
        int j=0;
        String res="";
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)!= str2.charAt(j)){
                return res;
            }
            res+=str1.charAt(i);
            i++;
            j++;
        }
        return res;
    }

    public static String commonPrefix(String arr[],int low,int high){
        if(low==high){
            return arr[low];
        }
            if(high>low){
                int mid=low+(high-low)/2;

                String s1=commonPrefix(arr,low,mid);
                String s2=commonPrefix(arr,mid+1,high);

                return returnPrefix(s1,s2);

            }

        return null;
    }
    public static void main(String args[]){
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        int n = arr.length;

        String ans = commonPrefix(arr, 0, n - 1);
        if(ans.length()!=0)
            System.out.println("The common prefix in words are : "+ ans);
            else
                System.out.println("There is no common prefix");



    }

}
