package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream()
                .sorted()
                .skip(numeros.getFirst())
                .findFirst()
                .ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("Sem numeros maiores"));
    }
}
