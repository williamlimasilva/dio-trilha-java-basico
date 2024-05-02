package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private final static String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge", "Mateus", "Adriano"};
    private static int candidatosSelecionados = 0;
    private final static double salarioBase = 2824.0;

    public static void main(String[] args) {
        /*analisarCandidato(1900.0);
        analisarCandidato(3000.0);
        analisarCandidato(2824.0);*/
        //selecaoCandiatos();
        //imprimirSelecionados();
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    /*static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é o " + candidatos[i]);

        }

    }*/

    private static void selecaoCandiatos() {
        System.out.println("LISTA DE CANDIDATOS APROVADOS\n");
        while (candidatosSelecionados < candidatos.length && candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosSelecionados];
            double salarioPretendido = valorPretendido();
            //System.out.printf("O candidato %s solicitou este valor de salario R$ %.2f \n", candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga, com o salario de R$ %.2f \n", candidato, salarioPretendido);
                candidatosSelecionados++;
            }

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(2600.0, 3000.0);
    }

    /*static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2824.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguandando demais candidatos");
        }
    }*/
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas += 1;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.printf("Conseguimos contato com %s na %dª tentativa realizada \n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contatar %s após %d tentativas realizadas \n", candidato, tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}