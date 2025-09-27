package ar.edu.unahur.obj2.cazador;

import java.util.function.BooleanSupplier;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorSigiloso extends Cazador{


    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    

    @Override
    protected Boolean condicionEspecifica(Profugo profugo) {
        return profugo.getHabilidad() < 50;
    }


    
    public void intimida(Profugo profugo) {
        profugo.disminuirInocencia();
        profugo.dejaDeEstarNervioso();
    }

}
