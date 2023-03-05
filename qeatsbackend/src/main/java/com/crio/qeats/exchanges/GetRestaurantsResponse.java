/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import com.crio.qeats.dto.Restaurant;
//import org.springframework.stereotype.Component;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class GetRestaurantsResponse {

   // List<Restaurant> restaurants;

   List<Restaurant> restaurants;

   public GetRestaurantsResponse(List<Restaurant> restaurant) {
     this.restaurants = restaurant; 
   }
 
   public List<Restaurant> getRestaurants() {
     return restaurants;
   }
 
   public void setRestaurants(List<Restaurant> restaurants2) {
     this.restaurants = restaurants2;
   }

}

