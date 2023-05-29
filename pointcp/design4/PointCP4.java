// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP4
{
    //Instance variables ************************************************

    /**
     * Contains C(artesian) or P(olar) to identify the type of
     * coordinates that are being dealt with.
     */
    //private char typeCoord;

    /**
     * Contains the current value of X or RHO depending on the type
     * of coordinates.
     */
    private double x,Rho;

    /**
     * Contains the current value of Y or THETA value depending on the
     * type of coordinates.
     */
    private double y,Theta;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP4(double x,double y, double Rho,double Theta)
    {
        this.Rho = Rho;
        this.Theta = Theta;
        this.x = x;
        this.y = y;
    }


    //Instance methods **************************************************


    public double getX()
    {
      return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRho()
    {
      return Rho;
    }

    public double getTheta()
    {
       return Theta;
    }


    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */


    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public void convertStorageToCartesian()
    {
       rotatePoint(Math.tan(getY()/getX()));
    }




    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public void rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();


               Rho =  (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y);
               Theta = (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y);
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as Cartesian  (" + getX() + "," + getY() + ") " +
                ": Polar [" + getRho() + "," + getTheta() + "])" + "\n";
    }
}
