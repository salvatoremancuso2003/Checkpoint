
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "developer", "Salvatore97");
            Statement statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();

        }finally{

        }
    }
}
