/*
 * WSO2 API Manager - Admin Portal API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.admin.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BandwidthLimit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:59:16.844+05:30")
public class BandwidthLimit {
  @JsonProperty("dataAmount")
  private Integer dataAmount = 0;

  @JsonProperty("dataUnit")
  private String dataUnit = null;

  public BandwidthLimit dataAmount(Integer dataAmount) {
    this.dataAmount = dataAmount;
    return this;
  }

   /**
   * Get dataAmount
   * @return dataAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDataAmount() {
    return dataAmount;
  }

  public void setDataAmount(Integer dataAmount) {
    this.dataAmount = dataAmount;
  }

  public BandwidthLimit dataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
    return this;
  }

   /**
   * Get dataUnit
   * @return dataUnit
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDataUnit() {
    return dataUnit;
  }

  public void setDataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthLimit bandwidthLimit = (BandwidthLimit) o;
    return Objects.equals(this.dataAmount, bandwidthLimit.dataAmount) &&
        Objects.equals(this.dataUnit, bandwidthLimit.dataUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAmount, dataUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthLimit {\n");
    
    sb.append("    dataAmount: ").append(toIndentedString(dataAmount)).append("\n");
    sb.append("    dataUnit: ").append(toIndentedString(dataUnit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

