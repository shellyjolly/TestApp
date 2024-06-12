package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class MsgController {
	private String msg;
	
	@Value("${msg:Config Server not working plz check}")
	public ResponseEntity<String> showMsg(){
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
