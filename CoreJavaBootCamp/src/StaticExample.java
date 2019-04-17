public class StaticExample {

    public static int a = 10;
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int multiplyByTwo(int a) {
        return a*2;
    }
}

class StaticExampleMain {
    public static void main(String[] args) {
        System.out.println(StaticExample.a);
        System.out.println(StaticExample.multiplyByTwo(5));
        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.getB());
        System.out.println(staticExample.a);
    }
}
