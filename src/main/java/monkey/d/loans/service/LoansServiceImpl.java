package monkey.d.loans.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import monkey.d.loans.Constants.LoansConstant;
import monkey.d.loans.entity.Loan;
import monkey.d.loans.repository.LoansRepository;

@Service
@RequiredArgsConstructor
public class LoansServiceImpl implements LoanService {

    private final LoansRepository loanRepository;

    @Override
    public void applyLoan(String mobileNumber,int amount) {
        Optional<Loan> existingLoan = loanRepository.findByMobileNumber(mobileNumber);
        if(existingLoan.isPresent()) {
            System.out.println("Loan already exists for the mobile number");
            return;
        }
        loanRepository.save(createNewLoan(mobileNumber,amount));
    }

    private Loan createNewLoan(String mobileNumber,int amount) {
        Loan newLoan = new Loan();
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        newLoan.setLoanNumber(Long.toString(randomLoanNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstant.LOAN_TYPE_HOME);
        newLoan.setTotalLoan(amount);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(amount);
        return newLoan;
    }
    
    
}
