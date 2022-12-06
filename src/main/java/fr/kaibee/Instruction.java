package fr.kaibee;

public enum Instruction {
    LEFT, RIGHT, FORWARD, BACKWARD;

    public static Instruction toInstruction(char c) {
        return switch (c) {
            case 'L' ->  LEFT;
            case 'R' ->  RIGHT;
            case 'F' -> FORWARD;
            case 'B' -> BACKWARD;
            default -> throw new RuntimeException("Unsupported insctructions only L,R,F,B is ok!");
        };
    }
}
