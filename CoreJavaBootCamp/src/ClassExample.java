public class ClassExample {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int b) {
        a = b;
    }

    public ClassExample() {

    }

    public ClassExample(int b) {
        a = b;
    }

    public ClassExample(ClassExample object) {
        a = object.a;
    }
}
