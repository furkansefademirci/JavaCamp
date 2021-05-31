package com.fsd.hrms.dataAccess.abstracts;

import com.fsd.hrms.entities.concretes.SystemPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel,Integer> {
}
