
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("身長（メートル単位）を入力してください：");
        double height = scanner.nextDouble();

        System.out.println("体重（キログラム単位）を入力してください：");
        double weight = scanner.nextDouble();

        double bmi = calculateBMI(height, weight);
        System.out.printf("あなたのBMIは %.2f です。\n", bmi);

        String message = interpretBMI(bmi);
        System.out.println(message);
    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static String interpretBMI(double bmi) {
        String category;
        if (bmi < 18.5) {
            category = "過体重不足";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "適正体重";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            category = "過体重";
        } else {
            category = "肥満";
        }

        String message = "あなたのBMIは " + String.format("%.2f", bmi) + " で、" + category + " です。\n";

        if (category.equals("適正体重")) {
            message += "健康的な状態です。継続して健康な生活を維持しましょう。";
        } else {
            message += "適正体重を目指すために、食事と運動の改善を検討しましょう。";
        }

        return message;
    }
}
