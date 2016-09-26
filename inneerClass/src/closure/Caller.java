package closure;

/**
 * Created by davkas on 2016/9/26.
 */
public class Caller {

    private Incrementable callbackReference;

    Caller(Incrementable cbn){
        this.callbackReference = cbn;
    }

    void go(){
        callbackReference.increment();
    }
}
