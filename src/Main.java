import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Введите число: ");
//    int number = sc.nextInt();
//
//    int e =0;
//     int summ =0;
//
//     while (number!=0){
//         int d = number % 10;
//
//         if (d %2 == 0) {
//             System.out.println(d+"jup san ");
//            e+=d;
//         }else {
//             summ += d;
//             System.out.println(summ+"tak san");
//         }
//        number/=10;
//            } //pandon don kelgen jup jana tak sandardy chygaruu
//        Scanner scr = new Scanner(System.in);
//        Random random = new Random();
//        int a = random.nextInt(30);
//
//        int count = 0;
//
//        while (true){
//            System.out.println("Угадай число 0-30: ");
//            int san = scr.nextInt();
//            count++;
//            if (a == san){
//                System.out.println(" Ураа таптын !");
//                break;
//            }
//            else if (san == a-1 || san == a+1){
//                System.out.println("Жакын");
//
//            }
//            else if (san == a-2 || san == a+2){
//                System.out.println("Коп эмес бираз жакын");
//
//            }
//            else if (san == a-3 || san == a+3){
//                System.out.println("Бираз алыс");
//            }
//
//            else if (san == a-6 || san == a+6){
//                System.out.println("Алысыраак");
//            }
//            else {
//                System.out.println("Алыс");
//            }
//        }
//        System.out.println("Сиз "+count+" жолу аракет кылуу мене таптыныз");
//        for (int a =1;a<=10; a++){
//            for (int i = 1;i <=10 ; i++) {
//                // int v= a*i;
//                // System.out.print(i+"*"+a+"="+v+"  ");
//                System.out.printf("%d*%d=%d ", i, a, a * i);
//            }}

        for (int a = 1; a <= 10; a++) {
            for (int i = 1; i <= 10; i++) {
                 int v= a*i;
                 System.out.print(i+" * " +a+" = "+v+"  ");
            //    System.out.printf("%3d * %3d = %3d \n ",a, i, a * i);
            }
            System.out.println("");
        }
//        for (int i = 1; i < 4; i++) {
//            System.out.println("*" + "*" + "*" +"*" + "*" +"*");
//
//        }

//        for (int i = 1; i <= 3; i++) {
//            String a = "a";
//            for (int j = 0; j < 5; j++) {
//                System.out.println(a);
//                a += "a";
//            }
//        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <= 5; j++) {
//                for (int k = 0; k < j; k++) {
//                    System.out.print("a");
//                }
//                System.out.println();
//            }
//
//        }

    }
}