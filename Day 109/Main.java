
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/DBNAME";
        String user = "root";
        String password = "Demo";
        Connection con = null;

        try {

            con = DriverManager.getConnection(url, user, password);

            // Execute a query
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            // Process the result set
            while (rs.next()) {
                int studentId = rs.getInt("s_id");
                String studentName = rs.getString("name");
                System.out.println(studentId + " " + studentName);
            }

        } catch (Exception e) {
            System.out.println("Something need to be corrected");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.print("Error happened");
            }
        }
    }
}