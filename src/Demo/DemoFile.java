package Demo;

import java.io.File;
import java.io.IOException;

public class DemoFile {

    public static void main(String[] args) throws IOException {
        File dataFile = new File("src/Demo/data.txt");
        if (dataFile.createNewFile()){
            System.out.println("Tạo file thành công");
            return;
        }
        System.out.println("Tạo file ko thành công");

        File inputDir = new File("input");
        if (inputDir.mkdir()){
            System.out.println("Tạo forder thành công");
            return;
        }
        System.out.println("Tạo forder ko thành công");


    }
}
