package fr.kaibee;


import java.util.List;

public class Rover {
    private final Planet planet;
    private Position position;
    private Direction direction;

    public Rover(Planet planet, Position position, Direction direction) {
        this.planet = planet;
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }
    public Direction getDirection() {
        return direction;
    }

    public void executeInstructions(List<Instruction> instructions) {
        for (Instruction instruction : instructions) {
            executeInstruction(instruction);
        }
    }

    private void executeInstruction(Instruction instruction) {
        switch (instruction) {
            case LEFT -> turnLeft();
            case RIGHT -> turnRight();
            case FORWARD -> moveForward();
            case BACKWARD -> moveBackward();
        }
    }

    private void moveBackward() {
        Position newPosition = position.moveBackward(direction, planet);
        checkPositionIsFree(newPosition);
        position = newPosition;
    }

    private void moveForward() {
        Position newPosition = position.moveForward(direction, planet);
        checkPositionIsFree(newPosition);
        position = newPosition;
    }
    private void checkPositionIsFree(Position newPosition) {
        if (!planet.isFree(newPosition)) {
            throw new ObstacleInPositionException();
        }
    }

    private void turnRight() {
        switch (direction) {
            case EAST -> direction = Direction.SOUTH;
            case NORTH -> direction = Direction.EAST;
            case SOUTH -> direction = Direction.WEST;
            case WEST -> direction = Direction.NORTH;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case EAST -> direction = Direction.NORTH;
            case NORTH -> direction = Direction.WEST;
            case SOUTH -> direction = Direction.EAST;
            case WEST -> direction = Direction.SOUTH;
        }
    }

    @Override
    public String toString() {
        return "Rover{ position=" + position +
                ", direction=" + direction +
                '}';
    }
}
