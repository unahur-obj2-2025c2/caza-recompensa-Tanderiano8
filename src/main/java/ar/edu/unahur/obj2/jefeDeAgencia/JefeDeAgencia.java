package ar.edu.unahur.obj2.jefeDeAgencia;

import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.cazador.Cazador;
import ar.edu.unahur.obj2.profugo.Profugo;
import ar.edu.unahur.obj2.zona.Zona;

public class JefeDeAgencia {
    private static JefeDeAgencia instancia = new JefeDeAgencia();
    private List<Cazador> cazadores;
    private List<Profugo> profugosCapturados;

    private JefeDeAgencia() {
    }

    public static JefeDeAgencia getInstancia() {
        return instancia;
    }

    public Integer todosLosProfugosCapturados() {
        return profugosCapturados.size();
    }

    public Profugo profugoMasHabilCapturado() {
        return profugosCapturados.stream().max(Comparator.comparingInt(p -> p.getHabilidad())).orElseThrow();
    }

    public Cazador cazadorConMasCapturasRealizadas() {
        return cazadores.stream().max(Comparator.comparingInt(c -> c.cantidadDeCapturados())).orElseThrow();
    }

    public void agregarProfugo(Profugo unProfugo) {
        profugosCapturados.add(unProfugo);
    }

    public void agregarProfugosCapturados() {
        this.cazadores.stream().forEach(c -> this.profugosCapturados.addAll(c.getProfugosCapturados()));

    }

    public void enviarCazador(Zona unaZona, Cazador unCazador) {
        unCazador.realizarCapturaEnZona(unaZona);
    }

}
