package Actors.Customers;

public class IndividualCustomer<T> extends Customer<T> {

    boolean isMember;

    public IndividualCustomer(T id, boolean isMember) {
        super(id, "Individual");
        this.isMember = isMember;
    }

    public IndividualCustomer(T id) {
        super(id, "Individual");
        this.isMember = false;
    }

    public boolean isMember() {
        return isMember;
    }


}
