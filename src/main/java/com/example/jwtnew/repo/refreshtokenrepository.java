package com.example.jwtnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtnew.model.RefreshToken;

import java.util.Optional;

public interface refreshtokenrepository extends JpaRepository<RefreshToken, String> {


    Optional<RefreshToken> findByRefreshtokString(String s);
}
