public class Sport extends BaseModification {
    private Car car;

    public Sport(Car car) {
        super();
    }

    @Override
    public int engine() {
        return this.engine()+2;
    }

    @Override
    public double ride() {
        return this.ride()+1.5;
    }

    @Override
    public double getAcceleration() {
        return this.getAcceleration()-2.4;
    }


    @Override
    public String giveComfort() {
        return "leather";
    }


    @Override
    public double diagonalOfMultimedia() {
        return this.diagonalOfMultimedia()+2;
    }
}