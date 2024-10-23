package com.Rishabh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rishabh.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
