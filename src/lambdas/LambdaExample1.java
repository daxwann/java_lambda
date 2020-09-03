package lambdas;

import java.util.Comparator;

public class LambdaExample1 {
  public static void main(String[] args) {
    Comparator<String> stringComparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    };

    int result1 = stringComparator.compare("hello", "world");
    System.out.println(result1);

    Comparator<String> stringComparatorLambda = (s1, s2) -> s1.compareTo(s2);
    int result2 = stringComparatorLambda.compare("hello", "world");
    System.out.println(result2);

    MyInterface myLambda1 = (text1, text2) -> {
      System.out.println("Hello " + text1 + " " + text2);
      return "done";
    };

    MyInterface myLambda2 = (text1, text2) -> {
      System.out.println("Bye " + text1 + " " + text2);
      return "finished";
    };

    System.out.println(myLambda1.apply("world", "two"));
    System.out.println(myLambda2.apply("Texax", "Cali"));
  }
}
