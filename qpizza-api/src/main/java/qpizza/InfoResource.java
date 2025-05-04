package qpizza;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

@Path("/info")
public class InfoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getInfo() {
        var info = Map.of("info", "Ola QPizza");
        return info;
    }

}