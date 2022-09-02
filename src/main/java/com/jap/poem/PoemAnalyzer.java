package com.jap.poem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoemAnalyzer {
    public static void main(String[] args) {
        PoemAnalyzer poemAnalyzer = new PoemAnalyzer();
        String poem = "Behold her, single in the field,\n" + "Yon solitary Highland Lass!\n" + "Reaping and singing by herself;\n" + "Stop here, or gently pass!\n" + "Alone she cuts and binds the grain,\n" + "And sings a melancholy strain;\n" + "O listen! for the Vale profound\n" + "Is overflowing with the sound.";
        poemAnalyzer.writeToTheFile("src/main/resources/poem.txt", poem);
        poemAnalyzer.readFile("src/main/resources/poem.txt");

    }

    public void readFile(String fileName) {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(fileName);
            int line = 0;
            while ((line = fileStream.read()) != -1) {
                char data = (char) line;
                System.out.print(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToTheFile(String fileName, String data) {
        byte[] b = data.getBytes();
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            out.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
