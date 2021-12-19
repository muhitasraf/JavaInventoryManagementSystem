
package custompackage.pk;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class SQLConnection {
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String serverName = "jdbc:mysql://localhost:3306/";
        String dataBaseName = "hospital_data";
        Connection conn = (Connection)DriverManager.getConnection(""+serverName+""+dataBaseName+"", "root", "");
        return conn;    
    }
}
