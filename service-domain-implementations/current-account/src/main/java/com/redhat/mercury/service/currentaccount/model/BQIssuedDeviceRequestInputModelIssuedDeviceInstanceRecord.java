package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord   {
  @JsonProperty("issuedDeviceType")
  private String issuedDeviceType;

  @JsonProperty("issuedDeviceOptionSetting")
  private String issuedDeviceOptionSetting;

  @JsonProperty("issuedDeviceProperty")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty;

  public BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord issuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of issued device/inventory (e.g. checkbook, pay-in slip) 
   * @return issuedDeviceType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of issued device/inventory (e.g. checkbook, pay-in slip) ")


  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }

  public BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option setting  
   * @return issuedDeviceOptionSetting
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option setting  ")


  public String getIssuedDeviceOptionSetting() {
    return issuedDeviceOptionSetting;
  }

  public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
  }

  public BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord issuedDeviceProperty(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
    return this;
  }

  /**
   * Get issuedDeviceProperty
   * @return issuedDeviceProperty
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty getIssuedDeviceProperty() {
    return issuedDeviceProperty;
  }

  public void setIssuedDeviceProperty(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord bqIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord = (BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord) o;
    return Objects.equals(this.issuedDeviceType, bqIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord.issuedDeviceType) &&
        Objects.equals(this.issuedDeviceOptionSetting, bqIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDeviceProperty, bqIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord.issuedDeviceProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceType, issuedDeviceOptionSetting, issuedDeviceProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord {\n");
    
    sb.append("    issuedDeviceType: ").append(toIndentedString(issuedDeviceType)).append("\n");
    sb.append("    issuedDeviceOptionSetting: ").append(toIndentedString(issuedDeviceOptionSetting)).append("\n");
    sb.append("    issuedDeviceProperty: ").append(toIndentedString(issuedDeviceProperty)).append("\n");
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

