import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String a = scanner.nextLine();
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] words = a.split(" ");
        int count = 0;
        boolean word = false;
        for (int i = 0; i < words.length; i++) {

            char[] symbols = words[i].toCharArray();
            for (int j = 0; j < symbols.length; j++) {
                int index = alph.indexOf(Character.toUpperCase(symbols[j]));
                if (index == -1) {
                    word = false;
                    break;
                } else {
                    word = true;
                }
            }

            if (word)
            {
                System.out.println(words[i]);
                count++;
            }
        }
        System.out.println("Кол-во слов: " + count);
    }
}
