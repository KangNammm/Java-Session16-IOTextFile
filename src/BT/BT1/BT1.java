package BT.BT1;

import java.io.*;

public class BT1 {
    public static void main(String[] args) throws IOException {
        String fileName = "my_output.txt";
        String fileContent = readFromFile(fileName);
        if (fileContent != null) {
            int wordCount = countWords(fileContent);
            System.out.println("Số lượng từ trong file: " + wordCount);
        }
    }

    public static String readFromFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        }
        return content.toString();
    }

    // Hàm để đếm số từ trong chuỗi
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
