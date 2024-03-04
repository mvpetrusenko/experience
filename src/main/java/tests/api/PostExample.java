package tests.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostExample {
    private String name;
    private String descriptionRequest;
    @JsonProperty("public")
    private boolean mypublic;


    public String getName() {
        return name;
    }

    public String getDescriptionRequest() {
        return descriptionRequest;
    }

    public boolean isMypublic() {
        return mypublic;
    }

    public PostExample(String name, String description, boolean mypublic) {
        this.name = name;
        this.descriptionRequest = description;
        this.mypublic = mypublic;
    }



}
