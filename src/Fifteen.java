import java.util.*;
public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("곱하고자 하는 두 수 입력>>");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.print(n + "x" + m + "=" + n*m );
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("실수는 입력하면 안됩니다.");
            }
        }
        sc.close();
    }
}
