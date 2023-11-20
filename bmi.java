import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI計算ツールです。(成人版)");
	for(int i = 1 ; i < 3 ; i++) {
		System.out.println( i + "人目の入力です。");
        	System.out.println("身長を入力してください。(cm)");
        	double height = Double.parseDouble(sc.nextLine()) / 100;
        	System.out.println("体重を入力してください。(kg)");
        	double weight = Double.parseDouble(sc.nextLine());

        	double BMI = weight / (height * height);
        	BMI = (Math.floor(BMI * 100)) / 100;
        	double tekisei = ((Math.floor((height * height) * 10)) * 22) / 10;
        	System.out.println("あなたのBMIは" + BMI + "です。");
        	System.out.println("あなたの適正体重は" + tekisei + "kgです。");
        	System.out.print("あなたの肥満度は");
        	if(BMI < 18.5) {
        	    System.out.println("低体重(やせ型)です。");
        	    System.out.println("もっと飯食いましょう");
        	} else if (BMI > 18.5 && BMI < 25) {
        	    System.out.println("普通体重です。");
        	    System.out.println("健康です。");
        	} else if (BMI > 25 && BMI < 30) {
        	    System.out.println("肥満(1度)です。");
        	    System.out.println("痩せましょう");
        	} else if (BMI > 30 && BMI < 35) {
        	    System.out.println("肥満(2度)です。");
        	    System.out.println("痩せましょう");
        	} else if (BMI > 35 && BMI < 40) {
        	    System.out.println("肥満(3度)です。");
        	    System.out.println("痩せましょう");
        	} else if (BMI > 40) {
        	    System.out.println("肥満(4度)です。");
        	    System.out.println("痩せましょう");
        	}
		System.out.println("----------------------------");
	}
    }
}
