package ar.edu.unahur.obj2.cazador;

import java.util.function.BooleanSupplier;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorUrbano extends Cazador {


    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    

    @Override
    protected Boolean condicionEspecifica(Profugo profugo) {
        return ! profugo.EstaNervioso();
    }



    public void intimida(Profugo profugo) {
        profugo.disminuirInocencia();
        profugo.reducirHabilidad();
    }

}
