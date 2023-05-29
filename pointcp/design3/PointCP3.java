//import design5.PointCP5;

public class PointCP3 extends PointCP5  {
  
  public PointCP3 (char type, double xOrRho, double yOrTheta) {
    if (type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    if (type == 'P') {
        this.yOrTheta = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
        this.xOrRho = (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    } else {
      this.xOrRho = xOrRho;
      this.yOrTheta = yOrTheta;
    }
  }

  public double getX() {
    return xOrRho;
  }

  public double getY() {
    return yOrTheta;
  }

  public double getRho() {
    return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
    
  }

  public double getTheta() {
    return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }

  public double getDistance(PointCP5 point) {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    PointCP3 pointB = (PointCP3)point;
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();

    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }
  public String toString() {
    return "Stored as Cartesian [" + getX() + "," + getY() + "]" + "\n";
  }
}
