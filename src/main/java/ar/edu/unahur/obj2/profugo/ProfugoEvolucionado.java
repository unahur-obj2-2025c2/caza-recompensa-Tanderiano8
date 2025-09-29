package ar.edu.unahur.obj2.profugo;

public abstract class ProfugoEvolucionado implements Profugable {

    protected Integer inocencia;
    protected Integer habilidad;
    protected Boolean esNervioso;
    private Profugable profugoPosible;

    public ProfugoEvolucionado(Profugable profugoPosible) {
        this.profugoPosible = profugoPosible;
    }

    @Override
    public Integer getInocencia() {
        return this.inocencia;
    }
    @Override
    public Integer getHabilidad() {
        return this.habilidad;
    }
    @Override
    public Boolean estaNervioso() {
        return this.esNervioso;
    }
    @Override
    public void disminuirInocencia() {
        this.inocencia = Math.max(0, (this.inocencia - 2));
    }
    @Override
    public void disminuirHabilidad() {
        this.habilidad = Math.max(0, (this.habilidad - 5));
    }
    @Override
    public void volverseNervioso() {
        this.esNervioso = true;
    }
    @Override
    public void dejaDeEstarNervioso() {
        this.esNervioso = false;
    }

    protected abstract void duplicarHabilidad();

    protected abstract void proteccionLegal();

}
