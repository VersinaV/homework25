import java.util.Scanner;

public class Pen {

    int Level;

    public Pen() {
      this.Level = 1000; // Устанавливаем начальное количество чернил в 1000.
    }

    // Метод для написания текста.
    public void write(String text) {
      if (Level >= text.length()) {
        System.out.println(text);
        Level -= text.length();
      } else {
        System.out.println("Ручка не может написать этот текст из-за недостатка чернил.");
      }
    }

    // Метод для пополнения чернил в ручке.
    public void refill() {
      Level = 1000;
      System.out.println("Чернила пополнены до максимального уровня.");
    }

    // Метод для проверки уровня чернил.
    public void checkInk() {
      System.out.println("В ручке осталось чернил: " + Level);
    }

  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    String text = scanner.nextLine();

    Pen pen = new Pen();
    pen.write(text); // Это напечатается.
    pen.checkInk(); // В ручке осталось чернил: 992
    pen.refill(); // Чернила пополнены до максимального уровня.
    pen.checkInk(); // В ручке осталось чернил: 1000


  }

}
