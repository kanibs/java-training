package packageB;
import packageA.*;
public class SubclassB extends SuperclassA {
	void subclassMethodB() { 
		superclassMethodA(); 
	}
}
class AnyClassB {
	SuperclassA obj = new SuperclassA();
	void anyClassMethodB() {
		obj.superclassVarA = 20;
	}
}