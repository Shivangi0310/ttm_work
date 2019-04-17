public class ControlFlowStatement {
    public static void main(String[] args) {
        int a  = 5;
        if(a == 5) {
            System.out.println("Here");
        }

        if(a>5) {
            System.out.println("Here");
        } else {
            System.out.println("There");
        }

        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;
        }

        for(int i=0;i<5;i++) {
            System.out.println(i);
            break;
        }

        for(int i=0;i<5;i++) {
            System.out.println(i);
            continue;
        }

        int[] arr = new int[] {1,2,3,4,5};
        for(int b:arr) {
            System.out.println(b);
        }

        while (a<10) {
            System.out.println(a);
            a++;
        }
        a = 10;

        do {
            System.out.println(a);
            a++;
        } while (a<10);

    }
}
