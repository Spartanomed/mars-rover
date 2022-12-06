package fr.kaibee;

public record Position(int x, int y) {
    public Position moveForward(Direction direction, Planet planet) {
        int newX = x;
        int newY = y;
        switch (direction) {
            case EAST -> newX = x % planet.getMaxX() + 1;
            case WEST -> newX = x - 1 == 0 ? planet.getMaxX() : x - 1;
            case NORTH -> newY = y % planet.getMaxY() + 1;
            case SOUTH -> newY = y - 1 == 0 ? planet.getMaxY() : y - 1;
        };
        return new Position(newX, newY);
    }

    public Position moveBackward(Direction direction, Planet planet) {
        int newX = x;
        int newY = y;
        switch (direction) {
            case EAST -> newX = x - 1 == 0 ? planet.getMaxX() : x - 1;
            case WEST -> newX = x % planet.getMaxX() + 1;
            case NORTH -> newY = y - 1 == 0 ? planet.getMaxY() : y - 1;
            case SOUTH -> newY = y % planet.getMaxY() + 1;
        };
        return new Position(newX, newY);
    }
}
