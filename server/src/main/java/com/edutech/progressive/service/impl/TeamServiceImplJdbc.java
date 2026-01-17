package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.TeamDAO;
import com.edutech.progressive.entity.Team;
import com.edutech.progressive.service.TeamService;

public class TeamServiceImplJdbc implements TeamService {

    private final TeamDAO teamDAO;
    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
    @Override
    public List<Team> getAllTeams() {
        // Placeholder stub
        return new ArrayList<>();
    }
    @Override
    public int addTeam(Team team) {
        // Placeholder stub
        return -1;
    }
    @Override
    public List<Team> getAllTeamsSortedByName() {
        // Placeholder stub
        return new ArrayList<>();
    }
    public Team getTeamById(int teamId) {
        // Placeholder stub
        return null;
    }
    public void updateTeam(Team team) {
        // Placeholder stub
    }
    public void deleteTeam(int teamId) {
        // Placeholder stub
    }
}