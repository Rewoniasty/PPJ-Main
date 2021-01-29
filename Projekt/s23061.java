import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class s23061 {
    public static void addAircraft(Aircraft a, Aircraft[][]arr2D, int lines, int multi){
        int index = a.geometricSequenceIndex();
        for (int i = 0; i < lines*multi-1; i++) {
            if (null == arr2D[index][i]) {
                arr2D[index][i] = a;
                break;
            }
        }
    }

    public static void sortAircrafts(Aircraft[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] != null && array[j-1] != null) {
                    if (array[j].distance() < array[j - 1].distance()){
                        Aircraft tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Aircraft[] toSave = {
            new FighterJet(546,265,20000,1153,1,0.544,"PL", "f-16"),
            new Baloon(4, 423, 2525, 636, 6, 0.222, "PL", "black", 55000),
            new AirshipCargo(123, 456, 789, 200, 5, 0.365, "DE", 32000, "Boeing"),
            new AirshipPassenger(999, 333, 254, 600, 205, 0.476, "UK", "Warsaw", "LO-526"),
            new Drone(34, 78, 36, 100, 0, 0.1, "PL", 4),
            new FighterJet(700, 800, 12000, 770, 1, 0.544, "DE", "f-18"),
            new Baloon(653, 346, 422, 2, 5, 0.987, "EN", "green", 25000),
            new AirshipCargo(432, 734,9000, 600,4,0.674,"ES", 53000, "Airbus"),
            new AirshipPassenger(22,87,1000,300,391,0.5,"DE", "Berlin", "LU-2A7"),
            new Drone(25,73,15,45,0,0.163,"PL", 8),
            new FighterJet(546,265,20000,1153,1,0.544,"PL", "f-16"),
            new Baloon(4, 423, 2525, 636, 6, 0.222, "PL", "black", 55000),
            new AirshipCargo(123, 456, 789, 200, 5, 0.365, "DE", 32000, "Boeing"),
            new AirshipPassenger(999, 333, 254, 600, 205, 0.476, "UK", "Warsaw", "LO-526"),
            new Drone(34, 78, 36, 100, 0, 0.1, "PL", 4),
            new FighterJet(700, 800, 12000, 770, 1, 0.544, "DE", "f-18"),
            new Baloon(653, 346, 422, 2, 5, 0.987, "EN", "green", 25000),
            new AirshipCargo(432, 734,9000, 600,4,0.674,"ES", 53000, "Airbus"),
            new AirshipPassenger(22,87,1000,300,391,0.5,"DE", "Berlin", "LU-2A7"),
            new Drone(25,73,15,45,0,0.163,"PL", 8),
            new FighterJet(546,265,20000,1153,1,0.544,"PL", "f-16"),
            new Baloon(4, 423, 2525, 636, 6, 0.222, "PL", "black", 55000),
            new AirshipCargo(123, 456, 789, 200, 5, 0.365, "DE", 32000, "Boeing"),
            new AirshipPassenger(999, 333, 254, 600, 205, 0.476, "UK", "Warsaw", "LO-526"),
            new Drone(34, 78, 36, 100, 0, 0.1, "PL", 4),
            new FighterJet(700, 800, 12000, 770, 1, 0.544, "DE", "f-18"),
            new Baloon(653, 346, 422, 2, 5, 0.987, "EN", "green", 25000),
            new AirshipCargo(432, 734,9000, 600,4,0.674,"ES", 53000, "Airbus"),
            new AirshipPassenger(22,87,1000,300,391,0.5,"DE", "Berlin", "LU-2A7"),
            new Drone(25,73,15,45,0,0.163,"PL", 8),
            new FighterJet(546,265,20000,1153,1,0.544,"PL", "f-16"),
            new Baloon(4, 423, 2525, 636, 6, 0.222, "PL", "black", 55000),
            new AirshipCargo(123, 456, 789, 200, 5, 0.365, "DE", 32000, "Boeing"),
            new AirshipPassenger(999, 333, 254, 600, 205, 0.476, "UK", "Warsaw", "LO-526"),
            new Drone(34, 78, 36, 100, 0, 0.1, "PL", 4),
            new FighterJet(700, 800, 12000, 770, 1, 0.544, "DE", "f-18"),
            new Baloon(653, 346, 422, 2, 5, 0.987, "EN", "green", 25000),
            new AirshipCargo(432, 734,9000, 600,4,0.674,"ES", 53000, "Airbus"),
            new AirshipPassenger(22,87,1000,300,391,0.5,"DE", "Berlin", "LU-2A7"),
            new Drone(25,73,15,45,0,0.163,"PL", 8),
            new FighterJet(546,265,20000,1153,1,0.544,"PL", "f-16"),
            new Baloon(4, 423, 2525, 636, 6, 0.222, "PL", "black", 55000),
            new AirshipCargo(123, 456, 789, 200, 5, 0.365, "DE", 32000, "Boeing"),
            new AirshipPassenger(999, 333, 254, 600, 205, 0.476, "UK", "Warsaw", "LO-526"),
            new Drone(34, 78, 36, 100, 0, 0.1, "PL", 4),
            new FighterJet(700, 800, 12000, 770, 1, 0.544, "DE", "f-18"),
            new Baloon(653, 346, 422, 2, 5, 0.987, "EN", "green", 25000),
            new AirshipCargo(432, 734,9000, 600,4,0.674,"ES", 53000, "Airbus"),
            new AirshipPassenger(22,87,1000,300,391,0.5,"DE", "Berlin", "LU-2A7"),
            new Drone(25,73,15,45,0,0.163,"PL", 8)
        };

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
                        String rawAircraftData = scanner.nextLine();
                        for (int j = 0; j < multi; j++) {

                            String[] preparedAircraftData = rawAircraftData.split(",");

                            switch (preparedAircraftData[0]) {
                                case "AirshipPassenger":
                                    AirshipPassenger ap = new AirshipPassenger(
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Integer.parseInt(preparedAircraftData[5]), // maxNoPeople
                                            Double.parseDouble(preparedAircraftData[6]), // vector
                                            preparedAircraftData[7], // nationality
                                            preparedAircraftData[8], // hub
                                            preparedAircraftData[9]); // code

                                    addAircraft(ap, tempAircrafts, lines, multi);
                                    break;
                                case "AirshipCargo":
                                    AirshipCargo ac = new AirshipCargo(
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Integer.parseInt(preparedAircraftData[5]), // maxNoPeople
                                            Double.parseDouble(preparedAircraftData[6]), // vector
                                            preparedAircraftData[7], // nationality
                                            Double.parseDouble(preparedAircraftData[8]), // cargoCapacity
                                            preparedAircraftData[9]); // brand

                                    addAircraft(ac, tempAircrafts, lines, multi);
                                    break;
                                case "Drone":
                                    Drone d = new Drone(
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Integer.parseInt(preparedAircraftData[5]), // maxNoPeople
                                            Double.parseDouble(preparedAircraftData[6]), // vector
                                            preparedAircraftData[7], // nationality
                                            Integer.parseInt(preparedAircraftData[8])); // noEngines

                                    addAircraft(d, tempAircrafts, lines, multi);
                                    break;
                                case "FighterJet":
                                    FighterJet f = new FighterJet(
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                            (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                            Integer.parseInt(preparedAircraftData[4]), // velocity
                                            Integer.parseInt(preparedAircraftData[5]), // maxNoPeople
                                            Double.parseDouble(preparedAircraftData[6]), // vector
                                            preparedAircraftData[7], // nationality
                                            preparedAircraftData[8]); // model

                                    addAircraft(f, tempAircrafts, lines, multi);
                                    break;
                                case "Baloon":
                                Baloon b = new Baloon(
                                        (int) (Math.random() * 2187 / Math.sqrt(2)), // x
                                        (int) (Math.random() * 2187 / Math.sqrt(2)), // y
                                        (int) (Math.random() * 2187 / Math.sqrt(2)), // z
                                        Integer.parseInt(preparedAircraftData[4]), // velocity
                                        Integer.parseInt(preparedAircraftData[5]), // maxNoPeople
                                        Double.parseDouble(preparedAircraftData[6]), // vector
                                        preparedAircraftData[7], // nationality
                                        preparedAircraftData[8], // color
                                        Double.parseDouble(preparedAircraftData[9])); // airVolume

                                addAircraft(b, tempAircrafts, lines, multi);
                                break;
                            }
                        }
                    }
                    for (Aircraft[] arr : tempAircrafts){
                        if (arr != null)
                            sortAircrafts(arr);
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
                    System.out.println(e);
                }
            }
        }
    }
}

class Aircraft {
    protected int x, y, z, velocity, maxNoPeople;
    protected double vector;
    protected String nationality;

    public Aircraft(int x, int y, int z, int velocity, int maxNoPeople, double vector, String nationality) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.maxNoPeople = maxNoPeople;
        this.velocity = velocity;
        this.vector = vector;
        this.nationality = nationality;
    }

    public int distance() {
        return (int) (Math.sqrt(this.x * this.x + this.x * this.x));
    }

    public int geometricSequenceIndex() {
        int distance = this.distance();
        int index = 0;
        for (int i = 1; i < 7; i++) {
            if (Math.pow(3, i) > distance) {
                break;
            }
            index++;
        }
        return index;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "," + this.x + "," + this.y + "," + this.z + "," + this.velocity + "," + this.maxNoPeople + "," + this.vector + ","
                + this.nationality;
    }
}

class AirshipPassenger extends Aircraft {
    protected String hub, code;

    public AirshipPassenger(int x, int y, int z, int velocity, int maxNoPeople, double vector, String nationality, String hub, String code) {
        super(x, y, z, velocity, maxNoPeople, vector, nationality);
        this.hub = hub;
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.hub + "," + this.code;
    }
}

class AirshipCargo extends Aircraft {
    protected double cargoCapacity;
    protected String brand;

    public AirshipCargo(int x, int y, int z, int velocity, int maxNoPeople, double vector, String nationality, double cargoCapacity, String brand) {
        super(x, y, z, velocity, maxNoPeople, vector, nationality);
        this.cargoCapacity = cargoCapacity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.cargoCapacity + "," + this.brand;
    }
}

class Drone extends Aircraft {
    protected int noEngines;

    public Drone(int x, int y, int z, int velocity, int maxNoPeople, double vector, String nationality, int noEngines) {
        super(x, y, z, velocity, maxNoPeople, vector, nationality);
        this.noEngines = noEngines;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.noEngines;
    }
}

class FighterJet extends Aircraft {
    protected double mach;
    protected String model;

    public FighterJet(int x, int y, int z, int velocity, int maxNoPeople, double vector, String nationality, String model) {
        super(x, y, z, velocity, maxNoPeople, vector, nationality);
        this.mach = velocity * 0.000809;
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.mach + "," + this.model;
    }
}

class Baloon extends Aircraft{
    protected String color;
    protected double airVolume;

    public Baloon(int x, int y, int z, int velocity, int maxNoPeople, double vector, String nationality, String color, double airVolume) {
        super(x, y, z, velocity, maxNoPeople, vector, nationality);
        this.color = color;
        this.airVolume = airVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.color + "," + this.airVolume;
    }
}