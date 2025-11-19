
import preetam.hyderabad.*;

class SavingAccount extends Account {

    final static float transaction_Limit = 50000.00f;
    float transaction = 0.0f;
    float FD[];

    public SavingAccount(float amount) {
        super(amount, true);
        FD = new float[10];
    }

    public boolean withDraw(float amount) {
        if (transaction > transaction_Limit) {
            return false;
        } else {

            if (super.withDraw()) {
                transaction += amount;
            }
        }
    }

    boolean FixedDeposit(float amount, float duration) {
        //logic
        
        //calculate based on on interest 
        //fd[1] = mauturity
    }

}
