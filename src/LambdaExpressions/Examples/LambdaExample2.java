package LambdaExpressions.Examples;

public class LambdaExample2{
    public static void main(String[] args) {
        MyfunInterface m=(a,b) ->System.out.println("The sum of a and b: "+(a+b));
        m.add(10,20);
    }
}
interface MyfunInterface{
    void add(int a,int b);
}