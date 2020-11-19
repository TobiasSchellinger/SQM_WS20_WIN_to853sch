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
    public void testTagGültig_Jan() {
        assertTrue(kalender.tagGültig((int)(Math.random()*31)+1, 1));
    }
    @Test
    public void testTagGültig_Feb() {
        assertTrue(kalender.tagGültig((int)(Math.random()*29)+1, 2));
    }
    @Test
    public void testTagGültig_Jun() {
        assertFalse(kalender.tagGültig((int)(Math.random()*31)+1, 6));
    }
    @Test
    public void testTagGültig_FebFalse() {
        assertFalse(kalender.tagGültig(31, 2));
    }

}