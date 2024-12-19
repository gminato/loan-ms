package monkey.d.loans.repository;

import org.springframework.stereotype.Repository;

import monkey.d.loans.entity.Loan;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoansRepository extends JpaRepository<Loan, Long> {

    Optional<Loan> findByMobileNumber(String mobileNumber);

}
