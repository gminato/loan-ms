package monkey.d.loans.contoller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import monkey.d.loans.dto.ResponseDto;

@RestController
@RequestMapping(value = "api/v1/loans", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoansController {

   @PostMapping(value = "/apply") 
    public ResponseEntity<ResponseDto> applyForLoan(@RequestParam String mobileNumber, @RequestParam int amount) {

        return ResponseEntity.ok(new ResponseDto("Loan application successful", "success"));
    }
    
}
