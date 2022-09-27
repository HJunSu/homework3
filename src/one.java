//3장 실습문제 1번
//(1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
// 0~100까지의 짝수의 합을 구하는 코드 실행 결과 2450
//(2) 위의 코드를 main() 메소드를 만들고 WhileTest 클래스로 완성하라.
/*
public class one {

    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (i < 100) {
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
    }
}*/
//(3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성하라.
/*
package java_study3_1;

public class ForTest {

   public static void main(String[] args) {
      int sum = 0;
      for(int i=0; i<100; i+=2) {
         sum = sum + i;
      }
      System.out.println(sum);
   }

}
 */
//(4) do-while 문을 이용하여 동일하게 실행되는 DoWhileTest 클래스를 작성하라.
/*
public class DoWhileTest {

   public static void main(String[] args) {
      int sum = 0, i = 0;
      do {
         sum = sum + i;
         i += 2;
      }while(i < 100);
      System.out.println(sum);
   }
}
 */