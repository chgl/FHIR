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

@System("http://hl7.org/fhir/product-category")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class BiologicallyDerivedProductCategory extends Code {
    /**
     * Organ
     * 
     * <p>A collection of tissues joined in a structural unit to serve a common function.
     */
    public static final BiologicallyDerivedProductCategory ORGAN = BiologicallyDerivedProductCategory.builder().value(ValueSet.ORGAN).build();

    /**
     * Tissue
     * 
     * <p>An ensemble of similar cells and their extracellular matrix from the same origin that together carry out a specific 
     * function.
     */
    public static final BiologicallyDerivedProductCategory TISSUE = BiologicallyDerivedProductCategory.builder().value(ValueSet.TISSUE).build();

    /**
     * Fluid
     * 
     * <p>Body fluid.
     */
    public static final BiologicallyDerivedProductCategory FLUID = BiologicallyDerivedProductCategory.builder().value(ValueSet.FLUID).build();

    /**
     * Cells
     * 
     * <p>Collection of cells.
     */
    public static final BiologicallyDerivedProductCategory CELLS = BiologicallyDerivedProductCategory.builder().value(ValueSet.CELLS).build();

    /**
     * BiologicalAgent
     * 
     * <p>Biological agent of unspecified type.
     */
    public static final BiologicallyDerivedProductCategory BIOLOGICAL_AGENT = BiologicallyDerivedProductCategory.builder().value(ValueSet.BIOLOGICAL_AGENT).build();

    private volatile int hashCode;

    private BiologicallyDerivedProductCategory(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    public static BiologicallyDerivedProductCategory of(ValueSet value) {
        switch (value) {
        case ORGAN:
            return ORGAN;
        case TISSUE:
            return TISSUE;
        case FLUID:
            return FLUID;
        case CELLS:
            return CELLS;
        case BIOLOGICAL_AGENT:
            return BIOLOGICAL_AGENT;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    public static BiologicallyDerivedProductCategory of(java.lang.String value) {
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
        BiologicallyDerivedProductCategory other = (BiologicallyDerivedProductCategory) obj;
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
        public BiologicallyDerivedProductCategory build() {
            return new BiologicallyDerivedProductCategory(this);
        }
    }

    public enum ValueSet {
        /**
         * Organ
         * 
         * <p>A collection of tissues joined in a structural unit to serve a common function.
         */
        ORGAN("organ"),

        /**
         * Tissue
         * 
         * <p>An ensemble of similar cells and their extracellular matrix from the same origin that together carry out a specific 
         * function.
         */
        TISSUE("tissue"),

        /**
         * Fluid
         * 
         * <p>Body fluid.
         */
        FLUID("fluid"),

        /**
         * Cells
         * 
         * <p>Collection of cells.
         */
        CELLS("cells"),

        /**
         * BiologicalAgent
         * 
         * <p>Biological agent of unspecified type.
         */
        BIOLOGICAL_AGENT("biologicalAgent");

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
