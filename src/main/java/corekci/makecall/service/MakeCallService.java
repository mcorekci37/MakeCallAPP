package corekci.makecall.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import corekci.makecall.model.Call;
import corekci.makecall.utility.CallType;


@Service
public class MakeCallService {

	private static Logger logger = LoggerFactory.getLogger(MakeCallService.class);


	public String checkForCallType(Call call) {
		String retVal = null ;
		StringBuilder str = new StringBuilder(); 
		logger.info("Call made: "+ call);
        retVal = str.append("This is a(n) ")
        		.append(call.getCallType().name())
        		.append(" call!")
        		.toString();
		logger.info("Call response: "+ retVal);
        return retVal;
	}
	
	public String getCallTypes() {
		StringBuilder str = new StringBuilder();
		CallType[] list = CallType.values();
		str.append("[");
		boolean first = true;
		for (CallType c : list) {
			if(first) {
				str.append(c.name());				
				first = false;
			}else {
				str.append(", ")
				.append(c.name());				
			}
		}
		str.append("]");
		return str.toString();
	}
	public String getMessageForBadCallType() {
    	StringBuilder str = new StringBuilder();
    	String mes = str.append("CallType value is not correct. Try one of the fallowing: ")
    			.append(this.getCallTypes())
    			.append(".")
    			.toString();
    	return mes;

	}
}
