public abstract class WheelReplacement implements Сarmaintenance {
         private final String modelName;
         private final int wheelsCount;

        public WheelReplacement(String modelName, int wheelesCount) {
            this.wheelsCount = wheelesCount;
            this.modelName = modelName;
        }
        public void updateTyre() {
        System.out.println("Меняем покрышку");
        }

        public int getWheelsCount() {
            return wheelsCount;
        }

        public String getModelName() {
            return modelName;
        }

    @Override
    public void doService() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();

        }
    }
}