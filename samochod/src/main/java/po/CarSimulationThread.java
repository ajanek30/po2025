package po;

public class CarSimulationThread extends Thread {
    private Car car;
    private volatile boolean running = true;

    public CarSimulationThread(Car car) {
        this.car = car;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (running) {
            try {
                car.update();
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void stopThread() {
        running = false;
        interrupt();
    }
}
