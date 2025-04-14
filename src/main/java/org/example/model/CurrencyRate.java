package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Value
public class CurrencyRate {

    @Id
    String numCode;
    String charCode;
    String nominal;
    String countName;
    String count;
}








