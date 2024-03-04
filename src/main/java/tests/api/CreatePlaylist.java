package tests.api;

public class CreatePlaylist {

    // from response:

    private String description;
    private String id;

    public CreatePlaylist(String description, String id) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }
}
