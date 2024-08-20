import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
        try {
              String url="jdbc:mysql://localhost:3306/TeamWe";
            String user="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,user,password); // for establishing database connection
            System.out.println("Connected");
            String update="update project set projectNo=? where project_admin=?";  
            PreparedStatement pre=con.prepareStatement(update);
            pre.setInt(1,30);
            pre.setString(2,"Ramesh");
            pre.executeUpdate();
            System.out.println("Execute Successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
