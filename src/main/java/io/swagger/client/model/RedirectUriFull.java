/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RedirectUriFull {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("uri")
  private String uri = null;
  @SerializedName("type")
  private String type = null;

  /**
   * Redirect URI ID
   **/
  @ApiModelProperty(value = "Redirect URI ID")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The Uniform Resource Identifier is a string used to identify the path to be redirected
   **/
  @ApiModelProperty(value = "The Uniform Resource Identifier is a string used to identify the path to be redirected")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   * redirect
   **/
  @ApiModelProperty(value = "redirect")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectUriFull redirectUriFull = (RedirectUriFull) o;
    return (this.id == null ? redirectUriFull.id == null : this.id.equals(redirectUriFull.id)) &&
        (this.uri == null ? redirectUriFull.uri == null : this.uri.equals(redirectUriFull.uri)) &&
        (this.type == null ? redirectUriFull.type == null : this.type.equals(redirectUriFull.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.uri == null ? 0: this.uri.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectUriFull {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
