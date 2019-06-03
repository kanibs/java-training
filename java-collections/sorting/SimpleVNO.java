import java.util.*;

class SimpleVNO {
// Does not override equals() or hashCode().
private int release;
private int revision;
private int patch;
public SimpleVNO(int release, int revision, int patch) {
	this.release = release;
	this.revision = revision;
	this.patch= patch;
}
public String toString() {
	return "(" + release + "." + revision + "." + patch + ")";
}
}

class SoftwareCollection{


	public static void main(String[] args) {
		SimpleVNO vno1 = new SimpleVNO(1,0,0);
		SimpleVNO vno2 = new SimpleVNO(2,0,0);
		SimpleVNO vno23 = new SimpleVNO(2,3,0);
		List<SimpleVNO> collection = new ArrayList();
		collection.add(vno23);
		collection.add(vno1);
		collection.add(vno2);
		
		System.out.println(collection);
	}
}