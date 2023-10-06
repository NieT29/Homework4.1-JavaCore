import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select;
        int sum=0;
        do {
            System.out.println("nhập vào một số nguyên");
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println("bạn có muốn tiếp tục nhập không(Y/N)");
            select= scanner.nextLine();
            sum+=n;
        } while (select.equalsIgnoreCase("Y"));
        System.out.println("Tổng các số bạn vừa nhập vào = "+sum);
    }
}
