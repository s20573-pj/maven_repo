package pl.pjatk;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));

        File file = new File("sample.txt");
String text = FileUtils.readFileToString(file, StandardCharsets.UTF_8.name());
System.out.println(text);
    }
}
