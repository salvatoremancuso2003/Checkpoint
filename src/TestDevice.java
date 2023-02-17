import java.sql.SQLException;
import java.util.List;

public class TestDevice {
    public static void main(String[] args) throws SQLException {

            DeviceDao deviceDao = new DeviceDao();
            List<Device> device = deviceDao.getAllDeviceWIthHearthRateAndGps("paolo");
        System.out.println(device.toString());






        }
    }

