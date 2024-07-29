package com.smitha.fd_food_catalogue_service.mapper;


import com.smitha.fd_food_catalogue_service.dto.FoodItemDTO;
import com.smitha.fd_food_catalogue_service.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);

    FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem);


}
