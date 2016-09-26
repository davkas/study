package closure;

/**
 * Created by davkas on 2016/9/26.
 */
public class Callee2 extends MyIncrement{

    private int i = 0;

    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }

    public class Closure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }


    Incrementable getCallbackReference(){
        return  new Closure();
    }

}
