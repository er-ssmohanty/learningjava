class wer{
  public static void main(String[] args){
    B obj1 = new B();
    A obj2 = new A();
    B obj3 = new B();
    System.out.println(obj1.subsidy);
    System.out.println("\n");
    System.out.println(obj1.wer);
  }
}
class A{
  private int pushpa = 786;
  protected int subsidy = 450;
  double tau = 4.28;
  public A(){
    System.out.println("A");
  }
}
class B extends A{
  double wer;
  public B(){
    System.out.println("B");
    System.out.println(super.subsidy);
    System.out.println(super.tau);
    this.wer = super.tau;
  }
}