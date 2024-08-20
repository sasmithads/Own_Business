import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTeamWe{
    public static void main(String[] args) {
        try {
             String url="jdbc:mysql://localhost:3306/TeamWe";
            String user="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,user,password); // for establishing database connection
            System.out.println("Connected");
            String t="create table client(serialNo int primary key, clientName varchar(20) not null,client_mobile int not null,client_mail varchar(50) not null)";
            Statement st=con.createStatement();
            st.executeUpdate(t);
            String d="create table project(projectNo int primary key not null, projectName varchar(20) not null,project_admin varchar(20) not null)";
            Statement v=con.createStatement();
            st.executeUpdate(d);
            System.out.println("Table created Successfully");

           
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}