public class Cone extends Shape {

	private final double radius;
	private final double height;

	// Initializes the cone's radius and height.
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// Calculates the total surface area, including the circular base.
	@Override
	public double surface_area() {
		double slant = Math.sqrt(radius * radius + height * height);

		return Math.PI * radius * (radius + slant);
	}

	// Calculates the cone's volume.
	@Override
	public double volume() {
		return Math.PI * radius * radius * height / 3.0;
	}

	// Returns the dimensions, surface area, and volume.
	@Override
	public String toString() {
		return String.format(
				"Cone%nRadius: %.2f%nHeight: %.2f%n" + "Surface area: %.2f%nVolume: %.2f%n",radius, height, surface_area(), volume());
	}
}