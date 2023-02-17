import java.sql.*;
import java.util.List;

public class DeviceDao {

    public List<Device> getAllDeviceWIthHearthRateAndGps(String username) throws SQLException{
        Device device = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "developer", "Salvatore97");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM device AS D WHERE D.DEVICE_HAS_GPS AND DEVICE_HAS_HEARTRATE != 0");
            while (resultSet.next()) {
                String Device_Part_Number = resultSet.getString("DEVICE_PART_NUMBER");
                String device_Manufacturer = resultSet.getString("DEVICE_MANUFACTURER".toLowerCase());
                String device_Model = resultSet.getString("DEVICE_MODEL".toUpperCase());
                short device_Has_Gps = resultSet.getShort("DEVICE_HAS_GPS");
                short device_Has_Heartrate = resultSet.getShort("DEVICE_HAS_HEARTRATE");
                String Username = resultSet.getString("USERNAME");
                device = new Device(Device_Part_Number, device_Manufacturer, device_Model, device_Has_Gps, device_Has_Heartrate, Username);getAllDeviceWIthHearthRateAndGps("paolo");


            }

            resultSet.close();
            connection.close();

        return (List<Device>) device;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    }
