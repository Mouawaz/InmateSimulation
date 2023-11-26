public class PrisonerManagement {
    boolean free = true;
    ArrayCreationAndRandomization poop = new ArrayCreationAndRandomization();
    private Object newClassObj;
    int[] boxes1 = poop.getBoxes();
    int prisonerNumber;
    int outsideCurrentBox=prisonerNumber;
    int insideCurrentBox;
    int outsideNextBox;
    public boolean iterator() {
        for (prisonerNumber = 0; prisonerNumber < 100; prisonerNumber++) {
            for(int j = 0;j<100;j++){



                outsideNextBox= poop.getBoxes()[insideCurrentBox];
                if(insideCurrentBox==prisonerNumber) break;

                if(j==50){ free = false;break;}

                insideCurrentBox = outsideCurrentBox;

            }

            System.out.println(poop.getBoxes()[6]);
        }
        return free;
    }

}
