package timeConvert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        //设置时区UTC
        sdf1.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //拿到Date对象
            Date date = sdf1.parse("2019-04-20T12:36:15Z");
            //输出格式：2017-01-22 09:28:33
            String str = sdf2.format(date);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
