package SingletonDesignPattern;

public class SingletonDoubleCheck {
    private static SingletonDoubleCheck singletonDoubleCheck;
    private SingletonDoubleCheck()
    {

    }
    private static SingletonDoubleCheck returnInstance()
    {
        if(singletonDoubleCheck==null)
        {
            synchronized (SingletonDoubleCheck.class)
            {
                if (singletonDoubleCheck==null)
                    singletonDoubleCheck= new SingletonDoubleCheck();
            }
        }
        return singletonDoubleCheck;
    }

    public static void main(String[] args) {
        SingletonDoubleCheck singletonDoubleCheck1= SingletonDoubleCheck.returnInstance();
        System.out.println(singletonDoubleCheck1);
        System.out.println(singletonDoubleCheck);
    }
}
