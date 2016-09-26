package controlf;

/**
 * Created by davkas on 2016/9/26.
 */
public class GreenHouseController {

    public static void main(String[] args) {
        GreenHouseControlls gc = new GreenHouseControlls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if(args.length == 1){
            gc.addEvent(new GreenHouseControlls.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}
