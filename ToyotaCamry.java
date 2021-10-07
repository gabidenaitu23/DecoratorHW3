public class ToyotaCamry implements Car{
    public double volume = 2.0;
    public int numberOfCylinders = 4;
    public double acceleration = 9.5;
    public double multimediaSize = 7.0;
    public String seatMaterial = "velour";

    @Override
    public int engine() {
        return this.numberOfCylinders;
    }

    @Override
    public double ride() {
        return this.volume;
    }

    @Override
    public double getAcceleration() {
        return this.acceleration;
    }


    @Override
    public String giveComfort() {
        return this.seatMaterial;
    }


    @Override
    public double diagonalOfMultimedia() {
        return this.multimediaSize;
    }
}
