import java.io.*;
public class hw3{
	public static void main (String [] argv)
	throws IOException{
	BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
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
	}
	}