import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.GridLayout;

public class makeFrame extends JFrame {
    String raw_file = "/Users/haimo.liu/Documents/java_files/BaseBallTeam.txt";
    PlayerPlus players;

    public makeFrame() throws IOException {
        Scanner scanPlayerData = new Scanner(new File("/Users/haimo.liu/Documents/java_files/BaseBallTeam.txt"));

        for (int num = 1; num <= 5; num++) {
            players = new PlayerPlus(scanPlayerData.nextLine(), scanPlayerData.nextDouble());
            scanPlayerData.nextLine();

            addPlayerInfo(players);
        }

        setTitle("Base Ball Players");
        setLayout(new GridLayout(9, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        add(new JLabel("----------"));
        add(new JLabel(""));
        add(new JLabel("Team Average"));
        add(new JLabel(PlayerPlus.findTeamAverageString()));


        scanPlayerData.close();
    }

    public void addPlayerInfo(PlayerPlus players){
        add(new JLabel(players.getName()));
        add(new JLabel(players.getAverageString()));
    }


}
