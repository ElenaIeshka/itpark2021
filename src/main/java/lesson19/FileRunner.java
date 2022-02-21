package lesson19;

import lesson19.util.FileUtils;

import java.io.File;

public class FileRunner {



    public static void main(String[] args) {
        String filelocation = "C:\\Java test\\test\\test.txt";
        File file = new File(filelocation);
        String fileName = file.getName();
        System.out.println("Имя файла" + file.getName());
        System.out.println("Расширение файла " + FileUtils.getFileExtension(fileName));
//        System.out.println("Расширение файла " + FilenameUtils.getExtension(fileName));
        System.out.println("Родительская папка файла" + file.getParent());
        System.out.println("Существует ли файл? " + (file.exists()? "Да" : "Нет"));
        System.out.println("Это файл?" + (file.isFile()? "Да" : "Нет"));
        System.out.println("Создались ли промежуточные директории (папки)? " + (file.mkdirs()? "Да" : "Нет"));

    }

    private static class FilenameUtils {
    }
}
