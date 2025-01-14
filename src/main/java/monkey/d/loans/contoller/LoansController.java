package monkey.d.loans.contoller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import monkey.d.loans.dto.ResponseDto;
import monkey.d.loans.service.LoanService;

@RestController
@RequestMapping(value = "api/v1/loans", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class LoansController {

    private final LoanService loansService;

   @PostMapping(value = "/apply") 
    public ResponseEntity<ResponseDto> applyForLoan(@RequestParam String mobileNumber, @RequestParam int amount) {
        loansService.applyLoan(mobileNumber, amount);
        return ResponseEntity.ok(new ResponseDto("Loan application successful", "success"));
    }

    @GetMapping(value = "/helloworld")
    public ResponseEntity<ResponseDto> helloWorld() {
        return ResponseEntity.ok(new ResponseDto("Hello World from loan ms", "success"));
    }
    
}
