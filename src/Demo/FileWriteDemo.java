package Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        File outputFile = new File("src/FileWriter/output.txt");
        outputFile.createNewFile();
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        fileWriter.write("Hello bae");
        writer.newLine();
        fileWriter.write("Bae bae");
        fileWriter.close();

    }
}
