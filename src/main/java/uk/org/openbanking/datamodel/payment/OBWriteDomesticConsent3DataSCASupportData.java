/**
 *
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/cddlv1-0/. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2019 ForgeRock AS.
 */
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 */
@ApiModel(description = "Supporting Data provided by TPP, when requesting SCA Exemption.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteDomesticConsent3DataSCASupportData {
    @JsonProperty("RequestedSCAExemptionType")
    private RequestedSCAExemptionTypeEnum requestedSCAExemptionType = null;
    @JsonProperty("AppliedAuthenticationApproach")
    private AppliedAuthenticationApproachEnum appliedAuthenticationApproach = null;
    @JsonProperty("ReferencePaymentOrderId")
    private String referencePaymentOrderId = null;

    public OBWriteDomesticConsent3DataSCASupportData requestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
        this.requestedSCAExemptionType = requestedSCAExemptionType;
        return this;
    }

    /**
     * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
     *
     * @return requestedSCAExemptionType
     **/
    @ApiModelProperty(value = "This field allows a PISP to request specific SCA Exemption for a Payment Initiation")
    public RequestedSCAExemptionTypeEnum getRequestedSCAExemptionType() {
        return requestedSCAExemptionType;
    }

    public void setRequestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
        this.requestedSCAExemptionType = requestedSCAExemptionType;
    }

    public OBWriteDomesticConsent3DataSCASupportData appliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
        this.appliedAuthenticationApproach = appliedAuthenticationApproach;
        return this;
    }

    /**
     * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
     *
     * @return appliedAuthenticationApproach
     **/
    @ApiModelProperty(value = "Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP")
    public AppliedAuthenticationApproachEnum getAppliedAuthenticationApproach() {
        return appliedAuthenticationApproach;
    }

    public void setAppliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
        this.appliedAuthenticationApproach = appliedAuthenticationApproach;
    }

    public OBWriteDomesticConsent3DataSCASupportData referencePaymentOrderId(String referencePaymentOrderId) {
        this.referencePaymentOrderId = referencePaymentOrderId;
        return this;
    }

    /**
     * Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.
     *
     * @return referencePaymentOrderId
     **/
    @Size(min = 1, max = 128)
    @ApiModelProperty(value = "Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.")
    public String getReferencePaymentOrderId() {
        return referencePaymentOrderId;
    }

    public void setReferencePaymentOrderId(String referencePaymentOrderId) {
        this.referencePaymentOrderId = referencePaymentOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticConsent3DataSCASupportData obWriteDomesticConsent3DataSCASupportData = (OBWriteDomesticConsent3DataSCASupportData) o;
        return Objects.equals(this.requestedSCAExemptionType, obWriteDomesticConsent3DataSCASupportData.requestedSCAExemptionType) &&
                Objects.equals(this.appliedAuthenticationApproach, obWriteDomesticConsent3DataSCASupportData.appliedAuthenticationApproach) &&
                Objects.equals(this.referencePaymentOrderId, obWriteDomesticConsent3DataSCASupportData.referencePaymentOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestedSCAExemptionType, appliedAuthenticationApproach, referencePaymentOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticConsent3DataSCASupportData {\n");

        sb.append("    requestedSCAExemptionType: ").append(toIndentedString(requestedSCAExemptionType)).append("\n");
        sb.append("    appliedAuthenticationApproach: ").append(toIndentedString(appliedAuthenticationApproach)).append("\n");
        sb.append("    referencePaymentOrderId: ").append(toIndentedString(referencePaymentOrderId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    /**
     * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
     */
    public enum RequestedSCAExemptionTypeEnum {
        BILLPAYMENT("BillPayment"),

        CONTACTLESSTRAVEL("ContactlessTravel"),

        ECOMMERCEGOODS("EcommerceGoods"),

        ECOMMERCESERVICES("EcommerceServices"),

        KIOSK("Kiosk"),

        PARKING("Parking"),

        PARTYTOPARTY("PartyToParty");

        private String value;

        RequestedSCAExemptionTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RequestedSCAExemptionTypeEnum fromValue(String text) {
            for (RequestedSCAExemptionTypeEnum b : RequestedSCAExemptionTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
     */
    public enum AppliedAuthenticationApproachEnum {
        CA("CA"),

        SCA("SCA");

        private String value;

        AppliedAuthenticationApproachEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static AppliedAuthenticationApproachEnum fromValue(String text) {
            for (AppliedAuthenticationApproachEnum b : AppliedAuthenticationApproachEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

