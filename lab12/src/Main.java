import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.println("\nВыберите задание (1-20): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        switch (choice) {

            case 1:
                System.out.println("Длина строки: " + input.length());
                break;

            case 2:
                System.out.println("Верхний регистр: " + input.toUpperCase());
                System.out.println("Нижний регистр: " + input.toLowerCase());
                break;

            case 3:
                String[] words3 = input.trim().split("\\s+");
                System.out.println("Количество слов: " + words3.length);
                break;

            case 4:
                String[] words4 = input.split(" ");
                for (String word : words4) {
                    System.out.print(new StringBuilder(word).reverse() + " ");
                }
                break;

            case 5:
                System.out.print("Введите слово для поиска: ");
                String search = scanner.nextLine();
                System.out.println(input.contains(search) ? "Найдено" : "Не найдено");
                break;

            case 6:
                System.out.print("Что заменить: ");
                String oldWord = scanner.nextLine();
                System.out.print("На что заменить: ");
                String newWord = scanner.nextLine();
                System.out.println(input.replace(oldWord, newWord));
                break;

            case 7:
                String cleaned = input.replaceAll("\\s+", "").toLowerCase();
                String reversed = new StringBuilder(cleaned).reverse().toString();
                System.out.println(cleaned.equals(reversed) ? "Палиндром" : "Не палиндром");
                break;

            case 8:
                System.out.print("Введите вторую строку: ");
                String input2 = scanner.nextLine();
                System.out.println(input.equals(input2) ? "Равны" : "Не равны");
                break;

            case 9:
                String[] parts = input.split(",");
                for (String part : parts) {
                    System.out.println(part);
                }
                break;

            case 10:
                int vowels = 0, consonants = 0;
                String vowelsStr = "aeiouаеёиоуыэюя";

                for (char c : input.toLowerCase().toCharArray()) {
                    if (Character.isLetter(c)) {
                        if (vowelsStr.indexOf(c) != -1)
                            vowels++;
                        else
                            consonants++;
                    }
                }
                System.out.println("Гласные: " + vowels);
                System.out.println("Согласные: " + consonants);
                break;

            case 11:
                System.out.println(input.replace(" ", ""));
                break;

            case 12:
                String[] words12 = input.split(" ");
                String longest = "";
                for (String word : words12) {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
                System.out.println("Самое длинное слово: " + longest);
                break;

            case 13:
                System.out.println("Символов без пробелов: " + input.replace(" ", "").length());
                break;

            case 14:
                System.out.print("Введите начало: ");
                String start = scanner.nextLine();
                System.out.println(input.startsWith(start));
                break;

            case 15:
                System.out.print("Введите символ/конец: ");
                String end = scanner.nextLine();
                System.out.println(input.endsWith(end));
                break;

            case 16:
                System.out.println(new StringBuilder(input).reverse());
                break;

            case 17:
                System.out.println(input.replaceAll("\\d", ""));
                break;

            case 18:
                System.out.println(input.replaceAll("[aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ]", "*"));
                break;

            case 19:
                Map<Character, Integer> map = new HashMap<>();
                for (char c : input.toCharArray()) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
                for (char c : map.keySet()) {
                    System.out.println(c + ": " + map.get(c));
                }
                break;

            case 20:
                System.out.println(input.matches("\\d+") ? "Только цифры" : "Есть другие символы");
                break;

            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}