package lk.boralesgamuwaMedical.asset.consultation.dao;

import lk.boralesgamuwaMedical.asset.consultation.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationDao extends JpaRepository<Consultation, Integer> {
}
