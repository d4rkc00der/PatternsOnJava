package ObserverSubscriber;

/**
 * Created by shumakove on 30.10.17.
 */
public class Tv implements ElectricityConsumer {
    @Override
    public void powerOn() {
        System.out.println("Tv " + this.toString() + " powered On");
    }
}
