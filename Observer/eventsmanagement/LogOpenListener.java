package Observer.eventsmanagement;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log.getName() + ": Someone has performed " + eventType + " operation with the file: " + file.getName());
    }
}
