
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchTeamWe {
    public static void main(String[] args) {
        try {
             String url = "jdbc:mysql://localhost:3306/TeamWe";
            String user = "root";
            String pass = "root";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");

            String query = "SELECT * from client";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.println("Current data:");
                System.out.println("serialNo: " + rs.getInt("serialNo"));
                System.out.println("clinet Name: " + rs.getString("clientName"));
                System.out.println("client Mobile: " + rs.getInt("client_mobile"));
                System.out.println("client Mail: " + rs.getString("client_mail"));
            }

            String q= "SELECT * from project";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet r = ps.executeQuery();

            while(r.next()) {
                System.out.println("Current data:");
                System.out.println("Project No: " + r.getInt("projectNo"));
                System.out.println("Project Name: " + r.getString("projectName"));
                System.out.println("Project Admin: " + r.getString("project_admin"));
                
            }



        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
