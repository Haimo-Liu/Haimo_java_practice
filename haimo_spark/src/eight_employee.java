import static java.lang.System.out;

public class eight_employee {
    private String name;
    private String title;

    public void setName(String nn){
        if(!nn.equals("")){
            name = nn;
        }
    }

    public String getName(){
        return name;
    }

    public void setTitle(String tt){
        if(!tt.equals("")){
            title = tt;
        }
    }

    public String getTitle(){
        return title;
    }

    public void cutCheck(double amountPaid){
        out.printf("Pay to the order of %s ", name);
        out.printf("(%s) *** $", title);
        out.printf("%,.2f\n", amountPaid);
    }
}
