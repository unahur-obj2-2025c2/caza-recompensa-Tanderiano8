package ar.edu.unahur.obj2.profugo;

public class Profugo {

    private Integer inocencia;
    private Integer habilidad;
    private Boolean esNervioso;

    public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }

    public Integer getInocencia() {
        return this.inocencia;
    }

    public Integer getHabilidad() {
        return this.habilidad;
    }

    public Boolean EstaNervioso() {
        return this.esNervioso;
    }

    public void disminuirInocencia() {
        this.inocencia = Math.max(0, (this.inocencia - 2));
    }

    public void disminuirHabilidad() {
        this.habilidad = Math.max(0, (this.habilidad - 5));
    }

}
