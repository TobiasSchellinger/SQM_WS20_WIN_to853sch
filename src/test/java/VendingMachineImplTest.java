import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VendingMachineImplTest{

    public VendingMachineImpl vendingMachine;

    @BeforeEach
    public void setUp() {
        vendingMachine = new VendingMachineImpl(new UnlimitedCashBox(), new FullBox[]{new FullBox()});
    }
    @Test
    public void testEnoughMoneyFullBox() throws BoxEmptyException, NotEnoughMoneyException {
        assertTrue(vendingMachine.selectItem(0));
    }
}