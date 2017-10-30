package Singleton;

/**
 * Created by shumakove on 30.10.17.
 */
public class DriverConsumer {
    private MyDriver driver;

    public DriverConsumer(){
        System.out.println("New consumer: " + this.toString() + " created");

        // Private property driver initialing by calling static method MyDriver.getInstance()
        driver = MyDriver.getInstance();
    }

    public MyDriver getDriver() {
        return driver;
    }
}
