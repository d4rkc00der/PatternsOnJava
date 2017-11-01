package ObserverSubscriber;

/**
 * Created by shumakove on 30.10.17.
 */
public interface ElectricityConsumer {
    /**
     * This must be implemented all consumers(Tv,Lamp)
     * it used for notification when PowerSwitch is powered On
     */
    public void powerOn();
}
