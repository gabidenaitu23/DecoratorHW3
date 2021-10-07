public class Main {
    public static void main(String[] args) {
        Car toyotaCamry = new ToyotaCamry();

        System.out.println(String.valueOf(toyotaCamry.engine()) + "-cylinder" + String.valueOf(toyotaCamry.ride()) + "litres engine drives the car and allows you to accelerate to 100 km / h in" + String.valueOf(toyotaCamry.getAcceleration()) + "seconds");
        System.out.println("the car gives you a comfortable interior with a" + String.valueOf(toyotaCamry.diagonalOfMultimedia()) + " inch multimedia system," + String.valueOf(toyotaCamry.giveComfort()) + " seats and other features");


        Car prestige = new Prestige(toyotaCamry);

        System.out.println(String.valueOf(prestige.engine()) + "-cylinder" + String.valueOf(prestige.ride()) + "litres engine drives the car and allows you to accelerate to 100 km / h in" + String.valueOf(prestige.getAcceleration()) + "seconds");
        System.out.println("the car gives you a comfortable interior with a" + String.valueOf(prestige.diagonalOfMultimedia()) + " inch multimedia system," + String.valueOf(prestige.giveComfort()) + " seats and other features");


        Car luxe = new Luxe(toyotaCamry);

        System.out.println(String.valueOf(luxe.engine()) + "-cylinder" + String.valueOf(luxe.ride()) + "litres engine drives the car and allows you to accelerate to 100 km / h in" + String.valueOf(luxe.getAcceleration()) + "seconds");
        System.out.println("the car gives you a comfortable interior with a" + String.valueOf(luxe.diagonalOfMultimedia()) + " inch multimedia system," + String.valueOf(luxe.giveComfort()) + " seats and other features");


        Car sport = new Sport(toyotaCamry);

        System.out.println(String.valueOf(sport.engine()) + "-cylinder" + String.valueOf(sport.ride()) + "litres engine drives the car and allows you to accelerate to 100 km / h in" + String.valueOf(sport.getAcceleration()) + "seconds");
        System.out.println("the car gives you a comfortable interior with a" + String.valueOf(sport.diagonalOfMultimedia()) + " inch multimedia system," + String.valueOf(sport.giveComfort()) + " seats and other features");

    }
}
