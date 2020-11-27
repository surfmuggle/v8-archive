/*
 * directus.io
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.directus.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetGroupsDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T21:48:16.590Z")
public class GetGroupsDataData {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("restrict_to_ip_whitelist")
  private String restrictToIpWhitelist = null;

  @SerializedName("nav_override")
  private String navOverride = null;

  @SerializedName("show_activity")
  private Integer showActivity = null;

  @SerializedName("show_messages")
  private Integer showMessages = null;

  @SerializedName("show_users")
  private Integer showUsers = null;

  @SerializedName("show_files")
  private Integer showFiles = null;

  public GetGroupsDataData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetGroupsDataData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetGroupsDataData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetGroupsDataData restrictToIpWhitelist(String restrictToIpWhitelist) {
    this.restrictToIpWhitelist = restrictToIpWhitelist;
    return this;
  }

   /**
   * Get restrictToIpWhitelist
   * @return restrictToIpWhitelist
  **/
  @ApiModelProperty(value = "")
  public String getRestrictToIpWhitelist() {
    return restrictToIpWhitelist;
  }

  public void setRestrictToIpWhitelist(String restrictToIpWhitelist) {
    this.restrictToIpWhitelist = restrictToIpWhitelist;
  }

  public GetGroupsDataData navOverride(String navOverride) {
    this.navOverride = navOverride;
    return this;
  }

   /**
   * Get navOverride
   * @return navOverride
  **/
  @ApiModelProperty(value = "")
  public String getNavOverride() {
    return navOverride;
  }

  public void setNavOverride(String navOverride) {
    this.navOverride = navOverride;
  }

  public GetGroupsDataData showActivity(Integer showActivity) {
    this.showActivity = showActivity;
    return this;
  }

   /**
   * Get showActivity
   * @return showActivity
  **/
  @ApiModelProperty(value = "")
  public Integer getShowActivity() {
    return showActivity;
  }

  public void setShowActivity(Integer showActivity) {
    this.showActivity = showActivity;
  }

  public GetGroupsDataData showMessages(Integer showMessages) {
    this.showMessages = showMessages;
    return this;
  }

   /**
   * Get showMessages
   * @return showMessages
  **/
  @ApiModelProperty(value = "")
  public Integer getShowMessages() {
    return showMessages;
  }

  public void setShowMessages(Integer showMessages) {
    this.showMessages = showMessages;
  }

  public GetGroupsDataData showUsers(Integer showUsers) {
    this.showUsers = showUsers;
    return this;
  }

   /**
   * Get showUsers
   * @return showUsers
  **/
  @ApiModelProperty(value = "")
  public Integer getShowUsers() {
    return showUsers;
  }

  public void setShowUsers(Integer showUsers) {
    this.showUsers = showUsers;
  }

  public GetGroupsDataData showFiles(Integer showFiles) {
    this.showFiles = showFiles;
    return this;
  }

   /**
   * Get showFiles
   * @return showFiles
  **/
  @ApiModelProperty(value = "")
  public Integer getShowFiles() {
    return showFiles;
  }

  public void setShowFiles(Integer showFiles) {
    this.showFiles = showFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsDataData getGroupsDataData = (GetGroupsDataData) o;
    return Objects.equals(this.id, getGroupsDataData.id) &&
        Objects.equals(this.name, getGroupsDataData.name) &&
        Objects.equals(this.description, getGroupsDataData.description) &&
        Objects.equals(this.restrictToIpWhitelist, getGroupsDataData.restrictToIpWhitelist) &&
        Objects.equals(this.navOverride, getGroupsDataData.navOverride) &&
        Objects.equals(this.showActivity, getGroupsDataData.showActivity) &&
        Objects.equals(this.showMessages, getGroupsDataData.showMessages) &&
        Objects.equals(this.showUsers, getGroupsDataData.showUsers) &&
        Objects.equals(this.showFiles, getGroupsDataData.showFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, restrictToIpWhitelist, navOverride, showActivity, showMessages, showUsers, showFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsDataData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    restrictToIpWhitelist: ").append(toIndentedString(restrictToIpWhitelist)).append("\n");
    sb.append("    navOverride: ").append(toIndentedString(navOverride)).append("\n");
    sb.append("    showActivity: ").append(toIndentedString(showActivity)).append("\n");
    sb.append("    showMessages: ").append(toIndentedString(showMessages)).append("\n");
    sb.append("    showUsers: ").append(toIndentedString(showUsers)).append("\n");
    sb.append("    showFiles: ").append(toIndentedString(showFiles)).append("\n");
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
