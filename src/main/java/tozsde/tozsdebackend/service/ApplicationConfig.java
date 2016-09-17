/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tozsde.tozsdebackend.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Ádám
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(tozsde.tozsdebackend.NewCrossOriginResourceSharingFilter.class);
        resources.add(tozsde.tozsdebackend.service.AjanlattetelFacadeREST.class);
        resources.add(tozsde.tozsdebackend.service.ArfolyamadatokFacadeREST.class);
        resources.add(tozsde.tozsdebackend.service.ArfolyamgrafikonFacadeREST.class);
        resources.add(tozsde.tozsdebackend.service.ErtekpapirFacadeREST.class);
        resources.add(tozsde.tozsdebackend.service.UgyfelEgyenlegFacadeREST.class);
        resources.add(tozsde.tozsdebackend.service.UgyfelErtekpapirBirtoklasFacadeREST.class);
        resources.add(tozsde.tozsdebackend.service.UgyfelFacadeREST.class);
    }
    
}
