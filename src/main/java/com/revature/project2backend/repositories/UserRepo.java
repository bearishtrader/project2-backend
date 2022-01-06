package com.revature.project2backend.repositories;

import com.revature.project2backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Integer> {
	User findByUsername (String username);
	User findByEmail (String email);
	User findByPasswordResetId(Integer passwordResetId);
	User findByPasswordResetToken(String token);
}
