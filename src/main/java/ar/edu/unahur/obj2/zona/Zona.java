package ar.edu.unahur.obj2.zona;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.profugo.Profugo;

public class Zona {
    private String nombre;
    private Set<Profugo> habitantesProfugos;

    public Zona(String nombre){
        this.nombre = nombre;
        this.habitantesProfugos = new HashSet<Profugo>();
    }

    public void agregarProfugo(Profugo unProfugo){
        habitantesProfugos.add(unProfugo);
    }

    public void quitarProfugo(Profugo unProfugo){
        habitantesProfugos.remove(unProfugo);
    }

    public Set<Profugo> getHabitantesProfugos() {
        return habitantesProfugos;
    }

    

}
