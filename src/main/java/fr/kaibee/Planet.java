package fr.kaibee;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private final int maxX;
    private final int maxY;

    private final List<Obstacle> obstacles;
    public Planet(int maxX, int maxY) {
        this(maxX, maxY, new ArrayList<>());
    }

    public Planet(int maxX, int maxY, List<Obstacle> obstacles) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.obstacles = obstacles;
    }

    public boolean isFree(Position position) {
        return obstacles.stream()
                .noneMatch(obstacle -> obstacle.position().equals(position));
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }
    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
