package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, -3);
        numeros.stream()
                .filter(n-> n < 0)
                .findFirst()
                .ifPresentOrElse(n-> System.out.println("Foi encontrado um numeros negativos na lista: " +n +"\nPode ser que hajam mais..."),
                        ()-> System.out.println("Não foram encontrados numeros negaticos na lista"));
    }
}
