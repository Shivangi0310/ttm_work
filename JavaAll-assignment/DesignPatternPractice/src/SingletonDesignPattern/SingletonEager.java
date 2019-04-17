package SingletonDesignPattern;

public class SingletonEager {
    private static SingletonEager singletonEager= new SingletonEager();
    private SingletonEager()
    {

    }
    public static SingletonEager returnInstance()
    {
                  return singletonEager;
    }

    public static void main(String[] args) {
        SingletonEager singletonEager1= SingletonEager.returnInstance();
        System.out.println(singletonEager1);
        System.out.println(singletonEager);
    }
}
