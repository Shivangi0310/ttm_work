package com;

public class AccessModifierExample {

    private int a;
    public int b;
    protected int c;
    int d;
}

class AccessModifierImpl extends AccessModifierExample {
    void method() {
        System.out.println(d);
    }

}
