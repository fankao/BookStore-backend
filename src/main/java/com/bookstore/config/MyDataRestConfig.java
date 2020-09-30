package com.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private EntityManager manager;

    @Autowired
    public MyDataRestConfig(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        //HttpMethod[] theUnSupportActions = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};

        // call an internal helper method
        exposesIds(config);

    }

    private void disableHttpMethods(Class theClass, RepositoryRestConfiguration config, HttpMethod[] theUnSupportActions) {
        config.getExposureConfiguration().forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnSupportActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnSupportActions));
    }

    private void exposesIds(RepositoryRestConfiguration config) {
        // get list all entity from entity manager
        Set<EntityType<?>> entities = manager.getMetamodel().getEntities();

        // create array for entity class
        List<Class> entityClass = new ArrayList<>();

        // get entity type from entities
        for (EntityType item : entities) {
            entityClass.add(item.getJavaType());
        }

        // expose entity ids for array for entity class
        Class[] domainTypes = entityClass.toArray(new Class[0]);

        config.exposeIdsFor(domainTypes);

    }
}
