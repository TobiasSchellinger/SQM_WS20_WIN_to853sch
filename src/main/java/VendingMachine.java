public interface VendingMachine {

    boolean selectItem(int boxIndex) throws
            NotEnoughMoneyException,
            BoxEmptyException;

}

