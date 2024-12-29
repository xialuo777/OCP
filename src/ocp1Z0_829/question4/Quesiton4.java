package ocp1Z0_829.question4;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Quesiton4 {
    public static void main(String[] args) throws InterruptedException {
        Instant login = Instant.now();
        Thread.sleep(1000);
        Instant logout = Instant.now();
        login = login.truncatedTo(ChronoUnit.MINUTES);
        logout = logout.truncatedTo(ChronoUnit.MINUTES);
        if (login.isBefore(logout)) {
            System.out.println("log out at:" + logout);
        }else {
            System.out.println("can't logout");
        }
    }
}
