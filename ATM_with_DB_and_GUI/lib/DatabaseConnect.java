package lib;

import java.sql.*;

public class DatabaseConnect {
    private static final String dBStatement = "select * from Bank";
    private static Connection connectionDB;

    public static void main(String[] args) throws SQLException {

        Connection connectionDB = DriverManager.getConnection(CreateDatabase.url);

        Statement statement = connectionDB.createStatement();

        ResultSet resultSet = statement.executeQuery(dBStatement);

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        int numOfCols = resultSetMetaData.getColumnCount();

        for (int i = 0; i<= 4; i++) {
            System.out.println("FASZ!");
//            System.out.format("%20s", resultSetMetaData.getColumnName(i) + " | ");
//                System.out.println(resultSetMetaData.getCatalogName(i) + "|");
        }
        while (resultSet.next()) {
            System.out.println("jaj");
            System.out.println("");
            for (int i=1; i<= numOfCols; i++) {
                System.out.println("!fasz");
                System.out.format("%20s", resultSet.getString(i) + " | ");
            }
//                    System.out.println("!!" + resultSet.getString(i) + "|");
        if (statement != null) statement.close();
        if (connectionDB != null) connectionDB.close();

        }
    }
}
