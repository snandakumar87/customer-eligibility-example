package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsRetrieveInputModelPaymentsInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQPaymentsRetrieveInputModelPaymentsInstanceReport1   {
  @JsonProperty("paymentsInstanceReportReference")
  private String paymentsInstanceReportReference;

  public BQPaymentsRetrieveInputModelPaymentsInstanceReport1 paymentsInstanceReportReference(String paymentsInstanceReportReference) {
    this.paymentsInstanceReportReference = paymentsInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentsInstanceReportReference
  */
  @ApiModelProperty(example = "740948", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getPaymentsInstanceReportReference() {
    return paymentsInstanceReportReference;
  }

  public void setPaymentsInstanceReportReference(String paymentsInstanceReportReference) {
    this.paymentsInstanceReportReference = paymentsInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsRetrieveInputModelPaymentsInstanceReport1 bqPaymentsRetrieveInputModelPaymentsInstanceReport1 = (BQPaymentsRetrieveInputModelPaymentsInstanceReport1) o;
    return Objects.equals(this.paymentsInstanceReportReference, bqPaymentsRetrieveInputModelPaymentsInstanceReport1.paymentsInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsRetrieveInputModelPaymentsInstanceReport1 {\n");
    
    sb.append("    paymentsInstanceReportReference: ").append(toIndentedString(paymentsInstanceReportReference)).append("\n");
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

