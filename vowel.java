import java.util.*;
import java.io.*;
class A{
    int count=0;
    int vowel(int n, String s){
        StringBuilder str = new StringBuilder(s);
		int si = s.length();
		char[] arr = new char[si];
		str.getChars(0,si,arr,0);
        for(int i=1;i<si;i++){
            if((arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')&& (arr[i-1]!='a' || arr[i-1]!='e' || arr[i-1]!='i' || arr[i-1]!='o' || arr[i-1]!='u')){
                int count = count+1;
            }
        }
        return count;
        

    }
}
public class Test{
	public static void main(String[] args){
        A a = new A();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			String s = sc.next();
			a.vowel(n,s);
            System.out.println(count);
		}
		
	}

}
