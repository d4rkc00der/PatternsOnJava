package ObserverSubscriber;

import org.w3c.dom.Element;

/**
 * Created by shumakove on 30.10.17.
 */
public class Lamp implements ElectricityConsumer {
    @Override
    public void powerOn() {
        System.out.println("Lamp " + this.toString() + " powered On");
    }
}
