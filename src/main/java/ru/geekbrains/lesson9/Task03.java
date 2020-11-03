package ru.geekbrains.lesson9;

import java.io.File;

public class Task03 {

    public static void main(String[] args) throws Exception {
        File dir = new File("Путь_к_каталогу");
        deleteDir(dir);
        System.out.println("Удалено " + dir);
    }

    public static void deleteDir(File dir) throws Exception {
        try {
            if (dir.isDirectory()) {
                for (File d : dir.listFiles()) {
                    deleteDir(d);
                    System.out.println("Успешно удалено! " + d);
                }
            }
            if (!dir.delete()) {
                throw new Exception("Ошибка удаления! ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
