package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2012ServiceFeesInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesInitiateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQServiceFeesInitiateOutputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("serviceFeesInstanceReference")
  private String serviceFeesInstanceReference;

  @JsonProperty("serviceFeesInitiateActionReference")
  private String serviceFeesInitiateActionReference;

  @JsonProperty("serviceFeesInitiateActionRecord")
  private Object serviceFeesInitiateActionRecord;

  @JsonProperty("serviceFeesInstanceStatus")
  private String serviceFeesInstanceStatus;

  @JsonProperty("serviceFeesInstanceRecord")
  private InlineResponse2012ServiceFeesInstanceRecord serviceFeesInstanceRecord;

  public BQServiceFeesInitiateOutputModel currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public BQServiceFeesInitiateOutputModel serviceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  */
  @ApiModelProperty(example = "SFIR709538", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance ")


  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }

  public BQServiceFeesInitiateOutputModel serviceFeesInitiateActionReference(String serviceFeesInitiateActionReference) {
    this.serviceFeesInitiateActionReference = serviceFeesInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return serviceFeesInitiateActionReference
  */
  @ApiModelProperty(example = "SFIAR773977", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getServiceFeesInitiateActionReference() {
    return serviceFeesInitiateActionReference;
  }

  public void setServiceFeesInitiateActionReference(String serviceFeesInitiateActionReference) {
    this.serviceFeesInitiateActionReference = serviceFeesInitiateActionReference;
  }

  public BQServiceFeesInitiateOutputModel serviceFeesInitiateActionRecord(Object serviceFeesInitiateActionRecord) {
    this.serviceFeesInitiateActionRecord = serviceFeesInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return serviceFeesInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getServiceFeesInitiateActionRecord() {
    return serviceFeesInitiateActionRecord;
  }

  public void setServiceFeesInitiateActionRecord(Object serviceFeesInitiateActionRecord) {
    this.serviceFeesInitiateActionRecord = serviceFeesInitiateActionRecord;
  }

  public BQServiceFeesInitiateOutputModel serviceFeesInstanceStatus(String serviceFeesInstanceStatus) {
    this.serviceFeesInstanceStatus = serviceFeesInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Service Fees instance (e.g. initialised, pending, active) 
   * @return serviceFeesInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Service Fees instance (e.g. initialised, pending, active) ")


  public String getServiceFeesInstanceStatus() {
    return serviceFeesInstanceStatus;
  }

  public void setServiceFeesInstanceStatus(String serviceFeesInstanceStatus) {
    this.serviceFeesInstanceStatus = serviceFeesInstanceStatus;
  }

  public BQServiceFeesInitiateOutputModel serviceFeesInstanceRecord(InlineResponse2012ServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
    return this;
  }

  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2012ServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(InlineResponse2012ServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesInitiateOutputModel bqServiceFeesInitiateOutputModel = (BQServiceFeesInitiateOutputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, bqServiceFeesInitiateOutputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.serviceFeesInstanceReference, bqServiceFeesInitiateOutputModel.serviceFeesInstanceReference) &&
        Objects.equals(this.serviceFeesInitiateActionReference, bqServiceFeesInitiateOutputModel.serviceFeesInitiateActionReference) &&
        Objects.equals(this.serviceFeesInitiateActionRecord, bqServiceFeesInitiateOutputModel.serviceFeesInitiateActionRecord) &&
        Objects.equals(this.serviceFeesInstanceStatus, bqServiceFeesInitiateOutputModel.serviceFeesInstanceStatus) &&
        Objects.equals(this.serviceFeesInstanceRecord, bqServiceFeesInitiateOutputModel.serviceFeesInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, serviceFeesInstanceReference, serviceFeesInitiateActionReference, serviceFeesInitiateActionRecord, serviceFeesInstanceStatus, serviceFeesInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesInitiateOutputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    serviceFeesInstanceReference: ").append(toIndentedString(serviceFeesInstanceReference)).append("\n");
    sb.append("    serviceFeesInitiateActionReference: ").append(toIndentedString(serviceFeesInitiateActionReference)).append("\n");
    sb.append("    serviceFeesInitiateActionRecord: ").append(toIndentedString(serviceFeesInitiateActionRecord)).append("\n");
    sb.append("    serviceFeesInstanceStatus: ").append(toIndentedString(serviceFeesInstanceStatus)).append("\n");
    sb.append("    serviceFeesInstanceRecord: ").append(toIndentedString(serviceFeesInstanceRecord)).append("\n");
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

