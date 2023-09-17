//Мы будем использовать паттерн проектирования Singleton для класса логгера:
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorLogger {
private static CalculatorLogger instance;
private static final Logger logger = Logger.getLogger(CalculatorLogger.class.getName());

private CalculatorLogger() {
// Настройка логгера
logger.setLevel(Level.INFO);
Handler consoleHandler = new ConsoleHandler();
consoleHandler.setLevel(Level.ALL);
logger.addHandler(consoleHandler);
}

public static CalculatorLogger getInstance() {
if (instance == null) {
instance = new CalculatorLogger();
}
return instance;
}

public void logInfo(String message) {
logger.info(message);
}

public void logWarning(String message) {
logger.warning(message);
}
}
