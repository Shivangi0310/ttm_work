package LambdaExpessions;

//Write the following a functional interface and implement it using lambda:
//
//(1) First number is greater than second number or not---- Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value ---- Parameter (int) Return int
//(3) Concatination of 2 string -----    Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return------  Parameter (String) Return (String)

@FunctionalInterface
interface Increment{
    int incrementNumber(int a);
    }

public class Exercise1b {
    public static void main(String[] args) {
        Increment increment= a -> a++;
        System.out.println(increment.incrementNumber(10));
    }

}
