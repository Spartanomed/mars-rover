package fr.kaibee;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public static Direction toDirection(String direction) {
        return switch (direction) {
            case "N" -> Direction.NORTH;
            case "W" -> Direction.WEST;
            case "S" -> Direction.SOUTH;
            case "E" -> Direction.EAST;
            default -> throw new RuntimeException("Unsupported character only N,W,S,E is ok!");
        };
    }
}
