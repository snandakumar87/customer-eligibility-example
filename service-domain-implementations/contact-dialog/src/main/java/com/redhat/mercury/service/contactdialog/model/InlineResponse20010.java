package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20010
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse20010   {
  @JsonProperty("accountLienExchangeActionTaskReference")
  private String accountLienExchangeActionTaskReference;

  @JsonProperty("accountLienExchangeActionTaskRecord")
  private Object accountLienExchangeActionTaskRecord;

  @JsonProperty("accountLienExchangeActionResponse")
  private String accountLienExchangeActionResponse;

  @JsonProperty("accountLienInstanceStatus")
  private String accountLienInstanceStatus;

  public InlineResponse20010 accountLienExchangeActionTaskReference(String accountLienExchangeActionTaskReference) {
    this.accountLienExchangeActionTaskReference = accountLienExchangeActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Lien instance exchange service call 
   * @return accountLienExchangeActionTaskReference
  */
  @ApiModelProperty(example = "ALEATR720629", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Lien instance exchange service call ")


  public String getAccountLienExchangeActionTaskReference() {
    return accountLienExchangeActionTaskReference;
  }

  public void setAccountLienExchangeActionTaskReference(String accountLienExchangeActionTaskReference) {
    this.accountLienExchangeActionTaskReference = accountLienExchangeActionTaskReference;
  }

  public InlineResponse20010 accountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountLienExchangeActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")

  @Valid

  public Object getAccountLienExchangeActionTaskRecord() {
    return accountLienExchangeActionTaskRecord;
  }

  public void setAccountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
  }

  public InlineResponse20010 accountLienExchangeActionResponse(String accountLienExchangeActionResponse) {
    this.accountLienExchangeActionResponse = accountLienExchangeActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return accountLienExchangeActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")


  public String getAccountLienExchangeActionResponse() {
    return accountLienExchangeActionResponse;
  }

  public void setAccountLienExchangeActionResponse(String accountLienExchangeActionResponse) {
    this.accountLienExchangeActionResponse = accountLienExchangeActionResponse;
  }

  public InlineResponse20010 accountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. accepted, rejected, verified) 
   * @return accountLienInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. accepted, rejected, verified) ")


  public String getAccountLienInstanceStatus() {
    return accountLienInstanceStatus;
  }

  public void setAccountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.accountLienExchangeActionTaskReference, inlineResponse20010.accountLienExchangeActionTaskReference) &&
        Objects.equals(this.accountLienExchangeActionTaskRecord, inlineResponse20010.accountLienExchangeActionTaskRecord) &&
        Objects.equals(this.accountLienExchangeActionResponse, inlineResponse20010.accountLienExchangeActionResponse) &&
        Objects.equals(this.accountLienInstanceStatus, inlineResponse20010.accountLienInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienExchangeActionTaskReference, accountLienExchangeActionTaskRecord, accountLienExchangeActionResponse, accountLienInstanceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    accountLienExchangeActionTaskReference: ").append(toIndentedString(accountLienExchangeActionTaskReference)).append("\n");
    sb.append("    accountLienExchangeActionTaskRecord: ").append(toIndentedString(accountLienExchangeActionTaskRecord)).append("\n");
    sb.append("    accountLienExchangeActionResponse: ").append(toIndentedString(accountLienExchangeActionResponse)).append("\n");
    sb.append("    accountLienInstanceStatus: ").append(toIndentedString(accountLienInstanceStatus)).append("\n");
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

