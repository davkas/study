package controlf;

/**
 * Created by davkas on 2016/9/26.
 */
public abstract class Event {

    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >=  eventTime;
    }

    public abstract void action();

}
