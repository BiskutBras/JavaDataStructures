package dynamicArrays;

public class Main {

	public static void main(String[] args) {
		// dynamic arrays

		DynamicArray dynamicArray = new DynamicArray();

		dynamicArray.insert("A");
		dynamicArray.insert("B");
		dynamicArray.insert("C");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");
		dynamicArray.insert("C");

		dynamicArray.insertAt(2, "x");
		dynamicArray.delete("x");
		dynamicArray.delete("C");

		System.out.println("Array status: ");
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty() + "\n");

		System.out.println(dynamicArray.search("9"));

	}

}
