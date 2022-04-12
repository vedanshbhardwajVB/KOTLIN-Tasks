public class Calculations {
    public static void main(String [] args){
        CalculationsKotlin ckt = new CalculationsKotlin();
        ckt.sayHelloFromKotlin();
        ckt.subtract(50, 25);

//    CalculationsKotlin.sayHelloFromKotlin();
//    System.out.println(CalculationsKotlin.subtract(100, 50));
    }

    public static void sayHelloFromJava(){
        System.out.println("Hello Kotlin file - I'm from JAVA ");
    }

    public static String add(int a, int b){
        return ("Java file subtracting.... Answer is "+(a+b));
    }
}

