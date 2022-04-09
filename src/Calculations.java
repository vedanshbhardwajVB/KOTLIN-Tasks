public class Calculations {
    public static void main(String [] args){
        CalculationsKotlinKt.sayHelloFromKotlin();
        System.out.println(CalculationsKotlinKt.subtract(100, 50));
    }

    public static void sayHelloFromJava(){
        System.out.println("Hello Kotlin file - I'm from JAVA ");
    }

    public static String add(int a, int b){
        return ("Java file subtracting.... Answer is "+(a+b));
    }
}
