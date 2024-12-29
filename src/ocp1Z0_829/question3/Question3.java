package ocp1Z0_829.question3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question3 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Chicago");
        ZonedDateTime  zdt = ZonedDateTime.of(
                LocalDate.of(2021, 11, 7),
                LocalTime.of(1, 30),
                zoneId
        );
        ZonedDateTime anHourLater = zdt.plusHours(1);
        System.out.println(zdt.getHour() == anHourLater.getHour());
        System.out.println(zdt.getHour());
        System.out.println(zdt.getOffset() == anHourLater.getOffset());
        System.out.println(zdt.getOffset()); //夏令时偏移量
        System.out.println(anHourLater.getOffset()); //标准时间偏移量

    }
}
