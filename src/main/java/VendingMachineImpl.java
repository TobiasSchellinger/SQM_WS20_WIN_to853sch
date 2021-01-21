public class VendingMachineImpl implements VendingMachine {

    private CashBox cashBox;
    private Box[] boxes;

    public VendingMachineImpl(CashBox cashBox, Box[] boxes) {
        this.cashBox = cashBox;
        this.boxes = boxes;
    }

    @Override
    public boolean selectItem(int boxIndex) throws
            NotEnoughMoneyException, BoxEmptyException {
        Box box = this.boxes[boxIndex];
        if(box.isEmpty()) {
            throw new BoxEmptyException();
        } else {
            int amountRequired = box.getPrice();
            if(amountRequired > this.cashBox.getCurrentAmount()) {
                throw new NotEnoughMoneyException();
            } else {
                box.releaseItem();
                this.cashBox.withdraw(amountRequired);
                return true;
            }
        }
    }

}