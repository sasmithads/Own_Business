
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTeamWe {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/TeamWe";
            String user="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,user,password); // for establishing database connection
            System.out.println("Connected");

            String t = "insert into client(serialNo,clientName, client_mobile, client_mail) values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(t);
            st.setInt(1,12);
            st.setString(2, "DD");
            st.setInt(3, 12345);
            st.setString(4, "ddramesh0910@gmail.com");

            

            String d="insert into project(projectNo,projectName,project_admin) values(?,?,?)";
            PreparedStatement ts=con.prepareStatement(d);
            ts.setInt(1,100);
            ts.setString(2,"Hotel Management");
            ts.setString(3,"Ramesh");

            st.execute();
            ts.execute();
            System.out.println("insert successfully");


        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
