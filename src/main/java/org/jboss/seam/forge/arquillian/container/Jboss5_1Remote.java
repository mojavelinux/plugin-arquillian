package org.jboss.seam.forge.arquillian.container;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.forge.project.dependencies.DependencyBuilder;
import org.jboss.forge.project.dependencies.ScopeType;

public class Jboss5_1Remote implements Container
{
   @Inject
   ProfileBuilder builder;

   @Override
   public void installDependencies(String arquillianVersion)
   {
      DependencyBuilder dep1 = DependencyBuilder.create()
                .setGroupId("org.jboss.arquillian.container")
                .setArtifactId("arquillian-jbossas-remote-5.1")
                .setVersion(arquillianVersion)
                .setScopeType(ScopeType.TEST);

      DependencyBuilder dep2 = DependencyBuilder.create()
                .setGroupId("org.jboss.jbossas")
                .setArtifactId("jboss-as-client")
                .setVersion("5.1.0.GA")
                .setPackagingType("pom")
                .setScopeType(ScopeType.TEST);
      builder.addProfile("jbossas-remote-5.1", dep1, dep2);
   }
}
