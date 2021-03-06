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
 * Event Subscription API Specification - ASPSP Endpoints
 * Swagger for Event Subscription API Specification - ASPSP Endpoints
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBEventSubscription1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:49:38.894+01:00")
public class OBEventSubscription1 {
    @JsonProperty("Data")
    private OBEventSubscription1Data data = null;

    public OBEventSubscription1 data(OBEventSubscription1Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBEventSubscription1Data getData() {
        return data;
    }

    public void setData(OBEventSubscription1Data data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscription1 obEventSubscription1 = (OBEventSubscription1) o;
        return Objects.equals(this.data, obEventSubscription1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscription1 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

}

