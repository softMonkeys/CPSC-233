import java.util.Random;

public class Test
{
  public static void main(String [] args)
  {
    int numberOfVehicle = 8;


// Test code #1
    Car car1 = new Car();
    car1.setMaxPassengersCount(4);
    Car car2 = new Car("black", "Challenger", 2, 4500, 2);
    Bike bike1 = new Bike();
    Bike bike2 = new Bike(19, "Carbon");
    Truck truck1 = new Truck();
    Truck truck2 = new Truck(20, 2, 4000, 3, "Gold", "CAT");
    Bus bus1 = new Bus();
    Bus bus2 = new Bus(false, 2, 1600, 20);


// Test code #2
    Vehicle[] vehicles = {car1, car2, bike1, bike2, truck1, truck2, bus1, bus2};


// Test code #3
    Random generator = new Random();

    String consonants = "bcdfghjklmnpqrstvwxyz";
    String vowels = "aeiou";
    Passenger[] passengers = new Passenger[22];
    for (int i = 0; i < passengers.length; i++)
    {
      int randInt1 = generator.nextInt(21);
      int randInt2 = generator.nextInt(5);
      int randInt3 = generator.nextInt(21);
      int randInt4 = generator.nextInt(5);
      char[] nameChars = {Character.toUpperCase(consonants.charAt(randInt1)),
        vowels.charAt(randInt2),
        consonants.charAt(randInt3),
        vowels.charAt(randInt4)};
      String name = new String(nameChars);
      passengers[i] = new Passenger(name);
    }

    // Test code #4
    Passenger busDriver1 = passengers[0];
    busDriver1.updateLicenseClass(1);
    busDriver1.setDriverStatus(true);

    Passenger truckDriver1 = passengers[1];
    truckDriver1.updateLicenseClass(1);
    truckDriver1.setDriverStatus(true);

    Passenger bikeDriver1 = passengers[2];
    bikeDriver1.updateLicenseClass(5);
    bikeDriver1.setDriverStatus(true);

    Passenger bikeDriver2 = passengers[3];
    bikeDriver2.updateLicenseClass(7);
    bikeDriver2.setDriverStatus(true);

    Passenger carDriver1 = passengers[4];
    carDriver1.updateLicenseClass(1);
    carDriver1.setDriverStatus(true);

    Passenger carDriver2 = passengers[5];
    carDriver2.updateLicenseClass(5);
    carDriver2.setDriverStatus(true);

    Passenger carDriver3 = passengers[6];
    carDriver3.updateLicenseClass(7);
    carDriver3.setDriverStatus(true);

    // Test code #5
    for (int i = 0; i < vehicles.length; i++)
    {
      System.out.println(vehicles[i]);
      System.out.println();
    }

    for (int i = 0; i < passengers.length; i++)
    {
      System.out.println(passengers[i]);
      System.out.println();
    }

    // Test code #6
    bus1.addPassenger(busDriver1);

    truck1.addPassenger(truckDriver1);
    bike1.addPassenger(bikeDriver1);
    car1.addPassenger(carDriver1);
    car2.addPassenger(carDriver2);
    bike2.addPassenger(carDriver3);

    // Test code #7
    for (int i = 0; i < vehicles.length; i++)
    {
      System.out.println(vehicles[i]);
      System.out.println();
    }

    // Test code #8
    int passengerCount = 7;
    for (int i = 0; i < vehicles.length; i++)
    {
      while(passengerCount < passengers.length && vehicles[i].getPassengerCount() < vehicles[i].getMaxPassengersCount())
      {
        vehicles[i].addPassenger(passengers[passengerCount]);
        passengerCount++;
      }
    }

    // Test code #9
    for (int i = 0; i < vehicles.length; i++)
    {

      if (vehicles[i] instanceof PoweredVehicle)
      {
        for(int j = 0; j < 10; j++)
        {
          vehicles[i].accelerate();
        }
      }
      else if (vehicles[i] instanceof NonPoweredVehicle)
      {
        for(int j = 0; j < 8; j++)
        {
          vehicles[i].accelerate();
        }
      }
    }

    // Test code #10
    for (int i = 0; i < vehicles.length; i++)
    {

      if (vehicles[i] instanceof Car)
      {
        for(int j = 0; j < 5; j++)
        {
          vehicles[i].brake();
        }
      }
      else
      {
        for(int j = 0; j < 4; j++)
        {
          vehicles[i].brake();
        }
      }
    }

    // Test code #11
    double maxSpeed = vehicles[0].getSpeed();
    double minSpeed = vehicles[0].getSpeed();
    int maxSpeedVehicle = 0;
    int minSpeedVehicle = 0;

    for(int i = 1; i< vehicles.length; i++)
    {
      if (maxSpeed < vehicles[i].getSpeed())
      {
        maxSpeed = vehicles[i].getSpeed();
        maxSpeedVehicle = i;
      }
      else if (minSpeed > vehicles[i].getSpeed())
      {
        minSpeed = vehicles[i].getSpeed();
        minSpeedVehicle = i;
      }
    }
    System.out.println("Maximum speed: " + maxSpeed + "km/h" + "     Vehicle with max speed:\n");
    System.out.println(vehicles[maxSpeedVehicle]);

    System.out.println("Minimum speed: " + minSpeed + "km/h" + "     Vehicle with min speed:\n");
    System.out.println(vehicles[minSpeedVehicle]);
    System.out.println();

    // Test code #12
    Vehicle[] temp = new Vehicle[8];
    int vehicle_counter = 0;
    for (int i = 0; i < vehicles.length; i++)
    {
      if (vehicles[i].getDriver() != null && vehicles[i].canBeDriven(vehicles[i].getDriver()))
      {
        temp[vehicle_counter] = vehicles[i];
        vehicle_counter++;
      }
    }
    vehicles = temp;

    // Test code #13
    for (int i = 0; i < vehicles.length; i++)
    {
      System.out.println(vehicles[i]);
      System.out.println();
    }
  }
}
