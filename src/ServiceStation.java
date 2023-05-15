public class ServiceStation {
    public void check(Сarmaintenance сarmaintenance) {
        сarmaintenance.doService();
    }
    public void check(Сarmaintenance[] сarmaintenances) {
        for (Сarmaintenance сarmaintenance : сarmaintenances) {
            сarmaintenance.doService();
        }
    }
}
