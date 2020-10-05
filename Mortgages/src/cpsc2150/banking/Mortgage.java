package cpsc2150.banking;
/**
 * Cierra Oliveira and Gavin McRoy
 */

/**
 * @Invariants
 * @Correspondence
 * Payment = payment
 * Rate = rate
 * DebtToIncomeRatio = DToIR
 * Principal = principal
 * NumberOfPayments = numPayments
 * PercentDown = perDown
 */


public class Mortgage extends AbsMortgage implements IMortgage {


    /**
     * @param houseCost the cost of house
     * @param downPayment the down payment on the house
     * @param years the number of years
     * @param customer the customer
     * @pre
     *
     */
    Mortgage(double houseCost, double downPayment, int years, ICustomer customer){

    }

    @Override
    public boolean loanApproved() {

        return false;
    }

    @Override
    public double getPayment() {
        return 0;
    }

    @Override
    public double getRate() {
        return 0;
    }

    @Override
    public double getPrincipal() {
        return 0;
    }

    @Override
    public int getYears() {
        return 0;
    }
}
