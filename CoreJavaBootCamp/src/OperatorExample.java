public class OperatorExample {
    public static void main(String[] args) {
        {
            int a = 60;

            int b = 20;

            System.out.println(a);
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % (b + 1));
        }
        {

            int a = 0b1000;
            int b = 0b1001;
            int c = -0b1001;

            System.out.println(a);
            System.out.println("Binary of a " + Integer.toBinaryString(a));

            System.out.println(b);
            System.out.println("Binary of b " + Integer.toBinaryString(b));

            System.out.println(c);
            System.out.println("Binary of c " + Integer.toBinaryString(c));

            System.out.println("Binary or " + Integer.toBinaryString(a | b));
            System.out.println("Binary and " + Integer.toBinaryString(a & b));
            System.out.println("Binary xor " + Integer.toBinaryString(a ^ b));
            System.out.println("Binary 2's complement " + Integer.toBinaryString(~a));


            System.out.println("Left Shift a by 2 digit Binary" + Integer.toBinaryString(a << 2));
            System.out.println("Left Shift a by 2 digit Decimal " + (a << 2));
            System.out.println("Left Shift c by 2 digit Binary" + Integer.toBinaryString(c << 2));
            System.out.println("Left Shift c by 2 digit Decimal " + (c << 2));

            System.out.println("Right shift a by 2 Binary " + Integer.toBinaryString(a >> 2));
            System.out.println("Right shift a by 2 Decimal " + (a >> 2));

            System.out.println("Right shift c by 2 Binary " + Integer.toBinaryString(c >> 2));
            System.out.println("Right shift c by 2 Decimal " + (c >> 2));

            System.out.println("Unsigned Right shift a by 2 Binary " + Integer.toBinaryString(a >>> 2));
            System.out.println("Unsigned Right shift a by 2 Decimal " + (a >>> 2));

            System.out.println("Unsigned Right shift c by 2 Binary " + Integer.toBinaryString(c >>> 2));
            System.out.println("Unsigned Right shift c by 2 Decimal " + (c >>> 2));
        }
    }
}
