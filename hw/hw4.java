import java.io.*;
public class hw4{
	public static void main(String [] argv)throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
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
	}
	}