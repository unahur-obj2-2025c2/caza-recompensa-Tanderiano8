package ar.edu.unahur.obj2.cazador;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unahur.obj2.profugo.Profugo;
import ar.edu.unahur.obj2.zona.Zona;

public abstract class Cazador {
    protected Integer experiencia;
    private List<Profugo> profugosCapturados;
    private Set<Profugo> profugosIntimidados = new HashSet<Profugo>();

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
        ;
    }

    public Boolean puedeCapturar(Profugo profugo) {
        return this.experiencia > profugo.getInocencia() && doCondicionEspecifica(profugo);
    }

    public void intimida(Profugo profugo) {
        profugo.disminuirInocencia();
        this.doIntimidacionEspecifica(profugo);
        this.profugosIntimidados.add(profugo);

    }

    public Integer cantidadDeCapturados() {
        return profugosCapturados.size();
    }

    public void capturar(Profugo unProfugo, Zona unaZona) {
        if (puedeCapturar(unProfugo)) {

            profugosCapturados.add(unProfugo);
            unaZona.quitarProfugo(unProfugo);

        } else {
            this.intimida(unProfugo);
        }
    }

    public void realizarCapturaEnZona(Zona unaZona) {
        unaZona.getHabitantesProfugos().stream().forEach(p -> this.capturar(p, unaZona));
        this.sumarExperiencia();
    }

    private void sumarExperiencia() {
        this.experiencia += this.minimaHabilidadDeLosIntimidados() + 2 * getProfugosCapturados().size();
    }

    private Integer minimaHabilidadDeLosIntimidados() {
        return profugosIntimidados.stream().mapToInt(i -> i.getHabilidad()).min().orElse(0);
    }

    protected abstract Boolean doCondicionEspecifica(Profugo profugo);

    public abstract void doIntimidacionEspecifica(Profugo profugo);

    public List<Profugo> getProfugosCapturados() {
        return profugosCapturados;
    }

}