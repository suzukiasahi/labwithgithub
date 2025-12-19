public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra số nguyên tố:");
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }

        // In ra các số nguyên tố từ 1 đến 50
        System.out.println("\nCác số nguyên tố từ 1 đến 50:");
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        // Tính UCLN
        int a = 12, b = 18;
        System.out.println("UCLN của " + a + " và " + b + " là: " + calculateGCD(a, b));
    }

    /**
     * Kiểm tra xem một số có phải là số nguyên tố hay không.
     * 
     * @param n Số cần kiểm tra
     * @return true nếu n là số nguyên tố, ngược lại false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // Chỉ cần kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Tìm ước chung lớn nhất (GCD) của hai số.
     */
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}