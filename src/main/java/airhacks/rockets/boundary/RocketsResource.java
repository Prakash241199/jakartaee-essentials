package airhacks.rockets.boundary;


import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.prakash;
import jakarta.ws.rs.yeshwanth

@Path("rockets")
public class RocketsResource {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String get(){
        return "🚀🛸";
    }
}
