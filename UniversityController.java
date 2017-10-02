package pro.aloginov.revoluttest;

import pro.aloginov.revoluttest.model.University;
import pro.aloginov.revoluttest.protocol.UniversityCreationRequest;
import pro.aloginov.revoluttest.protocol.UniversityCreationResponse;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.*;
import java.util.List;

@Singleton
@Path("University")
public class UniversityController {
    private final UniversityService universityService;
    @Inject
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @POST
    public UniversityCreationResponse createUniversity(UniversityCreationRequest universityCreationRequest){
      return new UniversityCreationResponse(universityService.AddUniversity(universityCreationRequest.id, universityCreationRequest.name,
              universityCreationRequest.address, universityCreationRequest.city));
    }

    @GET
    @Path("{universityId}")
    public UniversityCreationRequest getUniversity(@PathParam("universityId") int id){
        University university  = universityService.GetUnuversity(id);
     return new UniversityCreationRequest(university.name,university.id,university.city,university.address);
    }


    @DELETE
    @Path("{id/delete}")
    public UniversityCreationResponse deleteUniversity(int id){
        University university =  universityService.GetUnuversity(id);
         return new UniversityCreationResponse(universityService.DeleteUniversity(university.id));
    }
    @POST
    @Path("{id/changeName/NewId/newAdress/newCity/newName}")
    public University changeFields(@PathParam("id") int id, @PathParam("newAdress") String adress,
                                                  @PathParam("newCity")String City, @PathParam("newName") String name){
        University university = universityService.ChangeFieldsUniversity(id,name,adress,City);
        return new University();

      }
}


