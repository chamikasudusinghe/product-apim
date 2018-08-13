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
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.admin.model.AdvancedThrottlePolicy;

/**
 * AdvancedThrottlePolicyList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:59:16.844+05:30")
public class AdvancedThrottlePolicyList {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("list")
  private List<AdvancedThrottlePolicy> list = null;

  public AdvancedThrottlePolicyList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Advanced throttle policies returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of Advanced throttle policies returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public AdvancedThrottlePolicyList list(List<AdvancedThrottlePolicy> list) {
    this.list = list;
    return this;
  }

  public AdvancedThrottlePolicyList addListItem(AdvancedThrottlePolicy listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AdvancedThrottlePolicy>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<AdvancedThrottlePolicy> getList() {
    return list;
  }

  public void setList(List<AdvancedThrottlePolicy> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedThrottlePolicyList advancedThrottlePolicyList = (AdvancedThrottlePolicyList) o;
    return Objects.equals(this.count, advancedThrottlePolicyList.count) &&
        Objects.equals(this.list, advancedThrottlePolicyList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedThrottlePolicyList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

