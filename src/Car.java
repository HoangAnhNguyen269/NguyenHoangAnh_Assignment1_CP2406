public class Car {
    private static final int STOPPED = 0; //car speed is 0m/s, gonna change to
    private static final int NEXT_ROAD_INDEX = 0;
    private static final int START_POSITION = 1;
    String id; // unique identifier
    static float length; // number of segments occupied, 1 for ease of prototype.
    private static float breadth;
    private int speed; //segments moved per turn
    private int position; // position on current road
    private Road currentRoad; // current Road object
}
