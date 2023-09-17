// Класс обрабатывающий пользовательский ввод, вызывающий соответствующие методы модели 
// и обновляющий представление
public class CalculatorController {
private CalculatorView view;

public CalculatorController(CalculatorView view) {
this.view = view;
}

public void start() {
int choice;
do {
view.displayMenu();
choice = view.getOperationChoice();
switch (choice) {
case 1:
performAddition();
break;
case 2:
performSubtraction();
break;
case 3:
performMultiplication();
break;
case 4:
performDivision();
break;
case 0:
view.displayResult(new ComplexNumber(0, 0));
break;
default:
view.displayErrorMessage("Некорректный выбор");
}
} while (choice != 0);
}

private void performOperation(ComplexNumber result, String operationName, ComplexNumber operand) {
switch (operationName) {
case "add":
result = result.add(operand);
break;
case "subtract":
result = result.subtract(operand);
break;
case "multiply":
result = result.multiply(operand);
break;
case "divide":
result = result.divide(operand);
break;
}
view.displayResult(result);
}

private void performAddition() {
ComplexNumber operand1 = view.readComplexNumber();
ComplexNumber operand2 = view.readComplexNumber();
ComplexNumber result = operand1.add(operand2);
view.displayResult(result);
}

private void performSubtraction() {
ComplexNumber operand1 = view.readComplexNumber();
ComplexNumber operand2 = view.readComplexNumber();
ComplexNumber result = operand1.subtract(operand2);
view.displayResult(result);
}

private void performMultiplication() {
ComplexNumber operand1 = view.readComplexNumber();
ComplexNumber operand2 = view.readComplexNumber();
ComplexNumber result = operand1.multiply(operand2);
view.displayResult(result);
}

private void performDivision() {
ComplexNumber operand1 = view.readComplexNumber();
ComplexNumber operand2 = view.readComplexNumber();
ComplexNumber result;
try {
result = operand1.divide(operand2);
view.displayResult(result);
} catch (ArithmeticException e) {
view.displayErrorMessage("Division by zero is impossible.");
}
}
}
// В классе `CalculatorController` также применён принцип единой ответственности (SRP), 
// разделив логику обработки ввода и вызова методов модели на отдельные private методы.
