/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIBusinessInformation;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APICorsConfiguration;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIEndpoint;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIOperations;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIThreatProtectionPolicies;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Sequence;

/**
 * API
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:41:58.538+05:30")
public class API {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("context")
  private String context = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("wsdlUri")
  private String wsdlUri = null;

  @JsonProperty("lifeCycleStatus")
  private String lifeCycleStatus = null;

  @JsonProperty("workflowStatus")
  private String workflowStatus = null;

  @JsonProperty("createdTime")
  private String createdTime = null;

  @JsonProperty("apiPolicy")
  private String apiPolicy = null;

  @JsonProperty("lastUpdatedTime")
  private String lastUpdatedTime = null;

  @JsonProperty("responseCaching")
  private String responseCaching = null;

  @JsonProperty("cacheTimeout")
  private Integer cacheTimeout = null;

  @JsonProperty("destinationStatsEnabled")
  private String destinationStatsEnabled = null;

  @JsonProperty("isDefaultVersion")
  private Boolean isDefaultVersion = null;

  @JsonProperty("transport")
  private List<String> transport = new ArrayList<String>();

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<String>();

  @JsonProperty("hasOwnGateway")
  private Boolean hasOwnGateway = null;

  @JsonProperty("labels")
  private List<String> labels = new ArrayList<String>();

  @JsonProperty("policies")
  private List<String> policies = new ArrayList<String>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    RESTRICTED("RESTRICTED");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("visibility")
  private VisibilityEnum visibility = null;

  @JsonProperty("visibleRoles")
  private List<String> visibleRoles = new ArrayList<String>();

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("userPermissionsForApi")
  private List<String> userPermissionsForApi = new ArrayList<String>();

  @JsonProperty("visibleTenants")
  private List<String> visibleTenants = new ArrayList<String>();

  @JsonProperty("gatewayEnvironments")
  private String gatewayEnvironments = null;

  @JsonProperty("sequences")
  private List<Sequence> sequences = new ArrayList<Sequence>();

  @JsonProperty("businessInformation")
  private APIBusinessInformation businessInformation = null;

  @JsonProperty("corsConfiguration")
  private APICorsConfiguration corsConfiguration = null;

  @JsonProperty("endpoint")
  private List<APIEndpoint> endpoint = new ArrayList<APIEndpoint>();

  @JsonProperty("securityScheme")
  private List<String> securityScheme = new ArrayList<String>();

  @JsonProperty("scopes")
  private List<String> scopes = new ArrayList<String>();

  @JsonProperty("operations")
  private List<APIOperations> operations = new ArrayList<APIOperations>();

  @JsonProperty("threatProtectionPolicies")
  private APIThreatProtectionPolicies threatProtectionPolicies = null;

  public API id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the api registry artifact 
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the api registry artifact ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public API name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public API description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public API context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public API version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public API provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given user invoking the api will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "If the provider value is not given user invoking the api will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public API wsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
    return this;
  }

   /**
   * WSDL URL if the API is based on a WSDL endpoint 
   * @return wsdlUri
  **/
  @ApiModelProperty(example = "http://www.webservicex.com/globalweather.asmx?wsdl", value = "WSDL URL if the API is based on a WSDL endpoint ")
  public String getWsdlUri() {
    return wsdlUri;
  }

  public void setWsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
  }

  public API lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * Get lifeCycleStatus
   * @return lifeCycleStatus
  **/
  @ApiModelProperty(example = "CREATED", value = "")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public API workflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * Get workflowStatus
   * @return workflowStatus
  **/
  @ApiModelProperty(example = "APPROVED", value = "")
  public String getWorkflowStatus() {
    return workflowStatus;
  }

  public void setWorkflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  public API createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(example = "2017-02-20T13:57:16.229+0000", value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public API apiPolicy(String apiPolicy) {
    this.apiPolicy = apiPolicy;
    return this;
  }

   /**
   * Get apiPolicy
   * @return apiPolicy
  **/
  @ApiModelProperty(example = "UNLIMITED", value = "")
  public String getApiPolicy() {
    return apiPolicy;
  }

  public void setApiPolicy(String apiPolicy) {
    this.apiPolicy = apiPolicy;
  }

  public API lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * Get lastUpdatedTime
   * @return lastUpdatedTime
  **/
  @ApiModelProperty(example = "2017-02-20T13:57:16.229+0000", value = "")
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public API responseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
    return this;
  }

   /**
   * Get responseCaching
   * @return responseCaching
  **/
  @ApiModelProperty(example = "Disabled", value = "")
  public String getResponseCaching() {
    return responseCaching;
  }

  public void setResponseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
  }

  public API cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @ApiModelProperty(example = "300", value = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public API destinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
    return this;
  }

   /**
   * Get destinationStatsEnabled
   * @return destinationStatsEnabled
  **/
  @ApiModelProperty(example = "Disabled", value = "")
  public String getDestinationStatsEnabled() {
    return destinationStatsEnabled;
  }

  public void setDestinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
  }

  public API isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

   /**
   * Get isDefaultVersion
   * @return isDefaultVersion
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public API transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  public API addTransportItem(String transportItem) {
    this.transport.add(transportItem);
    return this;
  }

   /**
   * Supported transports for the API (http and/or https). 
   * @return transport
  **/
  @ApiModelProperty(example = "[&quot;http&quot;,&quot;https&quot;]", required = true, value = "Supported transports for the API (http and/or https). ")
  public List<String> getTransport() {
    return transport;
  }

  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  public API tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public API addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "[&quot;substract&quot;,&quot;add&quot;]", value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public API hasOwnGateway(Boolean hasOwnGateway) {
    this.hasOwnGateway = hasOwnGateway;
    return this;
  }

   /**
   * Get hasOwnGateway
   * @return hasOwnGateway
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getHasOwnGateway() {
    return hasOwnGateway;
  }

  public void setHasOwnGateway(Boolean hasOwnGateway) {
    this.hasOwnGateway = hasOwnGateway;
  }

  public API labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public API addLabelsItem(String labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(example = "[&quot;public&quot;,&quot;private&quot;]", value = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public API policies(List<String> policies) {
    this.policies = policies;
    return this;
  }

  public API addPoliciesItem(String policiesItem) {
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(example = "[&quot;Unlimited&quot;]", required = true, value = "")
  public List<String> getPolicies() {
    return policies;
  }

  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  public API visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(example = "PUBLIC", required = true, value = "")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public API visibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
    return this;
  }

  public API addVisibleRolesItem(String visibleRolesItem) {
    this.visibleRoles.add(visibleRolesItem);
    return this;
  }

   /**
   * Get visibleRoles
   * @return visibleRoles
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<String> getVisibleRoles() {
    return visibleRoles;
  }

  public void setVisibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
  }

  public API permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(example = "[{&quot;groupId&quot; : 1000, &quot;permission&quot; : [&quot;READ&quot;,&quot;UPDATE&quot;]},{&quot;groupId&quot; : 1001, &quot;permission&quot; : [&quot;READ&quot;,&quot;UPDATE&quot;]}]", value = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public API userPermissionsForApi(List<String> userPermissionsForApi) {
    this.userPermissionsForApi = userPermissionsForApi;
    return this;
  }

  public API addUserPermissionsForApiItem(String userPermissionsForApiItem) {
    this.userPermissionsForApi.add(userPermissionsForApiItem);
    return this;
  }

   /**
   * LoggedIn user permissions for the API 
   * @return userPermissionsForApi
  **/
  @ApiModelProperty(example = "[&quot;READ&quot;,&quot;UPDATE&quot;]", value = "LoggedIn user permissions for the API ")
  public List<String> getUserPermissionsForApi() {
    return userPermissionsForApi;
  }

  public void setUserPermissionsForApi(List<String> userPermissionsForApi) {
    this.userPermissionsForApi = userPermissionsForApi;
  }

  public API visibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
    return this;
  }

  public API addVisibleTenantsItem(String visibleTenantsItem) {
    this.visibleTenants.add(visibleTenantsItem);
    return this;
  }

   /**
   * Get visibleTenants
   * @return visibleTenants
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<String> getVisibleTenants() {
    return visibleTenants;
  }

  public void setVisibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
  }

  public API gatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
    return this;
  }

   /**
   * Comma separated list of gateway environments. 
   * @return gatewayEnvironments
  **/
  @ApiModelProperty(example = "Production and Sandbox", value = "Comma separated list of gateway environments. ")
  public String getGatewayEnvironments() {
    return gatewayEnvironments;
  }

  public void setGatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
  }

  public API sequences(List<Sequence> sequences) {
    this.sequences = sequences;
    return this;
  }

  public API addSequencesItem(Sequence sequencesItem) {
    this.sequences.add(sequencesItem);
    return this;
  }

   /**
   * Get sequences
   * @return sequences
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<Sequence> getSequences() {
    return sequences;
  }

  public void setSequences(List<Sequence> sequences) {
    this.sequences = sequences;
  }

  public API businessInformation(APIBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

   /**
   * Get businessInformation
   * @return businessInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public APIBusinessInformation getBusinessInformation() {
    return businessInformation;
  }

  public void setBusinessInformation(APIBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
  }

  public API corsConfiguration(APICorsConfiguration corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
    return this;
  }

   /**
   * Get corsConfiguration
   * @return corsConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public APICorsConfiguration getCorsConfiguration() {
    return corsConfiguration;
  }

  public void setCorsConfiguration(APICorsConfiguration corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
  }

  public API endpoint(List<APIEndpoint> endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public API addEndpointItem(APIEndpoint endpointItem) {
    this.endpoint.add(endpointItem);
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<APIEndpoint> getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(List<APIEndpoint> endpoint) {
    this.endpoint = endpoint;
  }

  public API securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  public API addSecuritySchemeItem(String securitySchemeItem) {
    this.securityScheme.add(securitySchemeItem);
    return this;
  }

   /**
   * Get securityScheme
   * @return securityScheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSecurityScheme() {
    return securityScheme;
  }

  public void setSecurityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
  }

  public API scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public API addScopesItem(String scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public API operations(List<APIOperations> operations) {
    this.operations = operations;
    return this;
  }

  public API addOperationsItem(APIOperations operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<APIOperations> getOperations() {
    return operations;
  }

  public void setOperations(List<APIOperations> operations) {
    this.operations = operations;
  }

  public API threatProtectionPolicies(APIThreatProtectionPolicies threatProtectionPolicies) {
    this.threatProtectionPolicies = threatProtectionPolicies;
    return this;
  }

   /**
   * Get threatProtectionPolicies
   * @return threatProtectionPolicies
  **/
  @ApiModelProperty(example = "null", value = "")
  public APIThreatProtectionPolicies getThreatProtectionPolicies() {
    return threatProtectionPolicies;
  }

  public void setThreatProtectionPolicies(APIThreatProtectionPolicies threatProtectionPolicies) {
    this.threatProtectionPolicies = threatProtectionPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    API API = (API) o;
    return Objects.equals(this.id, API.id) &&
        Objects.equals(this.name, API.name) &&
        Objects.equals(this.description, API.description) &&
        Objects.equals(this.context, API.context) &&
        Objects.equals(this.version, API.version) &&
        Objects.equals(this.provider, API.provider) &&
        Objects.equals(this.wsdlUri, API.wsdlUri) &&
        Objects.equals(this.lifeCycleStatus, API.lifeCycleStatus) &&
        Objects.equals(this.workflowStatus, API.workflowStatus) &&
        Objects.equals(this.createdTime, API.createdTime) &&
        Objects.equals(this.apiPolicy, API.apiPolicy) &&
        Objects.equals(this.lastUpdatedTime, API.lastUpdatedTime) &&
        Objects.equals(this.responseCaching, API.responseCaching) &&
        Objects.equals(this.cacheTimeout, API.cacheTimeout) &&
        Objects.equals(this.destinationStatsEnabled, API.destinationStatsEnabled) &&
        Objects.equals(this.isDefaultVersion, API.isDefaultVersion) &&
        Objects.equals(this.transport, API.transport) &&
        Objects.equals(this.tags, API.tags) &&
        Objects.equals(this.hasOwnGateway, API.hasOwnGateway) &&
        Objects.equals(this.labels, API.labels) &&
        Objects.equals(this.policies, API.policies) &&
        Objects.equals(this.visibility, API.visibility) &&
        Objects.equals(this.visibleRoles, API.visibleRoles) &&
        Objects.equals(this.permission, API.permission) &&
        Objects.equals(this.userPermissionsForApi, API.userPermissionsForApi) &&
        Objects.equals(this.visibleTenants, API.visibleTenants) &&
        Objects.equals(this.gatewayEnvironments, API.gatewayEnvironments) &&
        Objects.equals(this.sequences, API.sequences) &&
        Objects.equals(this.businessInformation, API.businessInformation) &&
        Objects.equals(this.corsConfiguration, API.corsConfiguration) &&
        Objects.equals(this.endpoint, API.endpoint) &&
        Objects.equals(this.securityScheme, API.securityScheme) &&
        Objects.equals(this.scopes, API.scopes) &&
        Objects.equals(this.operations, API.operations) &&
        Objects.equals(this.threatProtectionPolicies, API.threatProtectionPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, wsdlUri, lifeCycleStatus, workflowStatus, createdTime, apiPolicy, lastUpdatedTime, responseCaching, cacheTimeout, destinationStatsEnabled, isDefaultVersion, transport, tags, hasOwnGateway, labels, policies, visibility, visibleRoles, permission, userPermissionsForApi, visibleTenants, gatewayEnvironments, sequences, businessInformation, corsConfiguration, endpoint, securityScheme, scopes, operations, threatProtectionPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class API {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    wsdlUri: ").append(toIndentedString(wsdlUri)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    apiPolicy: ").append(toIndentedString(apiPolicy)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    responseCaching: ").append(toIndentedString(responseCaching)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    destinationStatsEnabled: ").append(toIndentedString(destinationStatsEnabled)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    hasOwnGateway: ").append(toIndentedString(hasOwnGateway)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    visibleRoles: ").append(toIndentedString(visibleRoles)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    userPermissionsForApi: ").append(toIndentedString(userPermissionsForApi)).append("\n");
    sb.append("    visibleTenants: ").append(toIndentedString(visibleTenants)).append("\n");
    sb.append("    gatewayEnvironments: ").append(toIndentedString(gatewayEnvironments)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    corsConfiguration: ").append(toIndentedString(corsConfiguration)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    threatProtectionPolicies: ").append(toIndentedString(threatProtectionPolicies)).append("\n");
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

