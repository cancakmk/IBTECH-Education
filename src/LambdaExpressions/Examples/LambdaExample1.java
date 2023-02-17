package LambdaExpressions.Examples;

public class LambdaExample1 {


    public static void main(String[] args) {
        FunInterface f=()-> System.out.println("Function without any argument and return type!iImplemented using lambda");
        f.funMethod();


    }







}
interface FunInterface{
    void funMethod();
}