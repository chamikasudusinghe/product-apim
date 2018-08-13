/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.store.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Document
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T14:42:47.879+05:30")
public class Document {
  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    HOWTO("HOWTO"),
    
    SAMPLES("SAMPLES"),
    
    PUBLIC_FORUM("PUBLIC_FORUM"),
    
    SUPPORT_FORUM("SUPPORT_FORUM"),
    
    API_MESSAGE_FORMAT("API_MESSAGE_FORMAT"),
    
    SWAGGER_DOC("SWAGGER_DOC"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("summary")
  private String summary = null;

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    INLINE("INLINE"),
    
    URL("URL"),
    
    FILE("FILE");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sourceType")
  private SourceTypeEnum sourceType = null;

  @JsonProperty("sourceUrl")
  private String sourceUrl = null;

  @JsonProperty("inlineContent")
  private String inlineContent = null;

  @JsonProperty("otherTypeName")
  private String otherTypeName = null;

  public Document documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Document summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Document sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public Document sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public Document inlineContent(String inlineContent) {
    this.inlineContent = inlineContent;
    return this;
  }

   /**
   * Get inlineContent
   * @return inlineContent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInlineContent() {
    return inlineContent;
  }

  public void setInlineContent(String inlineContent) {
    this.inlineContent = inlineContent;
  }

  public Document otherTypeName(String otherTypeName) {
    this.otherTypeName = otherTypeName;
    return this;
  }

   /**
   * Get otherTypeName
   * @return otherTypeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOtherTypeName() {
    return otherTypeName;
  }

  public void setOtherTypeName(String otherTypeName) {
    this.otherTypeName = otherTypeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.type, document.type) &&
        Objects.equals(this.summary, document.summary) &&
        Objects.equals(this.sourceType, document.sourceType) &&
        Objects.equals(this.sourceUrl, document.sourceUrl) &&
        Objects.equals(this.inlineContent, document.inlineContent) &&
        Objects.equals(this.otherTypeName, document.otherTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, type, summary, sourceType, sourceUrl, inlineContent, otherTypeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    inlineContent: ").append(toIndentedString(inlineContent)).append("\n");
    sb.append("    otherTypeName: ").append(toIndentedString(otherTypeName)).append("\n");
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

