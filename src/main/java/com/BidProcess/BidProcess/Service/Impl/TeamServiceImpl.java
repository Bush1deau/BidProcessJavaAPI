package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.TeamNotFoundException;
import com.BidProcess.BidProcess.Model.Team;
import com.BidProcess.BidProcess.Repository.TeamRepository;
import com.BidProcess.BidProcess.Service.TeamService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Optional<Team> findTeamById(Long id) {
        final Optional<Team> optionalTeam = this.teamRepository.findById(id);

        if (optionalTeam.isPresent()) {
            final Team team = optionalTeam.get();
            return teamRepository.findById(id);
        } else {
            throw TeamNotFoundException.teamNotFound();
        }
    }

    @Override
    public List<Team> teams() {
        return teamRepository.findAll();
    }

    @Override
    public Team createTeam(Team team) {
        teamRepository.save(team);
        return team;
    }
    @Override
    public Team updateTeam(Team team, Long id) {
        team.setId(id);
        return  teamRepository.save(team);
    }

    @Transactional
    public Team deleteTeam(Team team) {
        teamRepository.delete(team);
        return team;
    }

}
