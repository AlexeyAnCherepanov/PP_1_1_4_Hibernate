package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
//
//
//    @Override
//    public void createUsersTable() {
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " +
//                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), " +
//                    "lastName VARCHAR(255), age INT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void dropUsersTable() {
//    }
//
//    @Override
//    public void saveUser(String name, String lastName, byte age) {
//
//    }
//
//    @Override
//    public void removeUserById(long id) {
//
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//
//    }
//
//    @Override
//    public void cleanUsersTable() {
//
//    }
//}
