package exceptionpropogation;
public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println("Inside main");
            ExceptionHandler.method2(); // Calls method2()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
