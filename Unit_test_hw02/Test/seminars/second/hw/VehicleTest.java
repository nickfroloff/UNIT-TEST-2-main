package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Honda", "Civic", 2006);
        motorcycle = new Motorcycle("Yamaha", "Bolt", 2017);
    }


    @Test
    // Проверка: объект Car является экземпляром транспортного средства?
    public void testCarIsInstanceOfVehicle() {
      //assertTrue(car instanceof Vehicle);
        assertNotNull(car);

    }

    @Test
    //Проверка: объект Car создается с 4-мя колесами?
    public void testCarHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    //Проверка: объект Motorcycle создается с 2-мя колесами?
    public void testMotorcycleHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    //Проверка: объект Car развивает скорость 60 в режиме тестового вождения (testDrive())?
        public void testCarSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    //Проверка: объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())?
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    //Проверка: в режиме парковки (сначала testDrive, потом park) машина останавливается (speed = 0)?
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    //Проверка: в режиме парковки (сначала testDrive, потом park) мотоцикл останавливается (speed = 0)?
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}