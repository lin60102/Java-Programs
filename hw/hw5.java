import java.io.*;
public class hw5{
	public static void main(String [] argv)throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("�п��1.���� 2.���h 3.�ƦC�զXC 4.�ƦC�զXP");
	String g = br.readLine();
	int f = Integer.parseInt(g);
	switch(f){
	case 1 : {
		System.out.println("�п�J����a");
		String s1 = br.readLine();
		int a = Integer.parseInt(s1);
		System.out.println("�п�J����r");
		String s2 = br.readLine();
		int r = Integer.parseInt(s2);
		long ans=1;
		for(int i=1;i<=r;i++)
		ans=ans*a;
		System.out.print("����:"+a+"����:"+r+"����="+ans);
		}break;
	case 2 : {
		System.out.println("�п�Jn!�����n : ");
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int a = n;
		long i;
		for(i=1;n>0;n--)
		{
			i*=n;
			}
		System.out.println("n="+a+"�����h���="+i);
		}break;
	case 3 : {
		System.out.println("�п�Jn��");
		String s1 = br.readLine();
		int n = Integer.parseInt(s1);
		int a = n;
		System.out.println("�п�Jm��");
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
		System.out.print("C��"+a+"��"+b+"="+x/(y*z));
		}break;
	case 4 : {	
		System.out.println("�п�Jn��");
		String s1 = br.readLine();
		int n = Integer.parseInt(s1);
		int a = n;
		System.out.println("�п�Jm��");
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
		System.out.print("P��"+a+"��"+b+"="+x/y);
		}break;
	}
	}
	}