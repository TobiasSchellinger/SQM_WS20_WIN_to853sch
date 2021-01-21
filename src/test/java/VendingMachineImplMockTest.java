import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class VendingMachineImplMockTest {

    public VendingMachineImpl vendingMachine;
    public Box box;
    public UnlimitedCashBox cashBox;

    @BeforeEach
    public void setup() {
        box = mock(Box.class);
        cashBox = mock(UnlimitedCashBox.class);
        vendingMachine = new VendingMachineImpl(cashBox, new Box[]{box});
    }

    @Test
    public void testSelectItem() throws BoxEmptyException, NotEnoughMoneyException {
        when(box.isEmpty()).thenReturn(false);
        when(box.getPrice()).thenReturn(50);
        when(cashBox.getCurrentAmount()).thenReturn(100);

        vendingMachine.selectItem(0);

        verify(box, times(1)).releaseItem();
        verify(cashBox,times(1)).withdraw(50);
    }
}