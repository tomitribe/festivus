package net.starbucks.festivus;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class FestivusApplication extends Application {
    // no implementation here to let the container scans for resources
}
