import java.io.*;

public class hw11{
	public static void main (String[] argv)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("請輸入一串阿拉伯數字：");
    String change="";
    String Read = br.readLine();
		for(int i=Read.length()-1;i>=0;i--)
		{
			change =change+Read.charAt(i);
			}
    String[] ary = {"零", "一", "二", "三", "四", "五", "六","七", "八", "九"};
    String s1 = change;
    String s2 = "";
    for (int i = 0; i < s1.length(); i++)
    {
    	int x = Integer.parseInt(s1.substring(i, i+1));
    	s2 += ary[x];
    	}
    System.out.println("答案: " + s2);
		}
		}