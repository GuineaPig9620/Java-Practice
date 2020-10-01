package IO;

import java.io.*;

public class read {
    public static void main(String[] args){
        File file = new File("trunk/resources/text.txt");
        String line="";
        try{
            Reader reader = new FileReader("trunk/resources/text.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            int textScale;
            line=bufferedReader.readLine();
            String[] pair = line.split(" ");
            textScale =Integer.parseInt(pair[1]);
            for (int i=0; i<textScale; i++){
                System.out.println(bufferedReader.readLine());
            }
        }

        catch (IOException e){
            System.out.println("not found");
        }

        System.out.println(file.exists());

    }
}
