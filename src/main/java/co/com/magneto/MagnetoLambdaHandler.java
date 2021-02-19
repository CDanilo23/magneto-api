package co.com.magneto;

import co.com.magneto.business.MagnetoAdnProcess;
import co.com.magneto.model.entity.dao.AdnDao;
import co.com.magneto.transfer.Adn;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class MagnetoLambdaHandler implements RequestHandler<Adn, String> {

    AdnDao adnDao;

    @Override
    public String handleRequest(Adn adn, Context context) {
        context.getLogger().log("Esta es la secuencia ADN " + adn.toString());

        adnDao = new AdnDao();
        adnDao.saveAdn(adn.toString());
        return MagnetoAdnProcess.isMutant(adn) ? "200" : "403";

    }
}