import java.util.*;
import java.io.*;


public class LongestWord {
    public static String LongestWord(String sen) {
            String res=sen.replaceAll("[^a-zA-Z0-9]"," ");
            String arr[]=res.split(" ");
            String value="";
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i].length()>max){
                    value=arr[i];
                    max=arr[i].length();
                }

            }

            return value;
        }

        public static void main (String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print(LongestWord(s.nextLine()));
        }

    }
