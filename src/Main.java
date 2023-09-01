public class Main {

    private static java.util.Scanner Scanner;
// Elevator
//    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//       while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner (System.in).nextInt();
//            elevator.move(floor);
//       }
//   }

    //Cargo
    public static void main(String[] args) {
        // Creates an instance of the Cargo class
        Dimensions dimensions = new Dimensions(10, 5, 7);
        double weight = 50.5;
        String deliveryAddress = "123 Main St";
        boolean isFlippable = true;
        String registrationNumber = "ABC123";
        boolean isFragile = false;

        Cargo cargo = new Cargo(dimensions, weight, deliveryAddress, isFlippable, registrationNumber, isFragile);

        // Creates copies of the cargo object with modified fields
        Cargo copy1 = cargo.withDeliveryAddress("456 Elm St");
        Cargo copy2 = cargo.withDimensions(new Dimensions(8, 4, 6));
        Cargo copy3 = cargo.withWeight(60.0);

        // Verifying that copying is happening
        System.out.println("Original cargo: " + cargo.getDeliveryAddress());
        System.out.println("Copy 1: " + copy1.getDeliveryAddress());
        System.out.println("Copy 2: " + copy2.getDimensions().getWidth());
        System.out.println("Copy 3: " + copy3.getWeight());
    }

}