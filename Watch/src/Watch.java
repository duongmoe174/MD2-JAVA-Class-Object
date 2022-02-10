public class Watch {
    long startTime;
    long endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop () {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        long resutl = this.endTime - this.startTime;
        return resutl;
    }
}
