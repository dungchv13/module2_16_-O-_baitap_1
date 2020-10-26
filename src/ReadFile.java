import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public void display(File file) throws IOException {
        if(!file.exists()){
            throw new FileNotFoundException();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";

        ArrayList<String> result = new ArrayList<>();

        while ((line = br.readLine()) != null){
            String[] str = line.split(",");
            if(!result.contains(str[str.length-1])){
                result.add(str[str.length-1]);
            }
        }

        for (String s:result) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();

        rf.display(new File("input.txt"));
    }
}
