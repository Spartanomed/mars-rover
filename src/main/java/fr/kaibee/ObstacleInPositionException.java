package fr.kaibee;

public class ObstacleInPositionException extends RuntimeException {
    public ObstacleInPositionException() {
        super("There are an obstacle at position !");
    }
}
