
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int containerWeight = 0;
        int brickWeight = 1;
//        System.out.println("container " + container);
//        while (1000 - containerWeight >= brickWeight) {
        while (1000 - containerWeight > brickWeight) {
            Suitcase suitcase = new Suitcase(100);
            Thing brick = new Thing("brick", brickWeight);
            suitcase.addThing(brick);

            containerWeight = container.currentContainerWeight(1000);
            if (1000 - containerWeight > brickWeight) {
                container.addSuitcase(suitcase);
                containerWeight += brickWeight;
                if (brickWeight < 100) {
                    brickWeight++;
                }
             } else {
                break;
            }
        }
    }
}
