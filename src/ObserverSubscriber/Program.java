package ObserverSubscriber;


/**
 * Created by shumakove on 30.10.17.
 */
public class Program {

    public static void main(String[] args) {
        PowerSwitch powerSwitch = new PowerSwitch();
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        powerSwitch.connectNewDevice(lamp1);
        powerSwitch.connectNewDevice(lamp2);
        powerSwitch.connectNewDevice(tv1);
        powerSwitch.connectNewDevice(tv2);

        powerSwitch.switchOn();
    }


}
