class whatever{
  public static void main(String[] args){
    Machine m1 = new Machine();
    Machine m2 = new Machine(){
      @Override public void start(){
        System.out.println("Anonymous Overriding!");
      }
    };
    Machine m3 = new Machine();
    m1.start();
    m2.start();
    m3.start();
  }
}
class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}