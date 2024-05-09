package main.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private final Map<LocalDate,Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventos.put(data,new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(agendaEventos);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(agendaEventos);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento : "+ entry.getValue()+", acontecerá no dia : " +entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024,4,22),"Evento 1","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.MARCH,10),"Evento 2","Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024,5,9),"Evento 3","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE,15),"Evento 4","Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024,2,7),"Evento 5","Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.JANUARY,12),"Evento 6","Atração 6");
        agendaEventos.adicionarEvento(LocalDate.of(2024,8,31),"Evento 7","Atração 7");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.SEPTEMBER,1),"Evento 8","Atração 8");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
