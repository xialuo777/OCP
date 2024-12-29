package pdfOcp.question80;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test implements AbilityA{

    public static void main(String[] args) throws SQLException {
        AbilityA test = new Test();
        test.action();
        DriverManager.getConnection("jdbc:derby://database.jdbc.com","J_SMITH", "dt12%2f3");

        DriverManager.getConnection("jdbc:derby:com");
    }

}
