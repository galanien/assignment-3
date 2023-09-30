public class Laptop extends Device {
    private String processor;
    private int memory;

    public Laptop(String type, double price, double weight, String processor, int memory) {
        super(type, price, weight);
        this.processor = processor;
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + ", Processor: " + processor + ", Memory: " + memory + " GB";
    }
}
