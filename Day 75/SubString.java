print all substring solution:
 
import java.util.Scanner;
class SubString{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		String str=in.next();
		 for(int start=0;start<str.length();start++){
			for(int end=start;end<str.length();end++){
				System.out.println(str.substring(start,end+1);
			}
		}
	}
}

for string "abcd"
we get 
a
ab
abc
abcd
b
bc
bcd
c
cd
d

import java.util.Scanner;
class SubString{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		String str=in.next();
		for(int len=1;len<=str.length();len++){
			 for(int start=0;start<=str.length()-len;start++){
				int end=start+len-1;
				System.out.println(str.substring(start,end+1);
			}
		}
	}
}


//Printing based on length of substring
for string "abcd"
a
b
c
d
ab
bc
cd
abc
bcd
abcd
