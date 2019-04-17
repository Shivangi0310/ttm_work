import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 5; //AutoBoxing
        int b = a; //Unboxing
        print(a); //Unboxing through method invoke

        List<Integer> list = new ArrayList<Integer>();

        list.add(4);

        int c = list.get(0);
        for(Integer i : list) {
            if(i%2 == 0) {
                System.out.println("Even");
            }
        }

    }

    static void print(int a) {
        System.out.println(a);
    }
}
