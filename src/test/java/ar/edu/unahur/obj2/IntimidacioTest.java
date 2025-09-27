package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import ar.edu.unahur.obj2.cazador.CazadorRural;
import ar.edu.unahur.obj2.cazador.CazadorSigiloso;
import ar.edu.unahur.obj2.cazador.CazadorUrbano;
import ar.edu.unahur.obj2.profugo.Profugo;

public class IntimidacioTest {

    @Test
    public void urbanoIntimidaYDejaDeEstarnerviosoYDisminuyeInocencia(){
        CazadorUrbano cazador = new CazadorUrbano(10);
        Profugo profugo = new Profugo(40, 50, true);
        cazador.intimida(profugo);
        assertFalse(profugo.EstaNervioso());
        assertEquals(Integer.valueOf(40), profugo.getInocencia());
    }

    @Test
    public void ruralIntimidaYSeVuelveNerviosoYDisminuyeInocencia(){
        CazadorRural cazador = new CazadorRural(10);
        Profugo profugo = new Profugo(40, 50, false);
        cazador.intimida(profugo);
        assertTrue(profugo.EstaNervioso());
        assertEquals(Integer.valueOf(40), profugo.getInocencia());
    }

    @Test
    public void sigilosoIntimidaReduceHabilidadYDisminuyeInocencia(){
        CazadorSigiloso cazador = new CazadorSigiloso(10);
        Profugo profugo = new Profugo(40, 50, false);
        cazador.intimida(profugo);
        assertFalse(profugo.EstaNervioso());
        assertEquals(Integer.valueOf(35), profugo.getHabilidad());
        assertEquals(Integer.valueOf(40), profugo.getInocencia());
    }

}
