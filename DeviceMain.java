import java.util.Random;
import java.util.HashSet;

public class DeviceMain {
    public static void main(String[] args) {

        Random random = new Random();

        int numberOfDevices = 0;

        do {
            System.out.print("Enter the number of devices (1-20): ");
            numberOfDevices = random.nextInt(20) + 1;
        } while (numberOfDevices < 1 || numberOfDevices > 20);


        HashSet<String> distinctDeviceTypes = new HashSet<>();


        Device[] devices = new Device[numberOfDevices];


        for (int i = 0; i < numberOfDevices; i++) {
            int deviceType = random.nextInt(3);


            String type;
            double price = random.nextDouble() * 1000;
            double weight = random.nextDouble() * 2000;

            switch (deviceType) {
                case 0:

                    type = "Smartphone";
                    double screenSize = random.nextDouble() * 6 + 4;
                    int cameraResolution = random.nextInt(20) + 5;
                    devices[i] = new Smartphone(type, price, weight, screenSize, cameraResolution);
                    distinctDeviceTypes.add(type);
                    break;
                case 1:

                    type = "Laptop";
                    String[] processors = {"Intel Core i5", "Intel Core i7", "AMD Ryzen 5", "AMD Ryzen 7"};
                    String processor = processors[random.nextInt(processors.length)];
                    int memory = random.nextInt(24) + 4;
                    devices[i] = new Laptop(type, price, weight, processor, memory);
                    distinctDeviceTypes.add(type);
                    break;
                case 2:

                    type = "Tablet";
                    String[] operatingSystems = {"iOS", "Android", "Windows"};
                    String operatingSystem = operatingSystems[random.nextInt(operatingSystems.length)];
                    boolean hasCellular = random.nextBoolean();
                    devices[i] = new Tablet(type, price, weight, operatingSystem, hasCellular);
                    distinctDeviceTypes.add(type);
                    break;
            }
        }


        double totalPrice = 0;
        double totalWeight = 0;

        for (Device device : devices) {
            totalPrice += device.getPrice();
            totalWeight += device.getWeight();
        }


        System.out.println("Number of distinct device types created: " + distinctDeviceTypes.size());
        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " grams");
    }
}
