package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceUpdateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQIssuedDeviceUpdateOutputModel   {
  @JsonProperty("issuedDeviceInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord;

  @JsonProperty("issuedDeviceUpdateActionTaskReference")
  private String issuedDeviceUpdateActionTaskReference;

  @JsonProperty("issuedDeviceUpdateActionTaskRecord")
  private Object issuedDeviceUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public BQIssuedDeviceUpdateOutputModel issuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
    return this;
  }

  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }

  public BQIssuedDeviceUpdateOutputModel issuedDeviceUpdateActionTaskReference(String issuedDeviceUpdateActionTaskReference) {
    this.issuedDeviceUpdateActionTaskReference = issuedDeviceUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return issuedDeviceUpdateActionTaskReference
  */
  @ApiModelProperty(example = "IDUATR746906", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")


  public String getIssuedDeviceUpdateActionTaskReference() {
    return issuedDeviceUpdateActionTaskReference;
  }

  public void setIssuedDeviceUpdateActionTaskReference(String issuedDeviceUpdateActionTaskReference) {
    this.issuedDeviceUpdateActionTaskReference = issuedDeviceUpdateActionTaskReference;
  }

  public BQIssuedDeviceUpdateOutputModel issuedDeviceUpdateActionTaskRecord(Object issuedDeviceUpdateActionTaskRecord) {
    this.issuedDeviceUpdateActionTaskRecord = issuedDeviceUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issuedDeviceUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getIssuedDeviceUpdateActionTaskRecord() {
    return issuedDeviceUpdateActionTaskRecord;
  }

  public void setIssuedDeviceUpdateActionTaskRecord(Object issuedDeviceUpdateActionTaskRecord) {
    this.issuedDeviceUpdateActionTaskRecord = issuedDeviceUpdateActionTaskRecord;
  }

  public BQIssuedDeviceUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")

  @Valid

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceUpdateOutputModel bqIssuedDeviceUpdateOutputModel = (BQIssuedDeviceUpdateOutputModel) o;
    return Objects.equals(this.issuedDeviceInstanceRecord, bqIssuedDeviceUpdateOutputModel.issuedDeviceInstanceRecord) &&
        Objects.equals(this.issuedDeviceUpdateActionTaskReference, bqIssuedDeviceUpdateOutputModel.issuedDeviceUpdateActionTaskReference) &&
        Objects.equals(this.issuedDeviceUpdateActionTaskRecord, bqIssuedDeviceUpdateOutputModel.issuedDeviceUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqIssuedDeviceUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceRecord, issuedDeviceUpdateActionTaskReference, issuedDeviceUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceUpdateOutputModel {\n");
    
    sb.append("    issuedDeviceInstanceRecord: ").append(toIndentedString(issuedDeviceInstanceRecord)).append("\n");
    sb.append("    issuedDeviceUpdateActionTaskReference: ").append(toIndentedString(issuedDeviceUpdateActionTaskReference)).append("\n");
    sb.append("    issuedDeviceUpdateActionTaskRecord: ").append(toIndentedString(issuedDeviceUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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

