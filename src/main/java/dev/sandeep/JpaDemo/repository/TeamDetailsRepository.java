package dev.sandeep.JpaDemo.repository;

import dev.sandeep.JpaDemo.entity.TeamDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDetailsRepository extends JpaRepository<TeamDetails,Integer> {
}
