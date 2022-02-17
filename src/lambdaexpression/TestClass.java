package lambdaexpression;

public class TestClass {
    public static void main(String[] args) {
        MyFirstFunctionalInterface mfr;
        mfr = () -> "First Output from Lambda expression!";
        System.out.println("Output is :"+mfr.start());
    }
}
