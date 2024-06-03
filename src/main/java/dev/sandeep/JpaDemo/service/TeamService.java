package dev.sandeep.JpaDemo.service;

import dev.sandeep.JpaDemo.entity.Team;
import dev.sandeep.JpaDemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void getTeam(){
        Optional<Team> team = teamRepository.findById(1);
    }
}
