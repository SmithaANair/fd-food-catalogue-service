package com.smitha.fd_food_catalogue_service.repo;


import com.smitha.fd_food_catalogue_service.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem, Integer> {
    List<FoodItem> findByRestaurantId(Integer restaurantId);
}
