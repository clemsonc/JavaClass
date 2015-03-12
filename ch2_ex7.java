import java.util.*;
public class ch2_ex7 {

  public static void coinflip(int i) {

    Random rand = new Random(47);
    int j;
    for (j = 0; j < i; j++) {
      if (rand.nextInt(2) == 0)
        System.out.println("Head");
      else
        System.out.println("Tail");
    }
  }

  public static void main(String[] args) {
    int outcome;
    coinflip(10);
  }
}
