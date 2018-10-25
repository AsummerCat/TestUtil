import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author cxc
 * @date 2018/10/25 16:31
 * java8 日期Api
 */
public class DateTimeUtils {

    public static void main(String[] args) {
        testLocalDateTime();
    }

    /**
     * 本地
     */
    private static void testLocalDateTime() {
        //核心
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("当前完整时间:" + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("当前年月:" + localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("当前时间:" + localTime);
        LocalTime localTime1 = localDateTime.toLocalTime().withNano(0);
        System.out.println("当前时间(去除毫秒):" + localTime1);


        int year = localDateTime.getYear();
        System.out.println("年:" + year);
        int month = localDateTime.getMonth().getValue();
        System.out.println("月:" + month);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("日->在月中的位置:" + dayOfMonth);
        int dayOfWeek = localDateTime.getDayOfWeek().getValue();
        System.out.println("日->在星期中的位置:" + dayOfWeek);
        int dayOfYear = localDate.getDayOfYear();
        System.out.println("日->在年中的位置:" + dayOfYear);

        LocalDate date3 = LocalDate.of(2014, Month.of(11), 12);
        System.out.println("设置时间点: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

        //转日期时间类型 比如    ..必须有日期+时间 不然会报错
        LocalDateTime parse = LocalDateTime.parse("2016-10-10 12:30:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("转日期时间类型" + parse);

        //转日期类型 也是  必须只有日期
        LocalDate parse1 = LocalDate.parse("2018-10-12", DateTimeFormatter.ISO_DATE);
        System.out.println("转日期类型" + parse1);


    }

}
