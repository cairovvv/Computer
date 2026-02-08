public class Processor {
    private String model;

    public String getRole() {
        return "I am the Processor Class. I handle the computing logic for the system.\n";
    }

    public String processData() {
        return "Processor " + model + " is calculating data...";
    }

    public Processor(String model) {
        this.model = model;
    }
}
