import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class KalenderTest extends TestCase {
    private Kalender kalender;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        kalender = new Kalender();
    }

    @Test
    public void testTagGueltig_Jan() {
        assertTrue(kalender.tagGueltig((int)(Math.random()*31)+1, 1));
    }
    @Test
    public void testTagGueltig_Feb() {
        assertTrue(kalender.tagGueltig((int)(Math.random()*29)+1, 2));
    }
    @Test
    public void testTagGueltig_Jun() {
        assertFalse(kalender.tagGueltig((int)(Math.random()*31)+1, 6));
    }
    @Test
    public void testTagGueltig_FebFalse() {
        assertFalse(kalender.tagGueltig(31, 2));
    }

}