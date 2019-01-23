import java.io.*;
public class hw5{
	public static void main(String [] argv)throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("請選擇1.次方 2.階層 3.排列組合C 4.排列組合P");
	String g = br.readLine();
	int f = Integer.parseInt(g);
	switch(f){
	case 1 : {
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
		}break;
	case 2 : {
		System.out.println("請輸入n!的整數n : ");
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int a = n;
		long i;
		for(i=1;n>0;n--)
		{
			i*=n;
			}
		System.out.println("n="+a+"的階層其值="+i);
		}break;
	case 3 : {
		System.out.println("請輸入n值");
		String s1 = br.readLine();
		int n = Integer.parseInt(s1);
		int a = n;
		System.out.println("請輸入m值");
		String s2 = br.readLine();
		int m = Integer.parseInt(s2);
		int b = m;
		int c = a-b;
		long x,y,z;
		for(x=1;n>=1;n--)
		{
			x*=n;
		}
		for(y=1;m>=1;m--)
		{
			y*=m;
		}
		for(z=1;c>=1;c--)
		{
			z*=c;
		}
		System.out.print("C的"+a+"取"+b+"="+x/(y*z));
		}break;
	case 4 : {	
		System.out.println("請輸入n值");
		String s1 = br.readLine();
		int n = Integer.parseInt(s1);
		int a = n;
		System.out.println("請輸入m值");
		String s2 = br.readLine();
		int m = Integer.parseInt(s2);
		int b = m;
		long x,y;
		for(x=1;n>=1;n--)
		{
			x*=n;
		}
		int c = a-b;
		for(y=1;c>=1;c--)
		{
			y*=c;
		}
		System.out.print("P的"+a+"取"+b+"="+x/y);
		}break;
	}
	}
	}