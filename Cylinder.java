public class Cylinder extends Shape {

	private final double radius;
	private final double height;

	// Initializes the cylinder's radius and height.
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// Calculates the total surface area, including both circular ends.
	@Override
	public double surface_area() {
		return 2.0 * Math.PI * radius * (radius + height);
	}

	// Calculates the cylinder's volume.
	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}

	// Returns the dimensions, surface area, and volume.
	@Override
	public String toString() {
		return String.format(
				"Cylinder%nRadius: %.2f%nHeight: %.2f%n" + "Surface area: %.2f%nVolume: %.2f%n", radius, height, surface_area(), volume());
	}
}