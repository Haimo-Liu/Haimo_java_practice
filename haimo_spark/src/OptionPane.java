import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String args[]){
        JOptionPane panel = new JOptionPane();
        String username = panel.showInputDialog("please provide username");
        String password = panel.showInputDialog("please provide password");

        if(
                username != null &&
                        password != null &&
                        (
                                (username.equals("haimo") && password.equals("liu")) ||
                                        (username.equals("tiffanie") && password.equals("wang"))
                        )
                ){panel.showMessageDialog(null,"you are in");} else{
            panel.showMessageDialog(null, "you cannot login");
        }
    }
}
