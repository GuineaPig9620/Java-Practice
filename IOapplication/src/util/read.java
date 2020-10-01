package util;
import java.io.File;

public class read {

    public read(){

    }

    public static void main(String[] args){
        String pathname="saves/uqstlucia.txt";
        File file=new File("saves/uqstlucia");
        System.out.println(file.getAbsolutePath());
    }
}
