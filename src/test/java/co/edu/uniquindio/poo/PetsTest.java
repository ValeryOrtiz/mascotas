/**
 * Clase para probar el funcionamiento del código
 * @author Valery Ortiz, Nicol Marin, David Vivas
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PetsTest {
    private static final Logger LOG = Logger.getLogger(PetsTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
    @Test
    public void CompleteInfo(){
        LOG.info("Iniciando test PetsTestComplete");
        Pets pet1 = new Pets("Abril",Species.CAT,Race.ANGORA,(byte)4,Gender.FEMALE,Colour.GREY_AND_WHITE,4.2);
        assertEquals(pet1.name(), "Abril");
        assertEquals(pet1.species(), Species.CAT);
        assertEquals(pet1.race(), Race.ANGORA);
        assertEquals(pet1.age(), (byte) 4);
        assertEquals(pet1.gender(), Gender.FEMALE);
        assertEquals(pet1.colour(), Colour.GREY_AND_WHITE);
        assertEquals(pet1.weight(),4.2);
        LOG.info("Finalizando test PetsTestComplete");
    }

    @Test
    public void InfoNull(){
        LOG.info("Inicio test InfoNull");
        assertThrows(Throwable.class,()-> new Pets(null,null,null,(byte)0,null,null,0));
        LOG.info("Finalizando test InfoNull");
    }
    @Test
    public void InfoBlank(){
        LOG.info("Inicio test InfoBlank");
        assertThrows(Throwable.class,() -> new Pets("",Species.CAT,Race.ANGORA,(byte)0,Gender.FEMALE,Colour.GREY_AND_WHITE,0));
        LOG.info("Finalizando test InfoBlank");
    }
    @Test
    public void NegativeAge(){
        LOG.info("Inicio test NegativeAge");
        assertThrows(Throwable.class,() -> new Pets("Abril",Species.CAT,Race.ANGORA,(byte)-4,Gender.FEMALE,Colour.GREY_AND_WHITE,4.2));
        LOG.info("Finalizando test NegativeAge");
    }
    @Test
    public void NegativeWeight(){
        LOG.info("Inicio test NegativeWeight");
        assertThrows(Throwable.class,() -> new Pets("Abril",Species.CAT,Race.ANGORA,(byte)4,Gender.FEMALE,Colour.GREY_AND_WHITE,-4.2));
        LOG.info("Finalizando test NegativeWeight");
    }
}
