
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.L;

/**
 * Created by lenovo on 2016/9/23.
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        System.out.println("please input a Long number and press Enter,you will get a time:");
        Long inputNumber ;
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextLong();
        MyDate date = new MyDate(inputNumber);
        date.Transformation();
        date.addDay();
        date.reduceDay();
        date.compareWith(147428099+86400000L+56161221);
    }
}
