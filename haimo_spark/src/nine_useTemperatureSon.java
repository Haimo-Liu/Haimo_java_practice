public class nine_useTemperatureSon {

    public static void main(String args[]){
        nine_temperatureSon temp = new nine_temperatureSon();
        temp.display();

        nine_temperatureSon temp1 = new nine_temperatureSon(10.00);
        temp1.display();

        temp = new nine_temperatureSon(TempScale.kelven);
        temp.display();

        temp1 = new nine_temperatureSon(30.11, TempScale.celsius);
        temp1.display();

    }
}
