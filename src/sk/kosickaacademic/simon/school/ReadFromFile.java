package sk.kosickaacademic.simon.school;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        FileReader fr;
        try{
            fr = new FileReader("C:\\asf\\a.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
