import junit.framework.TestCase;

public class MyStringTest extends TestCase {
    MyString myString;
    public void setUp() throws Exception {
        super.setUp();
        myString = new MyString("a");
    }
    public void testPositive() {
        assertTrue(myString.equals(myString));
        assertTrue(myString.equals(new MyString("a")));
    }
    public void testNegative() {
        assertFalse(myString.equals(1));
        assertFalse(myString.equals(new MyString("b")));
        assertFalse(myString.equals(new MyString("ab")));
    }
}