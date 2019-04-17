package SingletonDesignPattern;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;
    private SingletonLazy()
    {

    }
    public static SingletonLazy returnInstance()
    {
        if(singletonLazy==null)
        {
            singletonLazy=new SingletonLazy();
        }
        return singletonLazy;
    }
    

    public static void main(String[] args) {
        SingletonLazy singletonLazy1= SingletonLazy.returnInstance();
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy);
    }
}