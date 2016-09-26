package controlf;

/**
 * Created by davkas on 2016/9/26.
 */
public class GreenHouseControlls extends  Controller{

    private boolean light = false;
    public class LightOn extends Event{

        public LightOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is ON !";
        }
    }
    public class LightOff extends Event{

        public LightOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is OFF !";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event{

        public WaterOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Water is ON !";
        }
    }
    public class WaterOff extends Event{

        public WaterOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Water is OFF !";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event{

        public ThermostatNight(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "thermostat is on night !";
        }
    }
    public class ThermostatDay extends Event{

        public ThermostatDay(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "thermostat is on day !";
        }
    }

    public class Bell extends Event{

        public Bell(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event{
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList){
                addEvent(e);
            }
        }
        @Override
        public void action() {
            for(Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "restarting system!";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Terminating";  }
    }
}
