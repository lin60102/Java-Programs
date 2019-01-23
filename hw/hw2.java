import java.io.*;
public class hw2{
	public static void main (String [] argv)
	throws IOException{
	BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
	System.out.println("請輸入n!的整數n : ");
	String s = br.readLine();
	int n = Integer.parseInt(s);
	int a = n;
	long i;
	for(i=1;n>0;n--)
	{
	i*=n;
	}
	System.out.println("n="+a+"的階層"+"其值="+i);
	}
	}