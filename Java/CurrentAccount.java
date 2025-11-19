package preetam.hyderabad;

class CurrentAccount extends Account {

    final static float overDraftLimit = -10000.00f;

    public CurrentAccount(float amount) {
        super(amount, true);
    }

    public boolean withDraw(float amount) {
        if (balance < overDraftLimit) {
            return false;
        }
        this.balance -= amount;

        return true;
    }
}
