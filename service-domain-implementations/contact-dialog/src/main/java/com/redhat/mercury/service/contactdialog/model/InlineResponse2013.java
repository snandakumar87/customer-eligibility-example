package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2013AccountLienInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2013
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2013   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("accountLienInstanceReference")
  private String accountLienInstanceReference;

  @JsonProperty("accountLienInitiateActionReference")
  private String accountLienInitiateActionReference;

  @JsonProperty("accountLienInitiateActionRecord")
  private Object accountLienInitiateActionRecord;

  @JsonProperty("accountLienInstanceStatus")
  private String accountLienInstanceStatus;

  @JsonProperty("accountLienInstanceRecord")
  private InlineResponse2013AccountLienInstanceRecord accountLienInstanceRecord;

  public InlineResponse2013 currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public InlineResponse2013 accountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance 
   * @return accountLienInstanceReference
  */
  @ApiModelProperty(example = "ALIR758025", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance ")


  public String getAccountLienInstanceReference() {
    return accountLienInstanceReference;
  }

  public void setAccountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
  }

  public InlineResponse2013 accountLienInitiateActionReference(String accountLienInitiateActionReference) {
    this.accountLienInitiateActionReference = accountLienInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountLienInitiateActionReference
  */
  @ApiModelProperty(example = "ALIAR756064", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getAccountLienInitiateActionReference() {
    return accountLienInitiateActionReference;
  }

  public void setAccountLienInitiateActionReference(String accountLienInitiateActionReference) {
    this.accountLienInitiateActionReference = accountLienInitiateActionReference;
  }

  public InlineResponse2013 accountLienInitiateActionRecord(Object accountLienInitiateActionRecord) {
    this.accountLienInitiateActionRecord = accountLienInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return accountLienInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getAccountLienInitiateActionRecord() {
    return accountLienInitiateActionRecord;
  }

  public void setAccountLienInitiateActionRecord(Object accountLienInitiateActionRecord) {
    this.accountLienInitiateActionRecord = accountLienInitiateActionRecord;
  }

  public InlineResponse2013 accountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. initialised, pending, active) 
   * @return accountLienInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. initialised, pending, active) ")


  public String getAccountLienInstanceStatus() {
    return accountLienInstanceStatus;
  }

  public void setAccountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
  }

  public InlineResponse2013 accountLienInstanceRecord(InlineResponse2013AccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
    return this;
  }

  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2013AccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(InlineResponse2013AccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2013 inlineResponse2013 = (InlineResponse2013) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, inlineResponse2013.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.accountLienInstanceReference, inlineResponse2013.accountLienInstanceReference) &&
        Objects.equals(this.accountLienInitiateActionReference, inlineResponse2013.accountLienInitiateActionReference) &&
        Objects.equals(this.accountLienInitiateActionRecord, inlineResponse2013.accountLienInitiateActionRecord) &&
        Objects.equals(this.accountLienInstanceStatus, inlineResponse2013.accountLienInstanceStatus) &&
        Objects.equals(this.accountLienInstanceRecord, inlineResponse2013.accountLienInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, accountLienInstanceReference, accountLienInitiateActionReference, accountLienInitiateActionRecord, accountLienInstanceStatus, accountLienInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2013 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    accountLienInstanceReference: ").append(toIndentedString(accountLienInstanceReference)).append("\n");
    sb.append("    accountLienInitiateActionReference: ").append(toIndentedString(accountLienInitiateActionReference)).append("\n");
    sb.append("    accountLienInitiateActionRecord: ").append(toIndentedString(accountLienInitiateActionRecord)).append("\n");
    sb.append("    accountLienInstanceStatus: ").append(toIndentedString(accountLienInstanceStatus)).append("\n");
    sb.append("    accountLienInstanceRecord: ").append(toIndentedString(accountLienInstanceRecord)).append("\n");
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

