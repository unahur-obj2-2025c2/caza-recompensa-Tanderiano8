package ar.edu.unahur.obj2.profugo;

public class EntrenamientoArtesMarciales extends ProfugoEvolucionado {

    public EntrenamientoArtesMarciales(Profugable profugoPosible) {
        super(profugoPosible);
    }

    @Override
    protected void duplicarHabilidad() {
        this.habilidad = Integer.min(100,habilidad * 2);
    }

    @Override
    protected void proteccionLegal() {
    }

}
