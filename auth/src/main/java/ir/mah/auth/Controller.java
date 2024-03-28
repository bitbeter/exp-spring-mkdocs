package ir.mah.auth;

import ir.mah.auth.models.Location;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

    @GetMapping(value = "/location")
    @CrossOrigin(origins = "http://localhost:8000")
    public Location location() {
        return new Location("random location");
    }
}
