package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Team;
import com.BidProcess.BidProcess.Model.Utilisateur;
import com.BidProcess.BidProcess.Service.TeamService;
import com.BidProcess.BidProcess.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TeamRestController {

    @Autowired
    private TeamService teamService;

    public TeamRestController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping( "team/{id}" )
    public Optional<Team> findTeamById(@PathVariable("id") Long id
    ){
        return teamService.findTeamById(id);
    }

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public List<Team> listTeams(){
        return teamService.teams();
    }

    @RequestMapping(value = "/team/create", method = RequestMethod.POST)
    public Team createTeam(@RequestBody Team team){
        return teamService.createTeam(team);
    }
    @RequestMapping(value = "/team/{id}", method = RequestMethod.PUT)
    public Team updateTeam(@RequestBody Team team , @PathVariable("id") @NotNull Long id ){
        return teamService.updateTeam(team,id);
    }

    @RequestMapping(value = "/team/delete", method = RequestMethod.DELETE)
    public Team team(@RequestBody Team team) {
        return teamService.deleteTeam(team);
    }

}