public class hw8{
	public static void main (String [] argv){
		hw homework = new hw();
		homework.hw8method();
}
}
class hw{
	void hw8method(){
		int [] x = {1,3,5,7,9};
		for (int i=0;i<x.length;i++)
		System.out.print(x[i]+" ");
		System.out.print("\n");
		for (int i=x.length-1;i>=0;i--)
		System.out.print(x[i]+" ");
		System.out.print("\n");
		for (int i=0;i<x.length;i++)
		System.out.print(x[i]*x[i]+" ");
		System.out.print("\n");
}
}