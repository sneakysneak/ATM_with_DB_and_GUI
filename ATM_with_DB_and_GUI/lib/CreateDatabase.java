package lib;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {
    static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    static String url = "jdbc:derby:dbtest1;create=true";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName(driver);
            Connection connectionDB = DriverManager.getConnection(url);

            String query = "CREATE TABLE Bank ( "
                    + "ID INT NOT NULL GENERATED ALWAYS AS IDENTITY, "
                    + "PRIMARY KEY (ID), "
                    + "Password INT NOT NULL, "
                    + "Balance INT NOT NULL,"
                    + "Overdraft INT NOT NULL)";

            connectionDB.createStatement().executeUpdate("CREATE TABLE BANK (ACCOUNTNO INT PRIMARY KEY, PASSWORD INT, BALANCE INT, OVERDRAFTLIMIT INT)");
            System.out.println("created table?");
//            connectionDB.createStatement().executeUpdate("INSERT INTO BANK VALUES(1,2,3000,100),(2,2,2000,300)");
            System.out.println("ppupulted table?");

//        statement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");


            System.out.println("kesz");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// connection.createStatement().execute("CREATE TABLE BANKACCOUNTS (ACCOUNTNO INT PRIMARY KEY, PASSWORD INT, BALANCE INT, OVERDRAFTLIMIT INT)");
//           connection.createStatement().execute("(INSERT INTO BANKACCOUNTS VALUES " +
//            "(2, 2, 2000, 100)," +
//            "(3, 2, 1000, 100)," +
//            "(4, 2, 3000, 100)," +
//            "(5, 2, 1600, 100), ");