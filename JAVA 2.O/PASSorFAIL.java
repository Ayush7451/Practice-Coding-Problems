import java.util.*;
public class PASSorFAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String type = (marks>=33)? "PASS":"FAIL";
        System.out.println(type);
        sc.close();
    }
}
