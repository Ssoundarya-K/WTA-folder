public class string {
    public static void main(String a[]){
        String s = "hello";
        String s1 = "Hello";
        String s2 = "Shrubbery";
        String s3 = "Java is programming language";
        String s4 = "                      Likes ";

        System.out.println("String length:"+s.length());
        System.out.println("is string s is empty?"+s.isEmpty());
        System.out.println("Are the strings s and s1 equal?"+s.equalsIgnoreCase(s1));
        System.out.println("Are the strings s and s1 equal?"+s.compareToIgnoreCase(s1));
        System.out.println("at 4th index no:"+s2.charAt(4));
        String arr[]=s3.split(" ");
        for(String x:arr)
        System.out.println(x);
        String i= String.join(",",s1,s2,s3);
        System.out.println(i);
        System.out.println("Replace all character:"+s2.replaceAll("rb","ik"));
        System.out.println("Uppercase:"+s.toUpperCase());
        System.out.println("Lowercase:"+s.toLowerCase());
        System.out.println("Trim:"+s4.trim());

    }
}
