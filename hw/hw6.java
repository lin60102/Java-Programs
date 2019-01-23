import java.io.*;
public class hw6{
	public static void main (String [] argv)
	throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	int h=1;
	while(h<3){
	System.out.println("請輸入你要的選項 1.菱形圖案 2.十字架圖案 3.結束 ");
	String s = br.readLine();
	int a = Integer.parseInt(s);
	switch (a){
		case 1 :{
			int i,j,k;
			for (k=1;k<=5;k++){
				for(i=5;i>=k;i--)
				System.out.print(" ");
				for(j=1;j<k*2;j++)
				System.out.print("*");
				System.out.println();
				}
			for (k=4;k>=1;k--){
				for (i=5;i>=k;i--)
				System.out.print(" ");
				for (j=1;j<k*2;j++)
				System.out.print("*");
				System.out.println();
				}
			break;
			}
		case 2 :{
			int i,j;
			for (i=1;i<=4;i++){
				System.out.println("     *     ");
				}
				System.out.println("***********");
			for (j=1;j<=4;j++){
				System.out.println("     *     ");
				}				
			break;
			}
		case 3 :{
			h=3;
			System.out.println("結束此程式!");
			break;
			}
	default:
	System.out.println("請輸入1~3!");
	}
	}
	}
	}