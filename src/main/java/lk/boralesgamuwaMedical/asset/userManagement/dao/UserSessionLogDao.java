package lk.boralesgamuwaMedical.asset.userManagement.dao;

import lk.boralesgamuwaMedical.asset.userManagement.entity.Enum.UserSessionLogStatus;
import lk.boralesgamuwaMedical.asset.userManagement.entity.User;
import lk.boralesgamuwaMedical.asset.userManagement.entity.UserSessionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSessionLogDao extends JpaRepository<UserSessionLog, Integer > {
    UserSessionLog findByUserAndUserSessionLogStatus(User user, UserSessionLogStatus userSessionLogStatus);
}
