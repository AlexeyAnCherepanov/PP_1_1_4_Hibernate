package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Kolya", "Venckyi", (byte) 34);
        userService.saveUser("Georgy", "Kaiman", (byte) 55);
        userService.saveUser("Moi", "Tvoi", (byte) 20);
        userService.saveUser("Alex", "Brook", (byte) 62);
        System.out.println( userService.getAllUsers() );
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
