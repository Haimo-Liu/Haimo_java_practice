import static java.lang.System.out;

public class Seven_Account {
    private String name;
    private String address;
    private Double balance;

    public void setName(String nn){
        if(!nn.equals("")){
            name = nn;
        }
    }

    public String getName(){
        return name;
    }

    public void setAddress(String a){
        address = a;
    }

    public String getAddress(){
        return address;
    }

    public void setBalance(double b){
        balance = b;
    }

    public double getBalance(){
        return balance;
    }

    public void display(){
        out.println(name + "'s address is ");
        out.println(address);
        out.println("and his account balance is " + balance);}

    public double getInterest(double InterestRate){
        return (InterestRate/100) * balance;
        }

}
