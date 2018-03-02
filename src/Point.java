import java.io.Serializable;

/**
 * Point class with more functionality than the standard Point Java library.
 * 
 * @author Domenick DiBiase
 *
 */
public class Point implements Serializable {

	/** The serial version ID */
	private static final long serialVersionUID = 1L;
	/** X coordinate of the point object */
	private double x;
	/** Y coordinate of the point object */
	private double y;

	/**
	 * Constructor that initializes the coordinates to 0
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Constructor that sets the coordinates to specific values
	 * 
	 * @param x
	 *            value for the x coordinate
	 * @param y
	 *            value for the y coordinate
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Constructor to create a point based on the point given
	 * 
	 * @param other
	 */
	public Point(Point other) {
		if (other == null) {
			this.x = 0;
			this.y = 0;
		} else {
			this.x = other.getX();
			this.y = other.getY();
		}
	}

	/**
	 * Returns the value of the x coordinate
	 * 
	 * @return x value of the x coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * Returns the value of the y coordinate
	 * 
	 * @return y value of the y coordinate
	 */
	public double getY() {
		return y;
	}

	/**
	 * Tells how many degrees the point is rotated around the origin starting at the
	 * positive x-axis as 0 degrees.
	 * 
	 * @return angle in degrees
	 */
	public double degrees() {
		if (x < 0) {
			if (y < 0) {
				return Math.abs(Math.atan((double) y / x)) + 180;
			} else {
				return Math.atan((double) y / x) + 180;
			}
		} else {
			if (y < 0) {
				return Math.atan((double) y / x) + 360;
			} else {
				return Math.atan((double) y / x);
			}
		}
	}

	/**
	 * Sets the position of the point to the values specified
	 * 
	 * @param x
	 * @param y
	 */
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
}