package com.themovie.restclientsamples.service;

import com.themovie.restclientsamples.service.dto.team.TeamResponse;

public interface TeamService {
  TeamResponse findAll(String token);
}
