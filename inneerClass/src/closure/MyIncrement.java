package closure;

/**
 * Created by davkas on 2016/9/26.
 */
public class MyIncrement {

    public void increment(){
        System.out.println("other operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }
}
