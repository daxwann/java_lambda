package lambdas;

@FunctionalInterface
public interface MyFunctionalInterface {
  void printIt(String text);

  default public void printDefault(String text) {
    System.out.println("text");
  }

  static void printStatic(String text) {
    System.out.println(text);
  }
}
