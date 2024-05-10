package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int quadradosSoma = numeros.stream()
                .mapToInt(numero -> numero * numero) // Mapear cada número para o seu quadrado
                .sum();
        System.out.println("A soma do quadrado destas lista = "+quadradosSoma);// Calcular a soma dos quadrados


    }
}
