package com.movies.challenge.MovieCatalog.service.interfaces;

import java.util.Optional;

public interface IUserService <T,ID>{
    Optional<T> findByEmail(String email);
    T register(T user);
}
