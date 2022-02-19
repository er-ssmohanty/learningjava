class hopss{
  public static void main(String[] args){
    Animal hop = new Animal();
    hop.eat();
    System.out.println(hop.legs);
  }
}
class Animal {
  protected static int legs;
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Dog extends Animal {
  Dog() {
    legs = 4;
  }
}
