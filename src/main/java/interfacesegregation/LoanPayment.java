package interfacesegregation;

import java.util.List;

public class LoanPayment implements Loan{


    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }

    @Override
    public void intiateLoanSettlement() {

    }

    @Override
    public void initiateRePayment() {

    }
}
