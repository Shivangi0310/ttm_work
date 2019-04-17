package LambdaExpessions;
//2. Create a functional interface whose method takes 2 integers and return one integer.

@FunctionalInterface
interface IntegerOperation{
    int performSomething(int a, int b);

}
public class Exercise2 {
    public static void main(String[] args) {
        IntegerOperation integerOperation= (a,b)-> a+b;
        System.out.println(integerOperation.performSomething(10,30));
    }

}
