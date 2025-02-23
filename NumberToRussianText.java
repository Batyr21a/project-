import java.util.Scanner;

public class NumberToRussianText {
    private static final String[] UNITS = { "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
            "девять" };

    private static final String[] TEENS = { "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "тнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };

    private static final String[] TENS = { "", "", "двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };

    private static final String[] HUNDREDS = { "", "сто", "двести", "триста", "четыреста", "пятьсот",
            "шестьсот", "семьсот", "восемьсот", "девятьсот" };

    static final String[] THOUSANDS = { "", "тысяча", "тысячи", "тысяч" };

    public static String thousandForms(int num) {
        if (num == 1)
            return THOUSANDS[1];
        if (num >= 2 && num <= 4)
            return THOUSANDS[2];
        return THOUSANDS[3];
    }

    public static String numberToText(int number) {
        if (number == 0)
            return "ноль";

        String result = "";

        int thousand = number / 1000;
        if (thousand > 0) {
            result += UNITS[thousand] + " " + thousandForms(thousand) + " ";
        }

        int remainder = number % 1000;
        int hundred = remainder / 100;
        if (hundred > 0) {
            result += HUNDREDS[hundred] + " ";
        }
        int tensAndUnits = remainder % 100;
        if (tensAndUnits > 0) {
            if (tensAndUnits >= 10 && tensAndUnits <= 19) {
                result += TEENS[tensAndUnits - 10];
            } else {
                int tens = tensAndUnits / 10;
                int units = tensAndUnits % 10;
                if (tens > 1) {
                    result += TENS[tens] + " ";
                }
                if (units > 0) {
                    result += UNITS[units];
                }
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number from 0 to 9999 (or -1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Goodbye!");
                break;
            }

            if (number < 0 || number > 9999) {
                System.out.println("Number must be between 0 and 9999!");
            } else {
                String text = numberToText(number);
                System.out.println("Result: " + text);
            }
        }

        scanner.close();
    }
}