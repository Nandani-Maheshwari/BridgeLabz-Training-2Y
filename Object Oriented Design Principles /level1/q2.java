import java.util.*;

class Customer {
    private String customerName;
    private String customerId;
    private Map<String, Double> accounts;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.accounts = new HashMap<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void viewBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Customer: " + customerName + " | Account: " + accountNumber + " | Balance: " + accounts.get(accountNumber));
        } else {
            System.out.println("Account not found for customer " + customerName);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, accounts.get(accountNumber) + amount);
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            if (balance >= amount) {
                accounts.put(accountNumber, balance - amount);
                System.out.println("Withdrew " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds for account " + accountNumber);
            }
        }
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.addAccount(accountNumber, initialBalance);
        System.out.println("Account " + accountNumber + " opened for customer " + customer.getCustomerName() + " at " + bankName);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName + " has the following customers:");
        for (Customer c : customers) {
            System.out.println("Customer ID: " + c.getCustomerId() + ", Name: " + c.getCustomerName());
        }
        System.out.println("-------------------------");
    }
}

public class q2 {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer customer1 = new Customer("Alice", "C001");
        Customer customer2 = new Customer("Bob", "C002");

        bank.openAccount(customer1, "A101", 5000);
        bank.openAccount(customer1, "A102", 2000);
        bank.openAccount(customer2, "A201", 10000);

        bank.showCustomers();

        customer1.viewBalance("A101");
        customer1.deposit("A101", 1500);
        customer1.viewBalance("A101");

        customer2.withdraw("A201", 3000);
        customer2.viewBalance("A201");
    }
}

