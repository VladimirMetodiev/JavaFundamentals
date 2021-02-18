package ConditionalStatementsAndLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BPMCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float beatsPerMinute = Float.parseFloat(input.nextLine());
        float numberOfBeats = Float.parseFloat(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.#");
        DecimalFormat df2 = new DecimalFormat("0");

        double bars = numberOfBeats / 4.0;
        int minutes = (int)(numberOfBeats / beatsPerMinute);

        double seconds = 0.0;
        if(minutes > 0){
            seconds = Math.floor((numberOfBeats / beatsPerMinute - minutes) * 60.0);
        }
        else{
            seconds = Math.floor(numberOfBeats / beatsPerMinute * 60.0);
        }

        System.out.println(df.format(bars) + " bars - " + minutes + "m " + df.format(seconds) + "s");
    }
}
