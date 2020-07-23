package lk.boralesgamuwaMedical.asset.doctor.dao;

import lk.boralesgamuwaMedical.asset.doctor.entity.Doctor;
import lk.boralesgamuwaMedical.asset.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
}
