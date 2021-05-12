package com.fsd.hrms.dataAccess.abstracts;

import com.fsd.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}
