interface IApprovable {
    boolean approveLoan();
    double calculateEMI();
}

class Applicant {
    private String name;
    private int creditScore;
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    protected int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}

abstract class LoanApplication implements IApprovable {
    private String loanType;
    private int termMonths;
    private double interestRate;
    private Applicant applicant;
    private boolean approved;

    public LoanApplication(String loanType, int termMonths, double interestRate, Applicant applicant) {
        this.loanType = loanType;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
        this.applicant = applicant;
        this.approved = false;
    }

    protected Applicant getApplicant() {
        return applicant;
    }

    public String getLoanType() {
        return loanType;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }
}

class PersonalLoan extends LoanApplication {
    public PersonalLoan(int termMonths, double interestRate, Applicant applicant) {
        super("Personal", termMonths, interestRate, applicant);
    }

    @Override
    public boolean approveLoan() {
        if (getApplicant().getCreditScore() > 650 && getApplicant().getIncome() >= 20000) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        double P = getApplicant().getLoanAmount();
        double R = getInterestRate() / (12 * 100);
        int N = getTermMonths();
        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}

class HomeLoan extends LoanApplication {
    public HomeLoan(int termMonths, double interestRate, Applicant applicant) {
        super("Home", termMonths, interestRate, applicant);
    }

    @Override
    public boolean approveLoan() {
        if (getApplicant().getCreditScore() > 700 && getApplicant().getIncome() >= 50000) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        double P = getApplicant().getLoanAmount();
        double R = getInterestRate() / (12 * 100);
        int N = getTermMonths();
        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}

class AutoLoan extends LoanApplication {
    public AutoLoan(int termMonths, double interestRate, Applicant applicant) {
        super("Auto", termMonths, interestRate, applicant);
    }

    @Override
    public boolean approveLoan() {
        if (getApplicant().getCreditScore() > 680 && getApplicant().getIncome() >= 30000) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        double P = getApplicant().getLoanAmount();
        double R = getInterestRate() / (12 * 100);
        int N = getTermMonths();
        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}

public class q12 {
    public static void main(String[] args) {
        Applicant a1 = new Applicant("Rohit", 720, 60000, 500000);
        HomeLoan hl = new HomeLoan(240, 7.5, a1);
        if (hl.approveLoan()) {
            System.out.println("Home Loan Approved for " + a1.getName());
            System.out.println("EMI: " + hl.calculateEMI());
        } else {
            System.out.println("Home Loan Rejected for " + a1.getName());
        }

        Applicant a2 = new Applicant("Priya", 670, 40000, 800000);
        PersonalLoan pl = new PersonalLoan(60, 12, a2);
        if (pl.approveLoan()) {
            System.out.println("Personal Loan Approved for " + a2.getName());
            System.out.println("EMI: " + pl.calculateEMI());
        } else {
            System.out.println("Personal Loan Rejected for " + a2.getName());
        }
    }
}

