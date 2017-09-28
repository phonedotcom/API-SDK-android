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
public class CreateOauthParams {
  
  @SerializedName("grant_type")
  private String grantType = null;
  @SerializedName("client_id")
  private String clientId = null;
  @SerializedName("client_secret")
  private String clientSecret = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("redirect_uri")
  private String redirectUri = null;
  @SerializedName("scope")
  private String scope = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("refresh_token")
  private String refreshToken = null;

  /**
   * authorization_code, client_credentials, password or refresh_token
   **/
  @ApiModelProperty(value = "authorization_code, client_credentials, password or refresh_token")
  public String getGrantType() {
    return grantType;
  }
  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  /**
   * Client ID
   **/
  @ApiModelProperty(value = "Client ID")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Client Secret Key
   **/
  @ApiModelProperty(value = "Client Secret Key")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  /**
   * Authorization Code created via the /oauth/authorization API
   **/
  @ApiModelProperty(value = "Authorization Code created via the /oauth/authorization API")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The redirect URI where user enters authentication information
   **/
  @ApiModelProperty(value = "The redirect URI where user enters authentication information")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   * account-owner, extension-user and/or methods:ALL, separated by space (%20)
   **/
  @ApiModelProperty(value = "account-owner, extension-user and/or methods:ALL, separated by space (%20)")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * User name
   **/
  @ApiModelProperty(value = "User name")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Password
   **/
  @ApiModelProperty(value = "Password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Refresh token
   **/
  @ApiModelProperty(value = "Refresh token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOauthParams createOauthParams = (CreateOauthParams) o;
    return (this.grantType == null ? createOauthParams.grantType == null : this.grantType.equals(createOauthParams.grantType)) &&
        (this.clientId == null ? createOauthParams.clientId == null : this.clientId.equals(createOauthParams.clientId)) &&
        (this.clientSecret == null ? createOauthParams.clientSecret == null : this.clientSecret.equals(createOauthParams.clientSecret)) &&
        (this.code == null ? createOauthParams.code == null : this.code.equals(createOauthParams.code)) &&
        (this.redirectUri == null ? createOauthParams.redirectUri == null : this.redirectUri.equals(createOauthParams.redirectUri)) &&
        (this.scope == null ? createOauthParams.scope == null : this.scope.equals(createOauthParams.scope)) &&
        (this.username == null ? createOauthParams.username == null : this.username.equals(createOauthParams.username)) &&
        (this.password == null ? createOauthParams.password == null : this.password.equals(createOauthParams.password)) &&
        (this.refreshToken == null ? createOauthParams.refreshToken == null : this.refreshToken.equals(createOauthParams.refreshToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.grantType == null ? 0: this.grantType.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.clientSecret == null ? 0: this.clientSecret.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.redirectUri == null ? 0: this.redirectUri.hashCode());
    result = 31 * result + (this.scope == null ? 0: this.scope.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.refreshToken == null ? 0: this.refreshToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOauthParams {\n");
    
    sb.append("  grantType: ").append(grantType).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  clientSecret: ").append(clientSecret).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  redirectUri: ").append(redirectUri).append("\n");
    sb.append("  scope: ").append(scope).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  refreshToken: ").append(refreshToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}