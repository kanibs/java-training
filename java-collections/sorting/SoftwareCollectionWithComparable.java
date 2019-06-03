import java.util.*;

class SimpleVNO implements Comparable<SimpleVNO>{

 int release;
 int revision;
 int patch;
public SimpleVNO(int release, int revision, int patch) {
	this.release = release;
	this.revision = revision;
	this.patch= patch;
}
public String toString() {
	return "(" + release + "." + revision + "." + patch + ")";
}

public int compareTo(SimpleVNO other){
	if(this.release == other.release && this.revision == other.revision 
		&& this.patch == other.patch){
		return 0;
	}
	if(this.release > other.release || this.revision > other.revision 
		|| this.patch > other.patch){
		return 1;
	}
	return -1;
}
}

public class SoftwareCollectionWithComparable{


	public static void main(String[] args) {
		SimpleVNO vno1 = new SimpleVNO(4,0,0);
		SimpleVNO vno231 = new SimpleVNO(2,3,1);
		SimpleVNO vno232 = new SimpleVNO(2,4,2);
		
		List<SimpleVNO> collection = new ArrayList<SimpleVNO>();
		collection.add(vno231);
		collection.add(vno1);
		collection.add(vno232);
		System.out.println(collection);
		Collections.sort(collection);
		System.out.println("After Sorting...");
		System.out.println(collection);

		RevisionSorter revSorter = new RevisionSorter();
		Collections.sort(collection, revSorter);
		System.out.println("After Sorting based on Revision...");
		System.out.println(collection);
		
	}
}


class RevisionSorter implements Comparator<SimpleVNO>{

	public int compare(SimpleVNO obj1 , SimpleVNO other){
	if(obj1.release == other.release && obj1.revision == other.revision 
		&& obj1.patch == other.patch){
		return 0;
	}
	if(obj1.revision > other.revision){
		return 1;
	}
	return -1;
	}
}