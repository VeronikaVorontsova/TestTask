//Пользователь вводит количество этажей в доме, количество квартир на этаж и номер квартиры.
// Рассчитать, в каком подъезде и на каком этаже находится эта квартира
import  java.util.Scanner;

public class ApartmentCalculator  {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //System.out.println(47%48);
        System.out.println("Введите количество этажей в доме: ");
        int totalFloors = scr.nextInt();
        System.out.println("Введите количество квартир на этаже: ");
        int flatsPerFloor = scr.nextInt();
        System.out.println("Введите номер квартиры: ");
        int apartmentNumber = scr.nextInt();

        int flatsPerEntrance = totalFloors*flatsPerFloor;
        countEntrance(apartmentNumber, flatsPerEntrance);
        countFloor(apartmentNumber, flatsPerFloor, flatsPerEntrance, totalFloors);
    }
    static void countFloor (int apartmentNumber, int flatsPerFloor, int flatsPerEntrance, int totalFloors) {
        int apartmentFloor=0;

        int flatDivRemain = apartmentNumber%flatsPerEntrance;
        int floorDivRemain = flatDivRemain%flatsPerFloor;

        if (floorDivRemain>0 ) {
            apartmentFloor=(flatDivRemain/flatsPerFloor)+1;
        }
        if (floorDivRemain==0){
            apartmentFloor = flatDivRemain/flatsPerFloor;
        }
        if (apartmentFloor==0) {
            apartmentFloor=totalFloors;
        }
        System.out.println("Данная квартира находится на этаже " + apartmentFloor);
    }
    static void countEntrance(int apartmentNumber, int flatsPerEntrance) {

        int apartmentEntrance = 0;

        int entranceDivRemain = apartmentNumber%flatsPerEntrance;
        if (entranceDivRemain>0) {
            apartmentEntrance = (apartmentNumber/flatsPerEntrance) +1;
        }
        if (entranceDivRemain == 0) {
            apartmentEntrance = apartmentNumber/flatsPerEntrance;
        }
        System.out.println("Данная квартира находится в подъезде " +apartmentEntrance);
    }
}
