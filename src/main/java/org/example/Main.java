package org.example;
/*
Stirling sayıları, bir kümenin elemanlarını belirli bir sayıda parçaya ayırmanın farklı yollarını sayan sayılardır. Stirling sayıları,
matematiksel kombinasyon ve bölme problemlerinde sıklıkla kullanılır.Genellikle iki tür Stirling sayısı vardır: İlk tür, bir kümenin
elemanlarını sırası önemsenmeksizin belirli sayıda parçaya ayırmanın farklı yollarını sayar ve bu Stirling sayıları S(n, k) ile gösterilir.
İkinci tür, bir kümenin elemanlarını sırası önemsenerek belirli sayıda parçaya ayırmanın farklı yollarını sayar ve bu Stirling sayıları
S'(n, k) ile gösterilir.
Stirling sayıları, kombinatörik ve olasılık teorisi gibi alanlarda önemli bir rol oynar. Özellikle, bölme problemleri, permutasyonlar,
grup teorisi ve olasılık dağılımları gibi konularda kullanılırlar.
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int n = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int k = scanner.nextInt();

        int stirlingResult = stirlingNumber(n, k);
        System.out.println("Stirling(" + n + ", " + k + ") = " + stirlingResult);
        scanner.close();
    }


        // Yinelemeli olarak Stirling sayısını hesaplama metodu
        static int stirlingNumber(int n, int k) {
            if (k == 0 || k > n) {
                return 0;
            } else if (n == 0 || n == k) {
                return 1;
            } else {
                return stirlingNumber(n - 1, k - 1) + k * stirlingNumber(n - 1, k);
            }
        }

    }
