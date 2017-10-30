package ObserverSubscriber;

import java.util.ArrayList;

/**
 * Created by shumakove on 30.10.17.
 */
public class PowerSwitch {
    private ArrayList<ElectricityConsumer> consumers = new ArrayList<>();

    /**
     * Subscribe new Object, which implements ElectricityConsumer
     * interface
     * @param electricityConsumer
     */
    public void connectNewDevice(ElectricityConsumer electricityConsumer) {
        consumers.add(electricityConsumer);
    }

    /**
     * Notification method, which notifying all consumers by calling
     * method declared in Interface
     */

    public void switchOn() {

        System.out.println("PowerSwitch " + this.getClass().toString() + " powered on");

        for (ElectricityConsumer electricityConsumer:
             consumers) {
            electricityConsumer.powerOn();
        }
    }
}
