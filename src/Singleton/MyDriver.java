package Singleton;

import java.util.Random;

/**
 * Created by shumakove on 30.10.17.
 */
public class MyDriver {

    private int processId;
    private static MyDriver myDriver;

    /**
     * Constructor of this driver is private
     * so nobody can create object by calling new MyDriver()
     */
    private  MyDriver() {
        processId = new Random().nextInt();
    }

    public int getProcessId() {
        return processId;
    }

    /**
     * All consumers of this driver can get instace of created driver
     * first of them, who called instance creates it.
     * Other consumers 2nd and .... just get allready created instance
     * @return MyDriver is instance of MyDriver
     */
    public static MyDriver getInstance() {
        if(myDriver==null) {
            System.out.println("Initializing new driver instance");
            myDriver = new MyDriver();
        }
        return myDriver;
    }
}
