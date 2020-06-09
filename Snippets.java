package problemSolution;

public class Snippets {
	
	private final double pi = Math.PI;
	
/** An object has been created and each method has been called
 * and commented, so that you may uncomment the desired formula
 * input the values for the parameters and test it with ease.
 */
	public static void main(String[] args) {
		Snippets snip=new Snippets();
		
		//System.out.println(snip.areaOfASquare());
		//System.out.println(snip.areaOfARectangle());
		//System.out.println(snip.areaOfATriangle());
		//System.out.println(snip.areaOfATrapezoid());
		//System.out.println(snip.areaOfACircle());
		//System.out.println(snip.circumferenceOfACircle());
		//System.out.println(snip.surfaceAreaOfACube());
		//System.out.println(snip.curvedSurfaceAreaOfACylinder());
		//System.out.println(snip.totalSurfaceAreaOfACylinder());
		//System.out.println(snip.volumeOfACylinder());
		//System.out.println(snip.Acceleration());
		//System.out.println(snip.Density());
		//System.out.println(snip.Pressure());
		//System.out.println(snip.kineticEnergy());
		//System.out.println(snip.Voltage());

	}
	
	public double areaOfASquare(double a) {
		double aos= a*a;
		return aos ;
	}
	
	public double areaOfARectangle(double length, double breadth){
		double aos = length * breadth;
		return aos;
	}
	
	public double areaOfATriangle(double base, double height ) {
		double aot = 1/2f * base * height;
		return aot;
	}
	
	public double areaOfATrapezoid(double b1, double b2, double height ) {
		double aotz = 1/2f * (b1 + b2) * height;
		return aotz;
	}

	public double areaOfACircle(double radius ) {
		double aoc = pi * (Math.pow(radius, 2));
		return aoc;
	}
	
	public double circumferenceOfACircle( double radius ) {
		double coc = 2 * pi * radius;
		return coc;
	}
	
	public double surfaceAreaOfACube(double a) {
		double sac = 6*(a*a);
		return sac;
	}
	
	public double curvedSurfaceAreaOfACylinder (double radius, double height) {
		double csac = 2*pi*radius*height;
		return csac;
	}
	
	public double totalSurfaceAreaOfACylinder ( double radius, double height) {
		double tsac = 2*pi*radius*(radius + height);
		return tsac;
	}
		
	public double volumeOfACylinder (double radius, double height) {
		double voc = pi*(Math.pow(radius, 2))*height;
		return voc;
	}
	
	public double Acceleration (double v, double u, double t) {
		double accel = (v - u)/t;
		return accel;
	}
	
	public double Density (double mass, double volume) {
		double den = mass/volume;
		return den;
	}
	
	public double Pressure (double force, double area) {
		double P = force / area;
		return P;
	}
	
	public double kineticEnergy (double mass, double velocity) {
		double E = 1/2f * (mass*(Math.pow(velocity, 2)));
		return E;
	}
	
	public double Voltage (double current, double resistance) {
		double V = current * resistance;
		return V;
	}
	

}
