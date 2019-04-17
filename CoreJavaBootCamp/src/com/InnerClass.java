package com;

public class InnerClass {
    private int a = 10;

    static int b = 10;

    class MemberInnerClass {
        public int getA() {
            return a;
        }
    }

    static class StaticInnerClass {
        public int getB() {
            return b * 5;
        }
    }

    public int multiplyByTwo() {
        return a * 2;
    }

    public int multiplyByFour() {
        class LocalInnerClass {
            int c;

            LocalInnerClass(int a) {
                c = a;
            }
            int multiply(int a) {
                return c*a;
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass(a);
        return localInnerClass.multiply(4);
    }

    public static void main(String[] args) {
        //Member Inner Class
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.new MemberInnerClass().getA());

        //Local InnerClass
        System.out.println(innerClass.multiplyByFour());

        //static inner class
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println(staticInnerClass.getB());


        //Anonymous Inner Class
        System.out.println(new InnerClass() {
            @Override
            public int multiplyByTwo() {
                System.out.println("Anonymous Inner Class");
                return super.multiplyByTwo();
            }
        }.multiplyByTwo());

    }
}
