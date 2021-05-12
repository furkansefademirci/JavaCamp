package com.fsd.hrms.business.abstracts;

import com.fsd.hrms.entities.concretes.Job;

import java.util.List;

public interface JobServices {
   List<Job> getAll();
}
