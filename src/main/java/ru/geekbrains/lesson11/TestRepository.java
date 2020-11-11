package ru.geekbrains.lesson11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TestRepository {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vtb_jdbc_lesson?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                "root", "Samsung1125");

        Repository<User> userRepository = new Repository<>(User.class, connection);

        /*userRepository.insert(new User(null, "ccc", "ccc"));
        userRepository.insert(new User(null, "ddd", "ccc"));*/

        /** Поиск по ID
         * */
        User user = userRepository.findById(50L);
        System.out.println(user);
        System.out.println("================================================");

        /** Удаление по ID
         * */
        /*userRepository.delete(49L);*/

        /** Изменение значений по ID
         * */
        userRepository.update("eee", "nnn", 55L);

        /** Полный список
         * */
        List<User> list = userRepository.findAll();
        System.out.println("Find all users:");
        for (User t : list) {
            System.out.println(t.toString());
        }
    }
}
