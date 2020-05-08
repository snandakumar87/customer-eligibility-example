package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecordPaymentTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsExecuteInputModelPaymentsInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQPaymentsExecuteInputModelPaymentsInstanceRecord   {
  @JsonProperty("paymentTransaction")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecordPaymentTransaction paymentTransaction;

  public BQPaymentsExecuteInputModelPaymentsInstanceRecord paymentTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsExecuteInputModelPaymentsInstanceRecord bqPaymentsExecuteInputModelPaymentsInstanceRecord = (BQPaymentsExecuteInputModelPaymentsInstanceRecord) o;
    return Objects.equals(this.paymentTransaction, bqPaymentsExecuteInputModelPaymentsInstanceRecord.paymentTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsExecuteInputModelPaymentsInstanceRecord {\n");
    
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
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

