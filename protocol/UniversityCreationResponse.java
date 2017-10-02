package pro.aloginov.revoluttest.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UniversityCreationResponse {
    @JsonProperty
    public final int id;


    public UniversityCreationResponse(@JsonProperty("Id") int id) {
        this.id = id;
    }
}
