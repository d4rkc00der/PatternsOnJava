package Singleton;

/**
 * Created by shumakove on 30.10.17.
 */
public class Program {
    public static void main(String[] args) {


        //This is two consumers, which uses MyDriver  instance

        DriverConsumer consumer1 = new DriverConsumer();
        DriverConsumer consumer2 = new DriverConsumer();

        // This consumers has the same instance of driver
        System.out.println("Status of equality driver instance: " +
                consumer1.getDriver().equals(consumer2.getDriver()));

        // The same driver instance also has same processId property

        System.out.println("DriverConsumer " + consumer1.toString() +
                "has driver process Id:" + consumer1.getDriver().getProcessId());
        System.out.println("DriverConsumer " + consumer2.toString() +
                "has driver process Id:" + consumer2.getDriver().getProcessId());
    }
}
