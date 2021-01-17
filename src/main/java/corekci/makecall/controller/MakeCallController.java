package corekci.makecall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import corekci.makecall.model.Call;
import corekci.makecall.service.MakeCallService;


@RestController
public class MakeCallController {

	@Autowired
	MakeCallService makeCallService;

	@GetMapping("/cpaas/makecall")
    public String getDefaultCurrency() 
    {
    	String ret=null;
    	ret = "RESPONSE OF GET REQUEST";
    	return ret;
    }

	@PostMapping("/cpaas/makecall")
    public String makeCall(@RequestBody Call call) 
    {
    	String ret=null;
    	ret = makeCallService.checkForCallType(call);
    	return ret;
    }

}
