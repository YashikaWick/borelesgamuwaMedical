package lk.boralesgamuwaMedical.asset.additionalService.dao;

import lk.boralesgamuwaMedical.asset.additionalService.entity.AdditionalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalServiceDao extends JpaRepository< AdditionalService, Integer > {
}
