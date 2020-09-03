package lambdas;

public class LambdaExample2 {
  public static void main(String[] args){
    // Java lambda can implement interfaces with a single abstract method
    MyFunctionalInterface myFunctionalInterface = text -> System.out.println(text);

    myFunctionalInterface.printIt("hello");
    myFunctionalInterface.printDefault("default");
    MyFunctionalInterface.printStatic("static");
  }
}
