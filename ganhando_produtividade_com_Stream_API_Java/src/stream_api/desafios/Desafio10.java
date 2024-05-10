package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream()
                .filter(numero -> numero % 2 != 0) // Filtrar números ímpares
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Filtrar números múltiplos de 3 ou 5
                .collect(Collectors.groupingBy(numero -> true)));
    }
}
