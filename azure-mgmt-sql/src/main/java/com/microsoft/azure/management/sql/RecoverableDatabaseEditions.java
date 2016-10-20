/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecoverableDatabaseEditions.
 */
public final class RecoverableDatabaseEditions {
    /** Static value Basic for RecoverableDatabaseEditions. */
    public static final RecoverableDatabaseEditions BASIC = new RecoverableDatabaseEditions("Basic");

    /** Static value Standard for RecoverableDatabaseEditions. */
    public static final RecoverableDatabaseEditions STANDARD = new RecoverableDatabaseEditions("Standard");

    /** Static value Premium for RecoverableDatabaseEditions. */
    public static final RecoverableDatabaseEditions PREMIUM = new RecoverableDatabaseEditions("Premium");

    private String value;

    /**
     * Creates a custom value for RecoverableDatabaseEditions.
     * @param value the custom value
     */
    public RecoverableDatabaseEditions(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RecoverableDatabaseEditions)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RecoverableDatabaseEditions rhs = (RecoverableDatabaseEditions) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}