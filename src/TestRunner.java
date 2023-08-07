import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        // Ejecutar las pruebas unitarias en la clase MissingNumbersTest.
        Result result = JUnitCore.runClasses(MissingNumbersTest.class);

        // Imprimir los detalles de cualquier prueba fallida.
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        // Si todas las pruebas pasan sin errores, imprimir un mensaje de éxito.
        if (result.wasSuccessful()) {
            System.out.println("Todas las pruebas pasaron correctamente.");
        }
    }
}