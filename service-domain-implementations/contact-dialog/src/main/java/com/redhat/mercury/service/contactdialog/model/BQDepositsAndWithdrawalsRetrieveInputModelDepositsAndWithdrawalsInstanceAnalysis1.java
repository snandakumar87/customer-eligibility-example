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
 * BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1   {
  @JsonProperty("depositsAndWithdrawalsInstanceAnalysisReference")
  private String depositsAndWithdrawalsInstanceAnalysisReference;

  public BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 depositsAndWithdrawalsInstanceAnalysisReference(String depositsAndWithdrawalsInstanceAnalysisReference) {
    this.depositsAndWithdrawalsInstanceAnalysisReference = depositsAndWithdrawalsInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return depositsAndWithdrawalsInstanceAnalysisReference
  */
  @ApiModelProperty(example = "734357", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getDepositsAndWithdrawalsInstanceAnalysisReference() {
    return depositsAndWithdrawalsInstanceAnalysisReference;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisReference(String depositsAndWithdrawalsInstanceAnalysisReference) {
    this.depositsAndWithdrawalsInstanceAnalysisReference = depositsAndWithdrawalsInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 bqDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 = (BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceAnalysisReference, bqDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1.depositsAndWithdrawalsInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceAnalysisReference: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysisReference)).append("\n");
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

