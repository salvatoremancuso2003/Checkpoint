import jdk.incubator.vector.DoubleVector;

import java.sql.*;

public class TrainingDao {

    public TrainingSessionWithData getTraningSessionDataByTrainingId(Integer trainingId) throws SQLException {
        TrainingSessionData trainingSessionData = null;
        TrainingSessionWithData trainingSessionWithData = null;
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "developer", "Salvatore97")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM training_session, training_session_data");
            while(resultSet.next()){
                Integer ID_TRAINING_SESSION = resultSet.getInt("ID_TRAINING_SESSION");
                  Date START_TIME = resultSet.getDate("START_TIME");
                     Date END_TIME = resultSet.getDate("END_TIME");
                        Enum SESSION_TYPE;
                        String USER_USERNAME = resultSet.getString("USER_USERNAME");
                Integer ID_TRAINING_SESSION_DATA = resultSet.getInt("ID_TRAINING_SESSION_DATA");
                Double LATITUDE = resultSet.getDouble("LATITUDE");
                Double LONGITUDE = resultSet.getDouble("LONGITUDE");
                Double MOVEMENT_SPEED = resultSet.getDouble("MOVEMENT_SPEED");
                Double HEART_RATE = resultSet.getDouble("HEART_RATE");
                Integer TRAINING_SESSION = resultSet.getInt("TRAINING_SESSION");
            }

    }
        return trainingSessionWithData;
    }}



