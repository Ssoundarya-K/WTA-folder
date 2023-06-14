import java.io.*;
import java.util.*;

public class employee {
    public static void main(String a[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the employee id,name,salary:");
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line," ");
        String id = st.nextToken();
        String name = st.nextToken();
        String sal = st.nextToken();

        id.trim();
        name.trim();
        sal.trim();

        int emp_id = Integer.parseInt(id);
        String emp_name = name;
        float emp_sal = Float.parseFloat(sal);

        System.out.println("Employee id:"+emp_id);
        System.out.println("Employee name:"+emp_name);
        System.out.println("Employee salary:"+emp_sal);
    } 
}
