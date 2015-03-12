import java.util.*;

class Tank {
  float level;
}

public class ch2_ex2 {
  public static void main(String[] args) {
    Tank t1 = new Tank();
    Tank t2 = new Tank();
    t1.level = 9.2f;
    t2.level = 15.6f;
    System.out.println("1: t1.level: " + t1.level +
              ", t2.level: " + t2.level);
    t1 = t2;
    System.out.println("2: t1.level: " + t1.level +
              ", t2.level: " + t2.level);
    t1.level = 27.3f;
    System.out.println("3: t1.level: " + t1.level +
              ", t2.level: " + t2.level);
  }
}
