package LambdaExpressions.Examples;

public class LambdaExample4{
    public static void main(String[] args) {
        MyfunInterface3 m=a -> {
            int x=a+10;
            x=x/2;
            return x;
        };
        int op=m.doSomething(100);
        System.out.println(op);

    }
}
interface MyfunInterface3{
    int doSomething(int a);
}