/*
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
 *  Copyright 2017 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.payment;

public enum OBExternalPaymentContext1Code {
    /**
     * The context of the payment initiation is a bill payment.
     */
    BillPayment,
    /**
     * The context of the payment initiation is a for goods via an ecommerce channel.
     */
    EcommerceGoods,
    /**
     * The context of the payment initiation is a for services via an ecommerce channel.
     */
    EcommerceServices,
    /**
     * The context of the payment initiation is a person to person payment.
     */
    PersonToPerson,
    /**
     * The context of the payment initiation is of an other type.
     */
    Other,
}
