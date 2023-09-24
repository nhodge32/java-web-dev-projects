package org.launchcode;

public class TemperatureException extends Throwable {
    // Write code here!
    public TemperatureException(String message) {
        super();
    }

    @Override
    public void printStackTrace() {
        System.out.println("Value is below absolute zero.");
    }
}
