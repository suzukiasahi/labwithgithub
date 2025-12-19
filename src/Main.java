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

        // Tìm số Fibonacci
        int nFib = 10;
        System.out.println("Số Fibonacci thứ " + nFib + " là: " + fibonacci(nFib));
        System.out.println("10 số Fibonacci đầu tiên:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println();

        // Tính giai thừa
        int nFactorial = 5;
        System.out.println("Giai thừa của " + nFactorial + " là: " + calculateFactorial(nFactorial));
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
     * Tìm số Fibonacci thứ n.
     * 
     * @param n Chỉ số (bắt đầu từ 0)
     * @return Giá trị số Fibonacci thứ n
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n phải không âm");
        }
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Tính giai thừa của n.
     *
     * @param n Số nguyên dương
     * @return Giai thừa của n
     */
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n phải không âm");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}