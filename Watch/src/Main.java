import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Watch newWacth = new Watch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn bắt đầu: ");
        newWacth.start();
        System.out.println("Are you want to end");
        int a = scanner.nextInt();
        if (a == 1) {
            newWacth.stop();
            System.out.println(newWacth.getElapsedTime());
        }
    }
}
