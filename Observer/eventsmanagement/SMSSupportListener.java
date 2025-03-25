package Observer.eventsmanagement;

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "Event: " + eventType + " performed on file: " + file.getName();

        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: SMS message exceeds 160 characters. Please shorten the message.");
        } else {
            System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        }
    }
}
