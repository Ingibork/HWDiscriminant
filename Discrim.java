import java.util.Scanner;

/**
 * Написать программу, вычисляющую корни квадратного уравнения
 * вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
 * данные.
 *     Учитывать только реальные корни (в случае отрицательного
 * дискриминанта выводить сообщение пользователю).
 *     При решении создать и использовать следующие вынесенные
 * функции:
 *     - функция isPositive, определяющая, является ли число
 * положительным
 *     - функция isZero, определяющая, является ли число нулём
 *     - функция discriminant, вычисляющая дискриминант
 */
public class Discrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A");
        double A = scanner.nextInt();
        System.out.println("B");
        double B = scanner.nextInt();
        System.out.println("C");
        double C = scanner.nextInt();
    }


        public static String discriminant (double a,double b,double c){

            double Disc = b * b - 4 * a * c;
            double Disc1 = Math.sqrt(Disc);
            {
                return "Дискриминант " + Disc ;

            }
//Как значение которые мы вводим с клавиатуры A,B,C присвоить значениям в функции discriminant a,b,c??
        }

}