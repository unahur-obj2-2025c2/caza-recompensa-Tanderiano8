package ar.edu.unahur.obj2.cazador;


import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorSigiloso extends Cazador {

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean doCondicionEspecifica(Profugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    public void doIntimidacionEspecifica(Profugo profugo) {
        profugo.disminuirHabilidad();
    }

}
