package leetcode.google;

class ParkingSystem implements Parking {

    int[] arr;

    public ParkingSystem(int big, int medium, int small) {
        arr = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (arr[carType - 1] > 0) {
            arr[carType - 1] = arr[carType - 1] - 1;
            return true;
        } else {
            return false;
        }
    }
}

interface Parking {
    public boolean addCar(int carType);
}

public class ParkingSystemMain {
    public static void main(String[] args) {
        Parking parking = new ParkingSystem(2, 1, 1);
        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(2));
        System.out.println(parking.addCar(3));
        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(1));
    }
}
