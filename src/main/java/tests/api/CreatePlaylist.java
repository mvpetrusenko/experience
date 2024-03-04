package tests.api;

public class CreatePlaylist {

    String id2 = "4";
    String description = "my new playlist";

    public CreatePlaylist(String id, String description) {
        this.id2 = id;
        this.description = description;
    }

    public String getId() {
        return id2;
    }

    public String getDescription() {
        return description;
    }
}
