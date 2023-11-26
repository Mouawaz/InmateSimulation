import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayCreationAndRandomization {
    // array index is the number of the box -1
    // so at array index 0 there is box number 1
   private int boxes[] = new int[100];
    int shuffledBoxes[] = new int[100];

    public void Fill() {
        for (int i = 0; i < 100; i++) {
            boxes[i] = i;
           // System.out.println(boxes[i] + "=" + i);
        }

    }

    static void shuffleArray(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);

            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        for (int i = 0; i < 100; i++) {
            //System.out.println(ar[i] + "=" + i);
        }
    }

    public int[] getBoxes() {
        return boxes.clone();
    }
}
