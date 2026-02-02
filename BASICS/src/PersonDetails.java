import java.util.*;
public class PersonDetails {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        String name = sc.next();
        System.out.print("Age : ");
        int age = sc.nextInt();
        System.out.print("Address : ");
        String address = sc.next();
        System.out.print("Score out of 100 : ");
        int score = sc.nextInt();
        System.out.print("Dept : ");
        String dept = sc.next();
        System.out.printf("Name : %s\nage : %d\naddress : %s\nScore : %d\ndept : %s",name,age,address,score/10,dept);
    }
}
