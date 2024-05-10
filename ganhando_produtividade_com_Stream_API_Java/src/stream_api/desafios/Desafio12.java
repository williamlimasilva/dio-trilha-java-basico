package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream()
                .reduce(1, (a, b) -> a * b)
                .describeConstable()
                .ifPresent(n-> System.out.println("Valor do PRODUTO de todos os numeros da lista = "+n));// Multiplicar os números


    }
}
