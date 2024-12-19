package monkey.d.loans.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

}