import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCreationAndRandomization {
    // array index is the number of the box -1
    // so at array index 0 there is box number 1
    int boxes[]= new int[100];
    int shuffledBoxes[]= new int[100];

        public int[] Fill() {
            for (int i = 0; i < 100; i++){
                boxes[i]=i;
                System.out.println(boxes[i]+"="+i);
            }
            return boxes;
        }
        public int[] Shuffle(){
            List<int[]> intList = Arrays.asList(boxes);

            Collections.shuffle(intList);

            intList.toArray(shuffledBoxes);
        }
}
