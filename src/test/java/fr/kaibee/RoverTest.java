package fr.kaibee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RoverTest {
    public static final Planet PLANET = new Planet(5, 5);

    @Test
    public void Should_Turn_Rover_North_When_Previous_Direction_East_And_Instruction_Is_Left() {
        Rover rover = initializeRover(1, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.LEFT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.NORTH);
    }

    @Test
    public void Should_Turn_Rover_West_When_Previous_Direction_North_And_Instruction_Is_Left() {
        Rover rover = initializeRover(1, 1, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.LEFT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.WEST);
    }

    @Test
    public void Should_Turn_Rover_South_When_Previous_Direction_West_And_Instruction_Is_Left() {
        Rover rover = initializeRover(1, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.LEFT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.SOUTH);
    }

    @Test
    public void Should_Turn_Rover_East_When_Previous_Direction_South_And_Instruction_Is_Left() {
        Rover rover = initializeRover(1, 1, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.LEFT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.EAST);
    }

    @Test
    public void Should_Turn_Rover_South_When_Previous_Direction_East_And_Instruction_Is_Right() {
        Rover rover = initializeRover(1, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.RIGHT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.SOUTH);
    }

    @Test
    public void Should_Turn_Rover_West_When_Previous_Direction_South_And_Instruction_Is_Right() {
        Rover rover = initializeRover(1, 1, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.RIGHT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.WEST);
    }

    @Test
    public void Should_Turn_Rover_North_When_Previous_Direction_West_And_Instruction_Is_Right() {
        Rover rover = initializeRover(1, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.RIGHT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.NORTH);
    }

    @Test
    public void Should_Turn_Rover_East_When_Previous_Direction_North_And_Instruction_Is_Right() {
        Rover rover = initializeRover(1, 1, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.RIGHT);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getDirection()).isEqualTo(Direction.EAST);
    }


    @Test
    public void Should_Move_X_2_When_X_1_Previous_Direction_East_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(1, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(2, 1));
    }

    @Test
    public void Should_Move_X_3_When_X_2_Previous_Direction_East_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(2, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(3, 1));
    }

    @Test
    public void Should_Move_X_1_When_X_2_Previous_Direction_West_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(2, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_Move_X_2_When_X_3_Previous_Direction_West_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(3, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(2, 1));
    }

    @Test
    public void Should_Move_Y_3_When_Y_2_Previous_Direction_North_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(1, 2, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 3));
    }

    @Test
    public void Should_Move_Y_4_When_Y_3_Previous_Direction_North_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(1, 3, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 4));
    }

    @Test
    public void Should_Move_Y_1_When_Y_2_Previous_Direction_South_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(1, 2, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_Move_Y_2_When_Y_3_Previous_Direction_South_And_Instruction_Is_Forward() {
        Rover rover = initializeRover(1, 3, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 2));
    }

    @Test
    public void Should_Move_X_1_When_X_2_Previous_Direction_East_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(2, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_Move_X_2_When_X_3_Previous_Direction_East_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(3, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(2, 1));
    }

    @Test
    public void Should_Move_X_2_When_X_1_Previous_Direction_West_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(1, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(2, 1));
    }

    @Test
    public void Should_Move_X_3_When_X_2_Previous_Direction_West_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(2, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(3, 1));
    }

    @Test
    public void Should_Move_Y_1_When_Y_2_Previous_Direction_North_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(1, 2, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_Move_Y_2_When_Y_3_Previous_Direction_North_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(1, 3, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 2));
    }

    @Test
    public void Should_Move_Y_2_When_Y_1_Previous_Direction_South_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(1, 1, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 2));
    }

    @Test
    public void Should_Move_Y_3_When_Y_2_Previous_Direction_South_And_Instruction_Is_Backward() {
        Rover rover = initializeRover(1, 2, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 3));
    }

    @Test
    public void Should_Y_Has_MaxY_When_Y_Is_1_And_Direction_South_And_Instruction_Forward() {
        Rover rover = initializeRover(1, 1, Direction.SOUTH);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 5));
    }

    @Test
    public void Should_Y_Has_1_When_Y_Is_MaxY_And_Direction_North_And_Instruction_Forward() {
        Rover rover = initializeRover(1, 5, Direction.NORTH);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_X_Has_MaxX_When_X_Is_1_And_Direction_WEST_And_Instruction_Forward() {
        Rover rover = initializeRover(1, 5, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(5, 5));
    }

    @Test
    public void Should_X_Has_1_When_X_Is_MaxX_And_Direction_EAST_And_Instruction_Forward() {
        Rover rover = initializeRover(5, 1, Direction.EAST);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_X_Has_1_When_X_Is_MaxX_And_Direction_WEST_And_Instruction_Backward() {
        Rover rover = initializeRover(5, 1, Direction.WEST);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        rover.executeInstructions(instructions);

        Assertions.assertThat(rover.getPosition()).isEqualTo(new Position(1, 1));
    }

    @Test
    public void Should_Abort_Instructions_When_Move_Forward_To_Position_With_Rover() {
        Planet planet = new Planet(6, 6);
        Position positionObstacle = new Position(6, 2);
        planet.addObstacle(new Obstacle(positionObstacle));
        Rover rover = initializeRover( 5, 2, Direction.EAST, planet);
        List<Instruction> instructions = List.of(Instruction.FORWARD);

        Assertions.assertThatThrownBy(() -> rover.executeInstructions(instructions))
                .isInstanceOf(ObstacleInPositionException.class);
    }

    @Test
    public void Should_Abort_Instructions_When_Move_Backward_To_Position_With_Rover() {
        List<Obstacle> obstacles = List.of(new Obstacle(new Position(5, 1)),
                new Obstacle(new Position(3, 1)));
        Planet planet = new Planet(6, 6, obstacles);
        Rover rover = initializeRover( 4, 1, Direction.WEST, planet);
        List<Instruction> instructions = List.of(Instruction.BACKWARD);

        Assertions.assertThatThrownBy(() -> rover.executeInstructions(instructions))
                .isInstanceOf(ObstacleInPositionException.class);
    }
    private static Rover initializeRover(int initX, int initY, Direction direction) {
        Position position = new Position(initX, initY);
        return new Rover(PLANET, position, direction);
    }

    private static Rover initializeRover(int initX, int initY, Direction direction, Planet planet) {
        Position position = new Position(initX, initY);
        return new Rover(planet, position, direction);
    }

}
