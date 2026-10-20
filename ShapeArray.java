public class ShapeArray {

	public static void main(String[] args) {

		// Creates one instance of each shape.
		Sphere sphere = new Sphere(3.0);
		Cylinder cylinder = new Cylinder(3.0, 5.0);
		Cone cone = new Cone(3.0, 5.0);

		// Stores all three objects in a Shape array.
		Shape[] shapeArray = {sphere, cylinder, cone};

		// Prints each object's data using its toString method.
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
	}
}