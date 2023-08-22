package com.qasim.calorie.api.Repo;

import com.qasim.calorie.api.Models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Long> {
}
