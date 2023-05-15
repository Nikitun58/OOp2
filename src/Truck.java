public class Truck extends ServicewithEngine{
    public Truck (String modelName, int wheelsCount ) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void doService() {
        super.doService();
        checkTrailer();
    }
}
