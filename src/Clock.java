public interface Clock {
    public void Start();
    public void Pause();
    public void decreaseTime(int seconds);
    public void increaseTime(int seconds);

    public void displayTime();
}
