public class Computer {
    private String brand;
    private Processor cpu; // Composition
    private User currentUser; // Aggregation

    public String getRole() {
        return "I am the Computer Class. I am the main system that holds the components.\n";
    }

    public Computer(String brand, String cpuModel, User user) {
        this.brand = brand;
        this.currentUser = user; 
        // Composition: The Computer creates the Processor directly
        this.cpu = new Processor(cpuModel);
    }

    public String powerOn() {
        return "Booting " + brand + " computer...\n" + 
               currentUser.getSessionInfo() + "\n" + 
               cpu.processData();
    }
}
