package ar.edu.unahur.obj2.profugo;

public class EntrenamientoProteccionLegal extends ProfugoEvolucionado {

    public EntrenamientoProteccionLegal(Profugable profugoPosible) {
        super(profugoPosible);
    }

    @Override
    protected void duplicarHabilidad() {
    }

    @Override
    protected void proteccionLegal() {
        inocencia = Integer.max(40, inocencia);

    }

}
