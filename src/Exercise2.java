/* - Создайте функцию, которая отображает все различные комбинации двух цифр
     от 00 00 до 99 99, перечисленные в порядке возрастания.
Пример:
    00 01, 00 02, 00 03, 00 04, 00 05, ..., 00 99, 01 02, ..., 97 99, 98 99.
*/

public class Exercise2 {
    public static void number1(int n1, int n2, int n3, int n4){
       while (n4 <= 8){
           n4++;
           System.out.print(n1);
           System.out.print(n2 + " ");
           System.out.print(n3);
           System.out.print(n4 + ", ");
       }
    }
    public static void number2(int n1, int n2, int n3, int n4){
        number1(n1,n2,n3,n4);
        while (n3 <= 8){
            n3++;
            System.out.print(n1);
            System.out.print(n2 + " ");
            System.out.print(n3);
            System.out.print(n4 + ", ");
            number1(n1,n2,n3,0);
        }
    }
     public static void number3(int n1, int n2, int n3, int n4) {
         number2(n1, n2, n3, n4);
         while (n2 <= 8) {
             n2++;
             System.out.print(n1);
             System.out.print(n2 + " ");
             System.out.print(n3);
             System.out.print(n4 + ", ");
             number2(n1, n2, n3, n4);
         }
     }
    public static void number4(int n1, int n2, int n3, int n4) {
        number3(n1, n2, n3, n4);
        while (n1 <= 8) {
            n1++;
            System.out.print(n1);
            System.out.print(n2 + " ");
            System.out.print(n3);
            System.out.print(n4 + ", ");
            number3(n1, n2, n3, n4);
        }
    }


    public static void main(String[] args) {
        number4(0,0,0,0);
        System.out.print("Расчёт закончен.");

    }
}
