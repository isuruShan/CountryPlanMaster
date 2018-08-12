package com.virtusa;

import com.virtusa.District.DistrictService;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<Class<?>>(2);
        set.add(MOXyJsonProvider.class);
        set.add(VillageService.class);
        set.add(DistrictService.class);
        return set;
    }
}
