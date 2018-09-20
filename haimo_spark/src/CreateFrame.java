import javax.swing.JFrame;
/*
make announcement, JFrame used as an abbreviation below refers to javax.sing.JFrame
if you dont declare this, you have to use the full name 'javax....' everytime when you want to reference JFrame
 */

public class CreateFrame {
    public static void main(String args[]){
        JFrame myFrame = new JFrame();
        String FrameTitle = "test title";

        myFrame.setTitle(FrameTitle);
        myFrame.setSize(200,300);
        myFrame.setVisible(true);
    }

}
