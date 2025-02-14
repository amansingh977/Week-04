package exceptionpropogation;

public class ExceptionHandler {
    public static void method1() {
        System.out.println("Inside method1");
        int result = 10 / 0; // Throws ArithmeticException
    }

    public static void method2() {
        System.out.println("Inside method2");
        method1(); // Calls method1()
    }
}

