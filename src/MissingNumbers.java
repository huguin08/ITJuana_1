import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {
    /**
     * Resuelve el problema de encontrar números faltantes en el rango [1, longitud de la lista].
     *
     * @param nums una lista de enteros donde nums[i] está en el rango [1, longitud de la lista].
     * @return una lista de enteros que representa los números faltantes en el rango [1, longitud de la lista].
     */
    public static List<Integer> findMissingNumbers(List<Integer> nums) {
        // Utilizar un HashSet para almacenar los elementos únicos presentes en la lista 'nums'.
        Set<Integer> numSet = new HashSet<>(nums);
        List<Integer> result = new ArrayList<>();

        int listLength = nums.size();
        // Recorrer el rango [1, longitud de la lista].
        for (int i = 1; i <= listLength; i++) {
            // Verificar si cada número en el rango no está presente en el HashSet.
            if (!numSet.contains(i)) {
                // Si no está presente, agregarlo a la lista de resultados.
                result.add(i);
            }
        }

        // Devolver la lista de resultados que contiene los números faltantes.
        return result;
    }
}
