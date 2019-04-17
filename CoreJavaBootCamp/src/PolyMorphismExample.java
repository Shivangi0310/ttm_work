import java.io.IOException;

public class PolyMorphismExample {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(1,2));

        a = new B();

        System.out.println(a.add(1,2));

        System.out.println(a.add(1f,2f));

    }
}

class A {

    public void method1() throws RuntimeException {

    }

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public float add(float a, float b) {
        return a+b;
    }

    public float add(float a, float b, float c) {
        return a+b+c;
    }
}

class B extends A {
    public int add(int a, int b) {
        System.out.println("Child Class Method");
        return super.add(a,b);
    }

    public void method1() throws IllegalArgumentException {

    }
}