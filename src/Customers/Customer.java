package Customers;

public abstract class Customer<T> {
    private T iD;
    private String customerType;

    Customer(T iD_, String customerType_) {
        this.iD = iD_;
        this.customerType = customerType_;
    }

    public T getId() {
        return iD;
    }

    public String getCustomerType() {
        return customerType;
    }
}