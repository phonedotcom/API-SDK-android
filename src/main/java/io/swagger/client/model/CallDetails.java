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

/**
 * Each item in the &#39;details&#39; record may contain the following properties:
 **/
@ApiModel(description = "Each item in the 'details' record may contain the following properties:")
public class CallDetails {
  
  @SerializedName("start_time")
  private Integer startTime = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("id_value")
  private Integer idValue = null;
  @SerializedName("voip_id")
  private Integer voipId = null;
  @SerializedName("voip_phone_id")
  private Integer voipPhoneId = null;

  /**
   * UNIX time stamp representing the UTC time that this call item starts
   **/
  @ApiModelProperty(value = "UNIX time stamp representing the UTC time that this call item starts")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ...
   **/
  @ApiModelProperty(value = "Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ...")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * ID associated with this call item endpoint (type)
   **/
  @ApiModelProperty(value = "ID associated with this call item endpoint (type)")
  public Integer getIdValue() {
    return idValue;
  }
  public void setIdValue(Integer idValue) {
    this.idValue = idValue;
  }

  /**
   * Same as account id
   **/
  @ApiModelProperty(value = "Same as account id")
  public Integer getVoipId() {
    return voipId;
  }
  public void setVoipId(Integer voipId) {
    this.voipId = voipId;
  }

  /**
   * Same as account extension id
   **/
  @ApiModelProperty(value = "Same as account extension id")
  public Integer getVoipPhoneId() {
    return voipPhoneId;
  }
  public void setVoipPhoneId(Integer voipPhoneId) {
    this.voipPhoneId = voipPhoneId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallDetails callDetails = (CallDetails) o;
    return (this.startTime == null ? callDetails.startTime == null : this.startTime.equals(callDetails.startTime)) &&
        (this.type == null ? callDetails.type == null : this.type.equals(callDetails.type)) &&
        (this.idValue == null ? callDetails.idValue == null : this.idValue.equals(callDetails.idValue)) &&
        (this.voipId == null ? callDetails.voipId == null : this.voipId.equals(callDetails.voipId)) &&
        (this.voipPhoneId == null ? callDetails.voipPhoneId == null : this.voipPhoneId.equals(callDetails.voipPhoneId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startTime == null ? 0: this.startTime.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.idValue == null ? 0: this.idValue.hashCode());
    result = 31 * result + (this.voipId == null ? 0: this.voipId.hashCode());
    result = 31 * result + (this.voipPhoneId == null ? 0: this.voipPhoneId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDetails {\n");
    
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  idValue: ").append(idValue).append("\n");
    sb.append("  voipId: ").append(voipId).append("\n");
    sb.append("  voipPhoneId: ").append(voipPhoneId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
