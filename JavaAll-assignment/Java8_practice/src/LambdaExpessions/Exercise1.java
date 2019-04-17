package LambdaExpessions;
//Write the following a functional interface and implement it using lambda:
//
//(1) First number is greater than second number or not---- Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value ---- Parameter (int) Return int
//(3) Concatination of 2 string -----    Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return------  Parameter (String) Return (String)



@FunctionalInterface
interface Number{
    boolean greater(int a, int b);
}
public class Exercise1 {
    public static void main(String[] args) {
        Number number= (a,b)-> a>b;
        System.out.println(number.greater(10,20));
    }
}
