package com.dotin.dotintasktwo.repository;


import com.dotin.dotintasktwo.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;



@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long>, JpaSpecificationExecutor<Leave> {

   // @Query("select l from Leave l where l.active = true ")
   // List<Leave> getLeaves();




}
