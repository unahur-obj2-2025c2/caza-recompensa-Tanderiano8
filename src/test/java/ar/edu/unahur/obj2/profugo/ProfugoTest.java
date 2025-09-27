package ar.edu.unahur.obj2.profugo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazador.CazadorRural;
import ar.edu.unahur.obj2.cazador.CazadorSigiloso;
import ar.edu.unahur.obj2.cazador.CazadorUrbano;

public class ProfugoTest {

    @Test
    public void guardaYDevuelveAtributos() {
        Profugo profugo = new Profugo(50, 60, true);
        assertEquals(Integer.valueOf(50), profugo.getInocencia());
        assertEquals(Integer.valueOf(60), profugo.getHabilidad());
        assertTrue(profugo.EstaNervioso());

    }

    @Test
    public void disminuirInocienciaYNoBajaDeCero() {
        Profugo profugo = new Profugo(1, 30, true);
        profugo.disminuirInocencia();
        profugo.disminuirInocencia();
        assertEquals(Integer.valueOf(0), profugo.getInocencia());
        assertEquals(Integer.valueOf(30), profugo.getHabilidad());
        assertTrue(profugo.EstaNervioso());

    }

    @Test
    public void disminuirhabilidadYNoBajaDeCero() {
        Profugo profugo = new Profugo(10, 3, true);
        profugo.disminuirHabilidad();
        profugo.disminuirHabilidad();
        assertEquals(Integer.valueOf(10), profugo.getInocencia());
        assertEquals(Integer.valueOf(0), profugo.getHabilidad());
        assertTrue(profugo.EstaNervioso());

    }

    @Test
    public void cazadorUrbanoCapturaSiExperienciaMayorYNoNervioso() {
        CazadorUrbano cazadorUrbano = new CazadorUrbano(60);
        Profugo profugo = new Profugo(40, 70, false);
        assertTrue(cazadorUrbano.puedeCapturar(profugo));
    }

    @Test
    public void cazadorRuralCapturaSiEsNervioso() {
        CazadorRural cazadorRural = new CazadorRural(70);
        Profugo profugo = new Profugo(30, 60, true);
        assertTrue(cazadorRural.puedeCapturar(profugo));
    }

    @Test
    public void cazadorSigilosoNoCapturaSiHabilidadAlta() {
        CazadorSigiloso cazadorSigiloso = new CazadorSigiloso(80);
        Profugo profugo = new Profugo(20, 90, true);
        assertFalse(cazadorSigiloso.puedeCapturar(profugo));
    }

}
