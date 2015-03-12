import java.util.*;

class Dog {
  String name;
  String says;
}

public class ch2_ex6 {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    Dog d2 = new Dog();

    d1.name = "Spot";
    d1.says = "Ruff!";
    d2 = d1;

    if (d1 == d2)
    {
      System.out.println("d1 and d2 is the same dog.");
    } else {
      System.out.println("d1 and d2 are not the same dog.");
    }
  }
}
