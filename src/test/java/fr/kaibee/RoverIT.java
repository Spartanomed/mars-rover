package fr.kaibee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RoverIT {
    @Test
    public void Should_Rover_At_1_1_When_Instructions_FFFFRFFFRFBLB() {
        Planet planet = new Planet(6, 6);
        Position position = new Position(3, 3);
        Rover rover = new Rover(planet, position, Direction.toDirection("E"));

        String instructionsToConvert = "FFFFRFFFRFBLB";
        List<Instruction> instructions = new ArrayList<>();
        for (char c: instructionsToConvert.toCharArray()) {
            instructions.add(Instruction.toInstruction(c));
        }

        rover.executeInstructions(instructions);

        Assertions.assertThat("Rover{ position=Position[x=1, y=1], direction=SOUTH}")
                .isEqualTo(rover.toString());
    }
}
