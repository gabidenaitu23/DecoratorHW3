public class Prestige extends BaseModification {
    private Car car;

    public Prestige(Car car) {
        super();
    }

    @Override
    public int engine() {
        return this.engine();
    }

    @Override
    public double ride() {
        return this.ride()+0.5;
    }

    @Override
    public double getAcceleration() {
        return this.getAcceleration()-0.8;
    }


    @Override
    public String giveComfort() {
        return "leather";
    }


    @Override
    public double diagonalOfMultimedia() {
        return this.diagonalOfMultimedia();
    }
}
