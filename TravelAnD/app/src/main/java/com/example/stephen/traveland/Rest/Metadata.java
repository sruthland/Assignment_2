package com.example.stephen.traveland.Rest;

import java.util.HashMap;
import java.util.Map;

public class Metadata {

    private Generated generated;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The generated
     */
    public Generated getGenerated() {
        return generated;
    }

    /**
     *
     * @param generated
     * The generated
     */
    public void setGenerated(Generated generated) {
        this.generated = generated;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

