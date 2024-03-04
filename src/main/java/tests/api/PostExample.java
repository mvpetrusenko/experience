package tests.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostExample {
    private String name;
    private String description;
    @JsonProperty("public")
    private boolean mypublic;


    public PostExample(String name, String description, boolean mypublic) {
        this.name = name;
        this.description = description;
        this.mypublic = mypublic;
    }

// do NOT create getter, because it is POST request

}
