import java.util.Scanner;

public class CalculatorView {
private Scanner scanner;

public CalculatorView() {
scanner = new Scanner(System.in);
}

public void displayMenu() {
System.out.println("=== Hi! I'm complex number calculator! ===");
System.out.println("Select an action:");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("0. Cancel");
}

public int getOperationChoice() {
System.out.print("Your choice: ");
return scanner.nextInt();
}

public ComplexNumber readComplexNumber() {
System.out.print("Real part: ");
double real = scanner.nextDouble();
System.out.print("Imaginary part: ");
double imaginary = scanner.nextDouble();
return new ComplexNumber(real, imaginary);
}

public void displayResult(ComplexNumber result) {
System.out.println("Result: " + result);
}

public void displayErrorMessage(String message) {
System.out.println("Error: " + message);
}
}
// В классе `CalculatorView` мы применили принцип единой ответственности (SRP), 
// разделив логику работы с пользовательским интерфейсом на методы отображения меню, 
// чтения ввода пользователя и вывода результатов операций.
