package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        //Algo: Move n-1 from Source to helper
        //Move 1 from Source to destination (print)
        //Move n-1 from helper back to destination

        printPathForTowerOfHanoi(3, 'A', 'B', 'C');


    }

    private static void printPathForTowerOfHanoi(int numberOfDisk, char source, char destination, char helper) {
        if (numberOfDisk < 1)
            return;
        printPathForTowerOfHanoi(numberOfDisk - 1, source, helper, destination);
        System.out.println(source + "->" + destination);
        printPathForTowerOfHanoi(numberOfDisk - 1, helper, destination, source);
    }

}
