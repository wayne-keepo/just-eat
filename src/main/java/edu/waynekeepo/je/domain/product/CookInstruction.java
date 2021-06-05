package edu.waynekeepo.je.domain.product;

import edu.waynekeepo.je.domain.base.DomainID;

import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

// TODO: think about how best to model this class
public class CookInstruction extends DomainID {
    private List<Instruction> instructions;
    private InstructionStatus status;

    private static class Instruction{
        private final int step;
        private String description;

        public Instruction(int step, String description) {
            this.step = step;
            this.description = description;
        }

        public int getStep() {
            return step;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String instruction) {
            this.description = instruction;
        }

        @Override
        public String toString() {
            return "{\"step\": \"%d\", \"instruction\": \"%s\"}".formatted(this.step, this.description);
        }
    }

    public enum InstructionStatus {
        ACTIVE,
        ARCHIVED
    }

    public CookInstruction() {
        this.status = InstructionStatus.ACTIVE;
        this.instructions = new ArrayList<>();
    }

    public CookInstruction(Map<Integer, String> ins) {
        this.status = InstructionStatus.ACTIVE;
        this.instructions = new ArrayList<>(ins.size());
        ins.forEach((step, inst) -> instructions.add(new Instruction(checkOrGenerateStep(step), inst)));
        sortInstructions();
    }

    // TODO: investigate it with no normal step numbers
    public void addOrUpd(int step, String description) {
        int idx = max(checkOrGenerateStep(step), 0);
        if (idx >= instructions.size())
            add(idx, description);
        else update(idx - 1, description);
    }

    private void add(int step, String description) {
        instructions.add(new Instruction(step, description));
    }

    private void update(int idx, String description) {
        instructions.get(idx).setDescription(description);
    }

/*    public String getInstructionDescriptionByStep(int step) {
        Optional<Instruction> ins = this.instructions.stream().filter(i -> i.getStep() == step).findFirst();
        return ins.isPresent() ? ins.get().getDescription() : "";
    }*/

    private int checkOrGenerateStep(int step) {
        return min(step, this.instructions.size() + 1);
    }

    private void sortInstructions() {this.instructions.sort(Comparator.comparing(Instruction::getStep));}

    @Override
    public String toString() {
        return """
                {"title": "CookInstruction", "id": "%s", "status": "%s", "instructions": "%s"}
                """.formatted(this.id, this.status, this.instructions);

    }
}
