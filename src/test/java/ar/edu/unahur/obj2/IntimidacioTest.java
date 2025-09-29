package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
        assertFalse(profugo.estaNervioso());
        assertEquals(Integer.valueOf(38), profugo.getInocencia());
    }

    @Test
    public void ruralIntimidaYSeVuelveNerviosoYDisminuyeInocencia(){
        CazadorRural cazador = new CazadorRural(10);
        Profugo profugo = new Profugo(40, 50, false);
        cazador.intimida(profugo);
        assertTrue(profugo.estaNervioso());
        assertEquals(Integer.valueOf(38), profugo.getInocencia());
    }

    @Test
    public void sigilosoIntimidaReduceHabilidadYDisminuyeInocencia(){
        CazadorSigiloso cazador = new CazadorSigiloso(10);
        Profugo profugo = new Profugo(40, 50, false);
        cazador.intimida(profugo);
        assertFalse(profugo.estaNervioso());
        assertEquals(Integer.valueOf(45), profugo.getHabilidad());
        assertEquals(Integer.valueOf(38), profugo.getInocencia());
    }

}
