package corekci.makecall.utility;


public enum CallType {
	REGULAR("regular"),ANONYMOUS("anonymous"),X("x");

	String name;
	CallType(String name) {
		this.name = name;
	}
}
