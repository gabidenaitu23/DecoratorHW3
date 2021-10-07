abstract class BaseModification implements Car{

    private Car car;

    public BaseModification(Car car) {
        this.car = car;
    }

    public BaseModification() {

    }

    @Override
    public abstract double ride();

    @Override
    public abstract double getAcceleration();

    @Override
    public abstract int engine();

    @Override
    public abstract String giveComfort();

    @Override
    public abstract double diagonalOfMultimedia();
}
