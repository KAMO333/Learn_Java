package corejava;//Anonymous Classes helps me extend classes on the fly

class Machine {
    public void start() {
        System.out.println("woooosh");
    }
}

// Subclass that overrides the start method
class AdvancedMachine extends Machine {
    @Override
    public void start() {
        System.out.println("starting...");
    }
}

class StartProgram {
    public static void main(String[] args) {
        Machine m = new AdvancedMachine();
        Machine m2 = new AdvancedMachine();// Upcasting
        m2.start(); // Output: "starting..."
    }
}
