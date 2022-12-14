package com.themovie.restclientsamples.controller;

import com.themovie.restclientsamples.service.TeamService;
import com.themovie.restclientsamples.service.dto.team.TeamResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("themovies/movies")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public TeamResponse findAll(@RequestHeader( name = "x-token") String token) {
      return this.teamService.findAll(token);
    }
}
