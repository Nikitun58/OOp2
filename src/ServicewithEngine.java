public abstract class ServicewithEngine extends WheelReplacement {
    public ServicewithEngine(String modelName,int wheelesCount ) {
        super(modelName, wheelesCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void doService() {
        super.doService();
        checkEngine();
    }
}

