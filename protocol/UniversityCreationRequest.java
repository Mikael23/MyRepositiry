package pro.aloginov.revoluttest.protocol;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UniversityCreationRequest {

      public final int id;
      public final String name;
      @JsonCreator
      public UniversityCreationRequest(@JsonProperty("University_name") String name, @JsonProperty("UniversityId") int id,
                                       @JsonProperty("UniversutyCity") String city, @JsonProperty("UnuversityAdress") String address) {
            this.name = name;
            this.city = city;
            this.address = address;
            this.id = id;
      }

      public final String city;
      public final String address;


}
