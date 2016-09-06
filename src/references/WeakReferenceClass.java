package references;

import java.lang.ref.WeakReference;

/**
 * JVM ignores the weak references. That means objects which has only week
 * references are eligible for garbage collection. They are likely to be garbage
 * collected when JVM runs garbage collector thread. JVM doesn’t show any regard
 * for weak references.
 * 
 * You may think that what is the use of creating weak references if they are
 * ignored by the JVM, Use of weak reference is that you can retrieve back the
 * weakly referenced object if it is not yet removed from the memory. This is
 * done using get() method of WeakReference class. It will return reference to
 * the object if object is not yet removed from the memory.
 * 
 * @author hgarg
 *
 */
public class WeakReferenceClass {

	public static void main(String[] args) {
		A a = new A(); // Strong Reference

		// Creating Weak Reference to A-type object to which 'a' is also
		// pointing.

		WeakReference<A> weakA = new WeakReference<A>(a);

		a = null; // Now, A-type object to which 'a' is pointing earlier is
					// available for garbage collection.

		a = weakA.get(); // You can retrieve back the object which has been
							// weakly referenced.
	}

}
