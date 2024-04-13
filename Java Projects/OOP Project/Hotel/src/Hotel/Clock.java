package Hotel;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {
    //Clock Method
    public void datetime(JTextField clock) {
        Thread datetiem = new Thread(){
            public void run(){
                try {
                    for (;;){
                        Calendar calendar = new GregorianCalendar();
                        int day = calendar.get(Calendar.DAY_OF_MONTH);
                        int month = calendar.get(Calendar.MONTH);
                        int year = calendar.get(Calendar.YEAR);

                        int second = calendar.get(Calendar.SECOND);
                        int min = calendar.get(Calendar.MINUTE);
                        int hour = calendar.get(Calendar.HOUR);
                        clock.setText("Time" + hour + ":"+ min + ":" + second + "  "+ "Date "+year+ "/"+ month + "/" +day);

                        sleep(1000);
                    }
                }catch (Exception e){

                }

            }
        };
        datetiem.start();

    }
}
