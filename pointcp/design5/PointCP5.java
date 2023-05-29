public abstract class PointCP5 {
    protected double xOrRho;
    protected double yOrTheta;
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract double getDistance(PointCP5 point);
    public abstract String toString();
}
