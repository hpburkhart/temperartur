import java.util.Random;

public class Tagestemperatur
{
    private int tag;
    private int monat;
    private String ort;
    private int[] temperaturen;

    public Tagestemperatur()
    {        
        tag = 31;
        monat = 3;
        ort = "Rosenheim";

        // Dem Feld wird 24-mal der Standardwert -300 [°C] hinzugefügt.
        temperaturen = new int[23];
        for (int index = 0; index < 24; index = index + 1)
        {
            temperaturen[index]= -300;
        }
    }

    public void TemperaturSetzen(int stunde, int tempNeu)
    {
        temperaturen[stunde]= tempNeu;
    }

    public int TemperaturGeben(int stunde)
    {
        return temperaturen[stunde];
    }

    public int MinimaltemperaturGeben()
    {
        int minimaltemp;
        minimaltemp = 1000;
        for (int i = 0; i<24; i++)
        {
            if (temperaturen[i] < minimaltemp && temperaturen[i] != -300)
            {
                minimaltemp = temperaturen[i];
            }
        }

        return minimaltemp;
    }

    public void MitTestwertenBefüllen()
    {
        Random zufallsgenerator;
        zufallsgenerator = new Random();

        for (int index = 0; index < 24; index = index + 1)
        {
            int zufallsTemp = zufallsgenerator.nextInt(25) - 10;
            this.TemperaturSetzen(index, zufallsTemp);
        }
    }

    public void TemperaturenAusgeben()
    {
        for (int index = 0; index < 24; index = index + 1)
        {
            System.out.println(index + ": " + temperaturen[index] + " °C");
        }
    }

    public int MaximaltemperaturGeben()
    {
        int maximaltemp = -1000;
        for (int i =0; i<24; i++)
        {
            if (temperaturen[i] > maximaltemp)
            {
                maximaltemp = temperaturen[i];
            }
        }

        return maximaltemp;
    }

    public float DurchschnittstemperaturGeben()
    {
        float durchschnittstemp;
        durchschnittstemp = 0;
        int anzahlMesswerte;
        anzahlMesswerte = 0;
        return durchschnittstemp;
    }
}
