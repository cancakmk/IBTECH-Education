package LambdaExpressions.Examples;


public class LambdaExample3{
    public static void main(String[] args) {
        MyfunInterface2 m=s ->s.length();
        int len=m.findLength("Lambda");
        System.out.println(len);

    }
}
interface MyfunInterface2{
    int findLength(String s);
}