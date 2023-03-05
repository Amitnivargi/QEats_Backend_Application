/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.boot.actuate.endpoint.invoke.MissingParametersException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class GetRestaurantsRequest {

  @NonNull
  @Min(value = -90)
  @Max(value = 90)
  private Double latitude;
  @NonNull
  @Min(value = -180)
  @Max(value = 180)
  private Double longitude;

  
    private String searchFor;
  
    public GetRestaurantsRequest(double v, double v1) {
      this.latitude = v;
      this.longitude = v1;
    }
  
  
    public Double getLatitude() {
      return latitude;
    }
  
    public void setLatitude(@RequestParam(value = "latitude", required = true) Double latitude) {
      this.latitude = latitude;
    }
  
    public Double getLongitude() {
      return longitude;
    }
  
    public void setLongitude(@RequestParam(value = "longitude", required = true) Double longitude) {
      this.longitude = longitude;
    }
  
    public String getSearchFor() {
      return searchFor;
    }
  
    public void setSearchFor(@RequestParam(value = "searchFor", required = false) String searchFor) {
      this.searchFor = searchFor;
    }

}

