
package beans.configuracion;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

@FacesConfig(version = JSF_2_3) //activa CDI built-in beans
@ApplicationScoped

public class ConfigurationJSF {
    
}
