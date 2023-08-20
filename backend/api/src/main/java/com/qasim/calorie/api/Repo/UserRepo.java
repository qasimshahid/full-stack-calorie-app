package com.qasim.calorie.api.Repo;

import com.qasim.calorie.api.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
