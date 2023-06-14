import java.io.*;
import java.util.*;
public class readfrmkey {
    public static void main(String args[]) throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a text:");
        String line = s.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[0], true));
        writer.append(line+"\n");
        writer.close();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        s.close();
    }
}
