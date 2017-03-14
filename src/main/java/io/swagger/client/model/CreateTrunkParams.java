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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateTrunkParams {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("uri")
  private String uri = null;
  @SerializedName("max_concurrent_calls")
  private Integer maxConcurrentCalls = null;
  @SerializedName("max_minutes_per_month")
  private Integer maxMinutesPerMonth = null;
  @SerializedName("greeting")
  private Object greeting = null;
  @SerializedName("error_message")
  private Object errorMessage = null;
  @SerializedName("codecs")
  private List<Object> codecs = null;

  /**
   * Name of Trunk
   **/
  @ApiModelProperty(value = "Name of Trunk")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * URI of Trunk (in the form of SIP/user@host.com:port)
   **/
  @ApiModelProperty(value = "URI of Trunk (in the form of SIP/user@host.com:port)")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   * Max concurrent calls
   **/
  @ApiModelProperty(value = "Max concurrent calls")
  public Integer getMaxConcurrentCalls() {
    return maxConcurrentCalls;
  }
  public void setMaxConcurrentCalls(Integer maxConcurrentCalls) {
    this.maxConcurrentCalls = maxConcurrentCalls;
  }

  /**
   * Max minutes per month
   **/
  @ApiModelProperty(value = "Max minutes per month")
  public Integer getMaxMinutesPerMonth() {
    return maxMinutesPerMonth;
  }
  public void setMaxMinutesPerMonth(Integer maxMinutesPerMonth) {
    this.maxMinutesPerMonth = maxMinutesPerMonth;
  }

  /**
   * Recording lookup object
   **/
  @ApiModelProperty(value = "Recording lookup object")
  public Object getGreeting() {
    return greeting;
  }
  public void setGreeting(Object greeting) {
    this.greeting = greeting;
  }

  /**
   * Recording lookup object
   **/
  @ApiModelProperty(value = "Recording lookup object")
  public Object getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(Object errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Custom audio codec configuration
   **/
  @ApiModelProperty(value = "Custom audio codec configuration")
  public List<Object> getCodecs() {
    return codecs;
  }
  public void setCodecs(List<Object> codecs) {
    this.codecs = codecs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrunkParams createTrunkParams = (CreateTrunkParams) o;
    return (this.name == null ? createTrunkParams.name == null : this.name.equals(createTrunkParams.name)) &&
        (this.uri == null ? createTrunkParams.uri == null : this.uri.equals(createTrunkParams.uri)) &&
        (this.maxConcurrentCalls == null ? createTrunkParams.maxConcurrentCalls == null : this.maxConcurrentCalls.equals(createTrunkParams.maxConcurrentCalls)) &&
        (this.maxMinutesPerMonth == null ? createTrunkParams.maxMinutesPerMonth == null : this.maxMinutesPerMonth.equals(createTrunkParams.maxMinutesPerMonth)) &&
        (this.greeting == null ? createTrunkParams.greeting == null : this.greeting.equals(createTrunkParams.greeting)) &&
        (this.errorMessage == null ? createTrunkParams.errorMessage == null : this.errorMessage.equals(createTrunkParams.errorMessage)) &&
        (this.codecs == null ? createTrunkParams.codecs == null : this.codecs.equals(createTrunkParams.codecs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.uri == null ? 0: this.uri.hashCode());
    result = 31 * result + (this.maxConcurrentCalls == null ? 0: this.maxConcurrentCalls.hashCode());
    result = 31 * result + (this.maxMinutesPerMonth == null ? 0: this.maxMinutesPerMonth.hashCode());
    result = 31 * result + (this.greeting == null ? 0: this.greeting.hashCode());
    result = 31 * result + (this.errorMessage == null ? 0: this.errorMessage.hashCode());
    result = 31 * result + (this.codecs == null ? 0: this.codecs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrunkParams {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("  maxConcurrentCalls: ").append(maxConcurrentCalls).append("\n");
    sb.append("  maxMinutesPerMonth: ").append(maxMinutesPerMonth).append("\n");
    sb.append("  greeting: ").append(greeting).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("  codecs: ").append(codecs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
