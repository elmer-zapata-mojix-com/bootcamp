package interfacesegregation;

public interface Loan extends Payment{
    void intiateLoanSettlement();
    void initiateRePayment();
}
