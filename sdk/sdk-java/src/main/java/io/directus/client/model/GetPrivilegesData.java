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
 * GetPrivilegesData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T21:48:16.590Z")
public class GetPrivilegesData {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("table_name")
  private String tableName = null;

  @SerializedName("group_id")
  private Integer groupId = null;

  @SerializedName("read_field_blacklist")
  private String readFieldBlacklist = null;

  @SerializedName("write_field_blacklist")
  private String writeFieldBlacklist = null;

  @SerializedName("nav_listed")
  private Integer navListed = null;

  @SerializedName("status_id")
  private Integer statusId = null;

  @SerializedName("allow_view")
  private Integer allowView = null;

  @SerializedName("allow_add")
  private Integer allowAdd = null;

  @SerializedName("allow_edit")
  private Integer allowEdit = null;

  @SerializedName("allow_delete")
  private Integer allowDelete = null;

  @SerializedName("allow_alter")
  private Integer allowAlter = null;

  public GetPrivilegesData id(Integer id) {
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

  public GetPrivilegesData tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(value = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public GetPrivilegesData groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public GetPrivilegesData readFieldBlacklist(String readFieldBlacklist) {
    this.readFieldBlacklist = readFieldBlacklist;
    return this;
  }

   /**
   * Get readFieldBlacklist
   * @return readFieldBlacklist
  **/
  @ApiModelProperty(value = "")
  public String getReadFieldBlacklist() {
    return readFieldBlacklist;
  }

  public void setReadFieldBlacklist(String readFieldBlacklist) {
    this.readFieldBlacklist = readFieldBlacklist;
  }

  public GetPrivilegesData writeFieldBlacklist(String writeFieldBlacklist) {
    this.writeFieldBlacklist = writeFieldBlacklist;
    return this;
  }

   /**
   * Get writeFieldBlacklist
   * @return writeFieldBlacklist
  **/
  @ApiModelProperty(value = "")
  public String getWriteFieldBlacklist() {
    return writeFieldBlacklist;
  }

  public void setWriteFieldBlacklist(String writeFieldBlacklist) {
    this.writeFieldBlacklist = writeFieldBlacklist;
  }

  public GetPrivilegesData navListed(Integer navListed) {
    this.navListed = navListed;
    return this;
  }

   /**
   * Get navListed
   * @return navListed
  **/
  @ApiModelProperty(value = "")
  public Integer getNavListed() {
    return navListed;
  }

  public void setNavListed(Integer navListed) {
    this.navListed = navListed;
  }

  public GetPrivilegesData statusId(Integer statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")
  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public GetPrivilegesData allowView(Integer allowView) {
    this.allowView = allowView;
    return this;
  }

   /**
   * Get allowView
   * @return allowView
  **/
  @ApiModelProperty(value = "")
  public Integer getAllowView() {
    return allowView;
  }

  public void setAllowView(Integer allowView) {
    this.allowView = allowView;
  }

  public GetPrivilegesData allowAdd(Integer allowAdd) {
    this.allowAdd = allowAdd;
    return this;
  }

   /**
   * Get allowAdd
   * @return allowAdd
  **/
  @ApiModelProperty(value = "")
  public Integer getAllowAdd() {
    return allowAdd;
  }

  public void setAllowAdd(Integer allowAdd) {
    this.allowAdd = allowAdd;
  }

  public GetPrivilegesData allowEdit(Integer allowEdit) {
    this.allowEdit = allowEdit;
    return this;
  }

   /**
   * Get allowEdit
   * @return allowEdit
  **/
  @ApiModelProperty(value = "")
  public Integer getAllowEdit() {
    return allowEdit;
  }

  public void setAllowEdit(Integer allowEdit) {
    this.allowEdit = allowEdit;
  }

  public GetPrivilegesData allowDelete(Integer allowDelete) {
    this.allowDelete = allowDelete;
    return this;
  }

   /**
   * Get allowDelete
   * @return allowDelete
  **/
  @ApiModelProperty(value = "")
  public Integer getAllowDelete() {
    return allowDelete;
  }

  public void setAllowDelete(Integer allowDelete) {
    this.allowDelete = allowDelete;
  }

  public GetPrivilegesData allowAlter(Integer allowAlter) {
    this.allowAlter = allowAlter;
    return this;
  }

   /**
   * Get allowAlter
   * @return allowAlter
  **/
  @ApiModelProperty(value = "")
  public Integer getAllowAlter() {
    return allowAlter;
  }

  public void setAllowAlter(Integer allowAlter) {
    this.allowAlter = allowAlter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPrivilegesData getPrivilegesData = (GetPrivilegesData) o;
    return Objects.equals(this.id, getPrivilegesData.id) &&
        Objects.equals(this.tableName, getPrivilegesData.tableName) &&
        Objects.equals(this.groupId, getPrivilegesData.groupId) &&
        Objects.equals(this.readFieldBlacklist, getPrivilegesData.readFieldBlacklist) &&
        Objects.equals(this.writeFieldBlacklist, getPrivilegesData.writeFieldBlacklist) &&
        Objects.equals(this.navListed, getPrivilegesData.navListed) &&
        Objects.equals(this.statusId, getPrivilegesData.statusId) &&
        Objects.equals(this.allowView, getPrivilegesData.allowView) &&
        Objects.equals(this.allowAdd, getPrivilegesData.allowAdd) &&
        Objects.equals(this.allowEdit, getPrivilegesData.allowEdit) &&
        Objects.equals(this.allowDelete, getPrivilegesData.allowDelete) &&
        Objects.equals(this.allowAlter, getPrivilegesData.allowAlter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tableName, groupId, readFieldBlacklist, writeFieldBlacklist, navListed, statusId, allowView, allowAdd, allowEdit, allowDelete, allowAlter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPrivilegesData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    readFieldBlacklist: ").append(toIndentedString(readFieldBlacklist)).append("\n");
    sb.append("    writeFieldBlacklist: ").append(toIndentedString(writeFieldBlacklist)).append("\n");
    sb.append("    navListed: ").append(toIndentedString(navListed)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    allowView: ").append(toIndentedString(allowView)).append("\n");
    sb.append("    allowAdd: ").append(toIndentedString(allowAdd)).append("\n");
    sb.append("    allowEdit: ").append(toIndentedString(allowEdit)).append("\n");
    sb.append("    allowDelete: ").append(toIndentedString(allowDelete)).append("\n");
    sb.append("    allowAlter: ").append(toIndentedString(allowAlter)).append("\n");
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

