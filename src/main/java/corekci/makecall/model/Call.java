package corekci.makecall.model;

import corekci.makecall.utility.CallType;

public class Call {
	private String caller;
	private String callee;
	private CallType callType;

	
	public Call() {		
	}

	public Call(String caller, String callee, CallType callType) {
		this.caller = caller;
		this.callee = callee;
		this.callType = callType;
	}

	public String getCaller() {
		return caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}
	public String getCallee() {
		return callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
	}
	public CallType getCallType() {
		return callType;
	}
	public void setCallType(CallType callType) {
		this.callType = callType;
	}

	@Override
	public String toString() {
		return "Call [caller=" + caller + ", callee=" + callee + ", callType=" + callType.name() + "]";
	}

	
	
	


}
