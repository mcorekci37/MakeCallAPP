package corekci.makecall.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import corekci.makecall.service.MakeCallService;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
	
	@Autowired
	MakeCallService makeCallService;

	private static Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);
	
    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<String> handleInvalidFormatException(RuntimeException ex) {
		logger.info("An InvalidFormatException has occured: "+ ex.getMessage());
    	String mes = makeCallService.getMessageForBadCallType();
        return new ResponseEntity<>(mes, HttpStatus.BAD_REQUEST);
    }

}