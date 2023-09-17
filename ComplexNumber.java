//Класс комплексного числа, содержащий поля для действительной и мнимой частей числа, 
//а также методы для выполнения операций над комплексными числами.
public class ComplexNumber {
private double real;
private double imaginary;

public ComplexNumber(double real, double imaginary) {
this.real = real;
this.imaginary = imaginary;
}

// Методы для выполнения операций над комплексными числами
// сложение
public ComplexNumber add(ComplexNumber other) {
double newReal = this.real + other.real;
double newImaginary = this.imaginary + other.imaginary;
return new ComplexNumber(newReal, newImaginary);
}
// вычитание
public ComplexNumber subtract(ComplexNumber other) {
double newReal = this.real - other.real;
double newImaginary = this.imaginary - other.imaginary;
return new ComplexNumber(newReal, newImaginary);
}
// умножение
public ComplexNumber multiply(ComplexNumber other) {
double newReal = this.real * other.real - this.imaginary * other.imaginary;
double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
return new ComplexNumber(newReal, newImaginary);
}
// деление
public ComplexNumber divide(ComplexNumber other) {
double divisor = Math.pow(other.real, 2) + Math.pow(other.imaginary, 2);
double newReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
return new ComplexNumber(newReal, newImaginary);
}
}
// В этом классе мы применили принцип единой ответственности (Single Responsibility Principle, SRP), 
// разделив логику работы с комплексными числами и их отображение на экране (метод `toString()`).