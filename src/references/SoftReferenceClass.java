package references;

import java.lang.ref.SoftReference;

/**
 * The objects which are softly referenced will not be garbage collected (even
 * though they are available for garbage collection) until JVM badly needs
 * memory. These objects will be cleared from the memory only if JVM runs out of
 * memory. You can create a soft reference to an existing object by using
 * java.lang.ref.SoftReference class. Below is the code example on how to create
 * a soft reference.
 * 
 * 
 * In the below example, you create two strong references – ‘a‘ and ‘softA‘. ‘a’
 * is pointing to A-type object and ‘softA’ is pointing to SoftReference type
 * object. This SoftReference type object is internally referring to A-type
 * object to which ‘a’ is also pointing. When ‘a’ is made to point to null,
 * object to which ‘a’ is pointing earlier becomes eligible for garbage
 * collection. But, it will be garbage collected only when JVM needs memory.
 * Because, it is softly referenced by ‘softA’ object.
 * 
 * @author hgarg
 *
 */
public class SoftReferenceClass {

	public static void main(String[] args) {
		A a = new A(); // Strong Reference
		// Creating Soft Reference to A-type object to which 'a' is also
		// pointing

		SoftReference<A> softA = new SoftReference<A>(a);

		a = null; // Now, A-type object to which 'a' is pointing earlier is
					// eligible for garbage collection. But, it will be garbage
					// collected only when JVM needs memory.

		a = softA.get(); // You can retrieve back the object which has been
							// softly referenced
	}

}