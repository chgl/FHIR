/*
 * (C) Copyright IBM Corp. 2019, 2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.model.type.code;

import com.ibm.fhir.model.annotation.System;
import com.ibm.fhir.model.type.Code;
import com.ibm.fhir.model.type.Extension;
import com.ibm.fhir.model.type.String;

import java.util.Collection;
import java.util.Objects;

import javax.annotation.Generated;

@System("http://hl7.org/fhir/device-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class FHIRDeviceStatus extends Code {
    /**
     * Active
     * 
     * <p>The device is available for use. Note: For *implanted devices* this means that the device is implanted in the 
     * patient.
     */
    public static final FHIRDeviceStatus ACTIVE = FHIRDeviceStatus.builder().value(ValueSet.ACTIVE).build();

    /**
     * Inactive
     * 
     * <p>The device is no longer available for use (e.g. lost, expired, damaged). Note: For *implanted devices* this means 
     * that the device has been removed from the patient.
     */
    public static final FHIRDeviceStatus INACTIVE = FHIRDeviceStatus.builder().value(ValueSet.INACTIVE).build();

    /**
     * Entered in Error
     * 
     * <p>The device was entered in error and voided.
     */
    public static final FHIRDeviceStatus ENTERED_IN_ERROR = FHIRDeviceStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Unknown
     * 
     * <p>The status of the device has not been determined.
     */
    public static final FHIRDeviceStatus UNKNOWN = FHIRDeviceStatus.builder().value(ValueSet.UNKNOWN).build();

    private volatile int hashCode;

    private FHIRDeviceStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    public static FHIRDeviceStatus of(ValueSet value) {
        switch (value) {
        case ACTIVE:
            return ACTIVE;
        case INACTIVE:
            return INACTIVE;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case UNKNOWN:
            return UNKNOWN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    public static FHIRDeviceStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    public static String string(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    public static Code code(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FHIRDeviceStatus other = (FHIRDeviceStatus) obj;
        return Objects.equals(id, other.id) && Objects.equals(extension, other.extension) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, extension, value);
            hashCode = result;
        }
        return result;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id(id);
        builder.extension(extension);
        builder.value(value);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (value != null) ? (Builder) super.value(ValueSet.from(value).value()) : this;
        }

        public Builder value(ValueSet value) {
            return (value != null) ? (Builder) super.value(value.value()) : this;
        }

        @Override
        public FHIRDeviceStatus build() {
            return new FHIRDeviceStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Active
         * 
         * <p>The device is available for use. Note: For *implanted devices* this means that the device is implanted in the 
         * patient.
         */
        ACTIVE("active"),

        /**
         * Inactive
         * 
         * <p>The device is no longer available for use (e.g. lost, expired, damaged). Note: For *implanted devices* this means 
         * that the device has been removed from the patient.
         */
        INACTIVE("inactive"),

        /**
         * Entered in Error
         * 
         * <p>The device was entered in error and voided.
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Unknown
         * 
         * <p>The status of the device has not been determined.
         */
        UNKNOWN("unknown");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}
