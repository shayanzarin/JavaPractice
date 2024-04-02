package java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileTest {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.writeString(Path.of(File
                    .createTempFile("tempFile", ".txt").toURI()), "test test test",StandardOpenOption.WRITE);
            String fileContent = Files.readString(tempFile);
            System.out.println(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
