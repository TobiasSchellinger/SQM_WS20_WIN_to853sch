import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class VendingMachineImplMockSpyTest{

    VendingMachineImpl vendingMachine;
    Box box;
    UnlimitedCashBox cashBox;

    @BeforeEach
    public void setup() {
        box = mock(Box.class);
        cashBox = spy(new UnlimitedCashBox());
        vendingMachine = new VendingMachineImpl(cashBox, new Box[]{box});
    }

    @Test
    public void testSelectItem() throws BoxEmptyException, NotEnoughMoneyException {
        when(box.isEmpty()).thenReturn(false);
        when(box.getPrice()).thenReturn(50);

        assertEquals(vendingMachine.selectItem(0), true);

        verify(box, times(1)).releaseItem();
        verify(cashBox,times(1)).withdraw(50);
    }
}
