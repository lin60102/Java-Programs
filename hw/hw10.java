class homework{
  private double PI =3.14;
  private int r =10;
  public void method(){
    double x = r*r*PI;
    System.out.println("¶ê­±¿n¬°"+" "+x);
  }
}

public class hw10{
  public static void main(String[] argv){
    homework Circle = new homework();
    Circle.method();
  }
}