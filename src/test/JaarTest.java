package test;

import main.Jaar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JaarTest {
    @Test
    public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
        Jaar jaar = new Jaar(2000);
        assertEquals(true, jaar.isSchrikkeljaar());
    }

    @Test
    public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
        assertEquals(false, new Jaar(1900).isSchrikkeljaar());
    }

    @Test
    public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
        assertEquals(true, new Jaar(2012).isSchrikkeljaar());
    }

    @Test
    public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
        assertEquals(false, new Jaar(2015).isSchrikkeljaar());
    }
}
