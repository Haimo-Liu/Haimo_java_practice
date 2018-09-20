import static java.lang.System.out;

public class Seven_UseAccount {
    public static void main(String arg[]){
        Seven_Account MyAccount = new Seven_Account();
        Seven_Account YourAccount = new Seven_Account();

        MyAccount.setName("haimo");
        MyAccount.setAddress("1111 Dewberry");
        MyAccount.setBalance(1012.28);

        YourAccount.setName("Tiff");
        YourAccount.setAddress("fake address");
        YourAccount.setBalance(981.22);

        MyAccount.display();
        YourAccount.display();
        out.println("my account has the following interest: " + MyAccount.getInterest(7));
        out.printf("my account has a interest of " + "$%.2f \n", MyAccount.getInterest(7));

    }
}
