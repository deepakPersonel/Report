package com.deepak.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>
{

}
