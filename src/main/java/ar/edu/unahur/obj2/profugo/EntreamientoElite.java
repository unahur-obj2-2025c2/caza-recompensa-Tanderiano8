package ar.edu.unahur.obj2.profugo;

public class EntreamientoElite extends ProfugoEvolucionado{

    public EntreamientoElite(Profugable profugoPosible) {
        super(profugoPosible);
    }

    @Override
    protected void duplicarHabilidad() {

    }

    @Override
    protected void proteccionLegal() {
        
    }

    @Override
    public Boolean estaNervioso(){
        return false;
    }

}
