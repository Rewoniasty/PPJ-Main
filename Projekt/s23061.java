import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class s23061 {
    public static void addAircraft(Aircraft a, Aircraft[][]arr2D, int lines){
        int index = a.geometricSequenceIndex();
        for (int i = 0; i < lines; i++) {
            if (null == arr2D[index][i]) {
                arr2D[index][i] = a;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Aircraft[] toSave = { new AirshipCargo(515, 3242342, 434, 6564, 0.5342, 43224, "DHL"),
                new Drone(525, 423, 788, 11444, 0.123, 5) };

        if (args != null) {
            if (args[0].equals("load")) {
                try {
                    File data = new File("data.txt");
                    int multi = Integer.parseInt(args[1]);

                    Scanner scanLines = new Scanner(data);
                    int lines = 0;
                    while (scanLines.hasNextLine()) {
                        lines++;
                        scanLines.nextLine();
                    }
                    scanLines.close();

                    Aircraft[][] tempAircrafts = new Aircraft[7][lines * multi];
                    Scanner scanner = new Scanner(data);

                    while (scanner.hasNextLine()) {
                        for (int j = 0; j < multi; j++) {
                            String rawAircraftData = scanner.nextLine();
                            String[] preparedAircraftData = rawAircraftData.split(",");

                            switch (preparedAircraftData[0]) {
                                case "AirshipPassenger":
                                    AirshipPassenger ap = new AirshipPassenger(
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Double.parseDouble(preparedAircraftData[5]), // vector
                                            Integer.parseInt(preparedAircraftData[6]), // passengerCount
                                            preparedAircraftData[7]); // code

                                    addAircraft(ap, tempAircrafts, lines);
                                    break;
                                case "AirshipCargo":
                                    AirshipCargo ac = new AirshipCargo((int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Double.parseDouble(preparedAircraftData[5]), // vector
                                            Double.parseDouble(preparedAircraftData[6]), // capacity
                                            preparedAircraftData[7]); // brand

                                    addAircraft(ac, tempAircrafts, lines);
                                    break;
                                case "Drone":
                                    Drone d = new Drone((int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Double.parseDouble(preparedAircraftData[5]), // vector
                                            Integer.parseInt(preparedAircraftData[6])); // capacity

                                    addAircraft(d, tempAircrafts, lines);
                                    break;
                            }
                        }
                        scanner.nextLine();
                    }
                    scanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
            }
            if (args[0].equals("save")) {
                try {
                    FileWriter writer = new FileWriter("data.txt");

                    for (Aircraft aircraft : toSave) {
                        writer.write(aircraft.toString() + "\n");
                    }

                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                }
            }
        }
    }
}

class Aircraft {
    protected int x, y, z, velocity;
    protected double vector;

    public Aircraft(int x, int y, int z, int velocity, double vector) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.velocity = velocity;
        this.vector = vector;
    }

    public int distance(int x, int y) {
        return (int) (Math.sqrt(x * x + y * y));
    }

    public int geometricSequenceIndex() {
        int distance = this.distance(x, y);
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (Math.pow(3, i) > distance) {
                break;
            }
            index++;
        }
        return index;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "," + this.x + "," + this.y + "," + this.z + "," + this.velocity + ","
                + this.vector;
    }
}

class AirshipPassenger extends Aircraft {
    protected int passengerCount;
    protected String code;

    public AirshipPassenger(int x, int y, int z, int velocity, double vector, int passengerCount, String code) {
        super(x, y, z, velocity, vector);
        this.passengerCount = passengerCount;
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.passengerCount + "," + this.code;
    }
}

class AirshipCargo extends Aircraft {
    protected double capacity;
    protected String brand;

    public AirshipCargo(int x, int y, int z, int velocity, double vector, double capacity, String brand) {
        super(x, y, z, velocity, vector);
        this.capacity = capacity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.capacity + "," + this.brand;
    }
}

class Drone extends Aircraft {
    protected int engines;

    public Drone(int x, int y, int z, int velocity, double vector, int engines) {
        super(x, y, z, velocity, vector);
        this.engines = engines;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.engines;
    }
}

class FighterJet extends Aircraft {
    protected double mach;
    protected String model;

    public FighterJet(int x, int y, int z, int velocity, double vector, String model) {
        super(x, y, z, velocity, vector);
        this.mach = velocity * 0.000809;
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.mach + "," + this.model;
    }
}