package pdfOcp.question120;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question120 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        d1.plusDays(1);
        d1 = d1.minusMonths(2);
        LocalDate d2 = d1.plusWeeks(3);
        d2.minusDays(4);
        d2 = null;
        for (int i = 0; i < 10; i++) {
            // 获取当前时间
            LocalDateTime now = LocalDateTime.now();

            // 获取当前时间的毫秒部分
            long millis = System.currentTimeMillis() % 1000;

            // 格式化时间，包括毫秒
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
            String formattedDateTime = now.format(formatter) + millis;
            System.out.println(formattedDateTime);
        }

    }
}
