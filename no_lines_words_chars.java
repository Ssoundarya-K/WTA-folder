import java.util.*;
import java.io.*;
public class no_lines_words_chars {
    public static void main(String arg[])throws IOException{
        String line;
        long nl=0,nw=0,nc=0;
        BufferedReader br = new BufferedReader(new FileReader(arg[0]));
        while((line=br.readLine())!=null){
            nl++;
            nc=nc+line.length();
            StringTokenizer st = new StringTokenizer(line);
            nw = nw+st.countTokens();
        }
        System.out.println("Number of lines:"+nl);
        System.out.println("Number of words:"+nw);
        System.out.println("Number of Characters:"+nc);
        br.close();
    }
}
