/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties indicating head pose of the face.
 */
public class HeadPoseProperties {
    /**
     * The roll property.
     */
    @JsonProperty(value = "roll")
    private double roll;

    /**
     * The yaw property.
     */
    @JsonProperty(value = "yaw")
    private double yaw;

    /**
     * The pitch property.
     */
    @JsonProperty(value = "pitch")
    private double pitch;

    /**
     * Get the roll value.
     *
     * @return the roll value
     */
    public double roll() {
        return this.roll;
    }

    /**
     * Set the roll value.
     *
     * @param roll the roll value to set
     * @return the HeadPoseProperties object itself.
     */
    public HeadPoseProperties withRoll(double roll) {
        this.roll = roll;
        return this;
    }

    /**
     * Get the yaw value.
     *
     * @return the yaw value
     */
    public double yaw() {
        return this.yaw;
    }

    /**
     * Set the yaw value.
     *
     * @param yaw the yaw value to set
     * @return the HeadPoseProperties object itself.
     */
    public HeadPoseProperties withYaw(double yaw) {
        this.yaw = yaw;
        return this;
    }

    /**
     * Get the pitch value.
     *
     * @return the pitch value
     */
    public double pitch() {
        return this.pitch;
    }

    /**
     * Set the pitch value.
     *
     * @param pitch the pitch value to set
     * @return the HeadPoseProperties object itself.
     */
    public HeadPoseProperties withPitch(double pitch) {
        this.pitch = pitch;
        return this;
    }

}
