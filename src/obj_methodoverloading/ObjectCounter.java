package obj_methodoverloading;

public class ObjectCounter {
	static int count = 0;

	public ObjectCounter() {
		count++;
	}

	public static void main(String args[]) {
		ObjectCounter oc1 = new ObjectCounter();
		ObjectCounter oc2 = new ObjectCounter();
		ObjectCounter oc3 = new ObjectCounter();
		System.out.println("Object is Created at : " + count + " times");
	}
}
