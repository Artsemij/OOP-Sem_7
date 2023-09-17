public class CalculatorApp {
// Метод "main" - входная точка в приложение Calculator.
    public static void main(String[] args) {
CalculatorView view = new CalculatorView();
CalculatorController controller = new CalculatorController(view);
controller.start();
}
}
