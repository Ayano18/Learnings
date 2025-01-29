import java.time.LocalTime;
import java.util.Scanner;

interface Alarm {
    void setAlarm(String time);

    void showAlarm();
}

abstract class Weekday implements Alarm {
}

public class Monday extends Weekday {
    private String alarmTime;

    @Override
    public void setAlarm(String time) {
        this.alarmTime = time;
    }

    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(alarmTime);
        LocalTime now = LocalTime.now();

        if (alarm.isAfter(now)) {
            System.out.println("Gumising ka mamaya tamad!");
        } else {
            System.out.println("naka set na, gumising ka bukas tamad!");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Monday monday = new Monday();

        System.out.print("Enter the time for the alarm (HH:MM): ");
        String time = s.nextLine();
        monday.setAlarm(time);
        monday.showAlarm();

        s.close();
    }
}
