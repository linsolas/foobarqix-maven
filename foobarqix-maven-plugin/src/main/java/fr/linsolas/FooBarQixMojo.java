package fr.linsolas;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Maven Plugin for FooBarQix.
 * 
 * @goal foobarqix
 * 
 * @phase process-sources
 */
public class FooBarQixMojo extends AbstractMojo {

    /**
     * Start of the counter.
     * 
     * @parameter
     * @required
     */
    private int from = 1;

    /**
     * End of the counter.
     * 
     * @parameter
     * @required
     */
    private int to = 100;

    public void execute() throws MojoExecutionException {
        for (int i = from; i <= to; i++) {
            getLog().info("\t" + FooBarQix.getFooBarQix(i));
        }
    }

}