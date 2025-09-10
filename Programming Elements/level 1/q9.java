
public class q9 {
    public static void main(String args[]){
        int fee=125000;
        int discountpercent=10;
        double discount=((double)discountpercent/100)*fee;
        double f=fee-discount;
        System.out.println("The dicount amount is INR "+discount+" and final discounted fee is INR "+f);

    }
}