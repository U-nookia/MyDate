
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2016/10/5.
 */
public class MyDate {
    Long number;
    public MyDate() {
        number = 1472815684026L;
    }

    public MyDate(Long number) {
        this.number = number+1472815684026L;
    }

    public void Transformation(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = format.format(number);
        System.out.println(time);
    }

    public void addTime(Long num){
        number = number+num;
        Transformation();
    }

    public void reduceTime(Long num){
        number = number-num;
        Transformation();
    }

    public void addDay(){

        number = number+86400000L;
        Transformation();
    }

    public void reduceDay(){

        number = number-86400000L;
        Transformation();
    }

    public void timeChange(Long time1,Long time2){
        Long change;
        if (time1>time2){
            change = time1-time2;
        }else {
            change = time2-time1;
        }
        int day = (int) (change/86400000L);
        int hour = (int) (change%86400000L/1000/3600);
        int minute = (int) (change%86400000L%3600000/60000);
        int sec = (int) (change%86400000L%3600000%60000/1000);
        System.out.println("时差为"+day+"天"+hour+"时"+minute+"分"+sec+"秒");
    }

    public void compareWith(Long time){
        time = time+1472815684026L;
        Long change;
        if (number>time){
            change = number-time;
        }else {
            change = time-number;
        }
        int day = (int) (change/86400000L);
        int hour = (int) (change%86400000L/1000/3600);
        int minute = (int) (change%86400000L%3600000/60000);
        int sec = (int) (change%86400000L%3600000%60000/1000);
        System.out.println("时差为"+day+"天"+hour+"时"+minute+"分"+sec+"秒");
    }
}
