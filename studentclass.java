import java.util.Scanner;
class student {
    String usn;
    String name;
    String branch;
    long phone;
}
public class studentclass{
    public static void main(String a[]){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = si.nextInt();

        student obj[] = new student[n];

        for(int i=0;i<n;i++){
            obj[i]= new student();
        }

        for(int i=0;i<n;i++){
            System.out.println("Enter the usn:");
            String u = si.next();
            obj[i].usn=u;
            System.out.println("Enter the name:");
            String name1 = si.next();
            obj[i].name=name1;
            System.out.println("Enter the branch:");
            String branch1 = si.next();
            obj[i].branch=branch1;
            System.out.println("Enter the phone number:");
            long phone_num= si.nextLong();
            obj[i].phone=phone_num;
        }

        for(int i=0;i<n;i++){
            System.out.println("Details of student"+(i+1));
            System.out.println("USN:"+obj[i].usn);
            System.out.println("Name:"+obj[i].name);
            System.out.println("Branch:"+obj[i].branch);
            System.out.println("Phone Number:"+obj[i].phone);
        }
        si.close();
    }
}
