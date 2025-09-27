package ar.edu.unahur.obj2.cazador;

import ar.edu.unahur.obj2.profugo.Profugo;

public abstract class Cazador {
    protected Integer experiencia;

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Boolean puedeCapturar(Profugo profugo) {
        return this.experiencia > profugo.getInocencia() && condicionEspecifica(profugo);
    }

    protected abstract Boolean condicionEspecifica(Profugo profugo);

    public void intimida(Profugo profugo){
        profugo.disminuirInocencia();
        
    }
    
}