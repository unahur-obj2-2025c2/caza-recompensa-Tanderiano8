package ar.edu.unahur.obj2.cazador;


import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorUrbano extends Cazador {

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean doCondicionEspecifica(Profugo profugo) {
        return !profugo.estaNervioso();
    }

    @Override
    public void doIntimidacionEspecifica(Profugo profugo) {
        profugo.dejaDeEstarNervioso();
    }

}
