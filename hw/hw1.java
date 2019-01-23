import java.io.*;
public class hw1{
	public static void main (String [] argv)
	throws IOException{
	BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
	System.out.println("請輸入底數a");
	String s1 = br.readLine();
	int a = Integer.parseInt(s1);
	System.out.println("請輸入指數r");
	String s2 = br.readLine();
	int r = Integer.parseInt(s2);
	long ans=1;
	for(int i=1;i<=r;i++)
	ans=ans*a;
	System.out.print("底數:"+a+"指數:"+r+"答案="+ans);
	}
	}