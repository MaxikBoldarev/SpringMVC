package org.example.repository;

import org.example.model.CurrencyRate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface FinancialInstrumentRepository extends JpaRepository<FinancialInstrument, Long> {

    List<FinancialInstrument> findByType(InstrumentType type);

    @Query("SELECT fi FROM FinancialInstrument fi WHERE fi.currency = :currency AND fi.active = true")
    List<FinancialInstrument> findActiveByCurrency(@Param("currency") String currency);

    @Query("SELECT new com.fintech.prototype.dto.InstrumentSummaryDTO(" +
            "fi.id, fi.name, fi.type, COUNT(hd)) " +
            "FROM FinancialInstrument fi " +
            "LEFT JOIN fi.historicalData hd " +
            "GROUP BY fi.id, fi.name, fi.type")
    List<InstrumentSummaryDTO> getInstrumentsSummary();
}





@Repository
public interface CurrencyRepository extends CrudRepository<CurrencyRate, LocalDate> {}