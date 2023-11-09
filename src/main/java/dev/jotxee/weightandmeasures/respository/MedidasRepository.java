package dev.jotxee.weightandmeasures.respository;

import dev.jotxee.weightandmeasures.respository.entity.MeasurementsKey;
import dev.jotxee.weightandmeasures.respository.entity.MedidasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedidasRepository extends JpaRepository<MedidasEntity, MeasurementsKey> {
    @Query(value = "SELECT * FROM measurements where id_user = :userId ORDER BY registration_date DESC", nativeQuery = true)
    List<MedidasEntity> findAllCustom(int userId);
}
