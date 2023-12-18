package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPhoneNumber("(+380)11-111-11-11"));
        System.out.println(isPhoneNumber("(+380)11-111-101-11"));

        String text = "Я хочу    бути     програмістом";
        System.out.println(text.replaceAll("\\s+", " "));

        String htmlText = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";

        System.out.println(htmlText.replaceAll("<[^>]+>", ""));
    }

    private static boolean isPhoneNumber(String number) {
        return number.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
    }
}