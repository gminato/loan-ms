package monkey.d.loans.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanDto {

    private String mobileNumber;
    private String loanNumber;
    private String loanType;
    private int totalAmount;
    private int amountPaid;
    private int amountRemaining;
    
}
