public class hw9{
	public static void main (String [] argv){
		hw homework1 = new hw();
		homework1.hw9method1();
		homework1.hw9method2();
		hw homework2 = new hw();
		homework2.hw9method2();
		homework2.hw9method1();
}
}
class hw{
	int x=10;
	void hw9method1(){
		x=x+5;
		System.out.println(""+x);		
}
  void hw9method2(){
  	x=x*6;
  	System.out.println(""+x);
}
}