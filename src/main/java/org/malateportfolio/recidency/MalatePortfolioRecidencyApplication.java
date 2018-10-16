package org.malateportfolio.recidency;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MalatePortfolioRecidencyApplication extends Application<MalatePortfolioRecidencyConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MalatePortfolioRecidencyApplication().run(args);
    }

    @Override
    public String getName() {
        return "MalatePortfolioRecidency";
    }

    @Override
    public void initialize(final Bootstrap<MalatePortfolioRecidencyConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MalatePortfolioRecidencyConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
