package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    Optional<Team> findTeamById(Long id);

    List<Team> teams();

    Team createTeam(Team team);

    Team updateTeam(Team team , Long id);

    Team deleteTeam(Team team);

}
