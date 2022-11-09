import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;

    private static Logger logger = null;

    public Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        String time = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("[" + time + " " + num++ + "] " + msg);
    }


}
