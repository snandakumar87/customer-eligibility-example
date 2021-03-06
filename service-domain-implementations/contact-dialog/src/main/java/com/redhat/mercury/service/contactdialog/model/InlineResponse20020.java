package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20020PaymentsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20020
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse20020   {
  @JsonProperty("paymentsInstanceRecord")
  private InlineResponse20020PaymentsInstanceRecord paymentsInstanceRecord;

  @JsonProperty("paymentsExecuteActionTaskReference")
  private String paymentsExecuteActionTaskReference;

  @JsonProperty("paymentsExecuteActionTaskRecord")
  private Object paymentsExecuteActionTaskRecord;

  @JsonProperty("paymentsExecuteRecordReference")
  private String paymentsExecuteRecordReference;

  @JsonProperty("executeResponseRecord")
  private Object executeResponseRecord;

  public InlineResponse20020 paymentsInstanceRecord(InlineResponse20020PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
    return this;
  }

  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20020PaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(InlineResponse20020PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }

  public InlineResponse20020 paymentsExecuteActionTaskReference(String paymentsExecuteActionTaskReference) {
    this.paymentsExecuteActionTaskReference = paymentsExecuteActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance execute service call 
   * @return paymentsExecuteActionTaskReference
  */
  @ApiModelProperty(example = "PEATR737876", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance execute service call ")


  public String getPaymentsExecuteActionTaskReference() {
    return paymentsExecuteActionTaskReference;
  }

  public void setPaymentsExecuteActionTaskReference(String paymentsExecuteActionTaskReference) {
    this.paymentsExecuteActionTaskReference = paymentsExecuteActionTaskReference;
  }

  public InlineResponse20020 paymentsExecuteActionTaskRecord(Object paymentsExecuteActionTaskRecord) {
    this.paymentsExecuteActionTaskRecord = paymentsExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return paymentsExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getPaymentsExecuteActionTaskRecord() {
    return paymentsExecuteActionTaskRecord;
  }

  public void setPaymentsExecuteActionTaskRecord(Object paymentsExecuteActionTaskRecord) {
    this.paymentsExecuteActionTaskRecord = paymentsExecuteActionTaskRecord;
  }

  public InlineResponse20020 paymentsExecuteRecordReference(String paymentsExecuteRecordReference) {
    this.paymentsExecuteRecordReference = paymentsExecuteRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments execute transaction/record 
   * @return paymentsExecuteRecordReference
  */
  @ApiModelProperty(example = "PERR72.0.0", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments execute transaction/record ")


  public String getPaymentsExecuteRecordReference() {
    return paymentsExecuteRecordReference;
  }

  public void setPaymentsExecuteRecordReference(String paymentsExecuteRecordReference) {
    this.paymentsExecuteRecordReference = paymentsExecuteRecordReference;
  }

  public InlineResponse20020 executeResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response ")

  @Valid

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020 inlineResponse20020 = (InlineResponse20020) o;
    return Objects.equals(this.paymentsInstanceRecord, inlineResponse20020.paymentsInstanceRecord) &&
        Objects.equals(this.paymentsExecuteActionTaskReference, inlineResponse20020.paymentsExecuteActionTaskReference) &&
        Objects.equals(this.paymentsExecuteActionTaskRecord, inlineResponse20020.paymentsExecuteActionTaskRecord) &&
        Objects.equals(this.paymentsExecuteRecordReference, inlineResponse20020.paymentsExecuteRecordReference) &&
        Objects.equals(this.executeResponseRecord, inlineResponse20020.executeResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceRecord, paymentsExecuteActionTaskReference, paymentsExecuteActionTaskRecord, paymentsExecuteRecordReference, executeResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020 {\n");
    
    sb.append("    paymentsInstanceRecord: ").append(toIndentedString(paymentsInstanceRecord)).append("\n");
    sb.append("    paymentsExecuteActionTaskReference: ").append(toIndentedString(paymentsExecuteActionTaskReference)).append("\n");
    sb.append("    paymentsExecuteActionTaskRecord: ").append(toIndentedString(paymentsExecuteActionTaskRecord)).append("\n");
    sb.append("    paymentsExecuteRecordReference: ").append(toIndentedString(paymentsExecuteRecordReference)).append("\n");
    sb.append("    executeResponseRecord: ").append(toIndentedString(executeResponseRecord)).append("\n");
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

