public class Sphere extends Shape {

	private final double radius;

	// Initializes the sphere's radius.
	public Sphere(double radius) {
		this.radius = radius;
	}

	// Calculates the sphere's surface area.
	@Override
	public double surface_area() {
		return 4.0 * Math.PI * radius * radius;
	}

	// Calculates the sphere's volume.
	@Override
	public double volume() {
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}

	// Returns the radius, surface area, and volume.
	@Override
	public String toString() {
		return String.format("Sphere%nRadius: %.2f%nSurface area: %.2f%nVolume: %.2f%n", radius, surface_area(), volume());
	}
}