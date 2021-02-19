package co.com.magneto.model.entity.dao;


import co.com.magneto.model.entity.AdnVerified;
import co.com.magneto.transfer.Adn;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdnDao {

  AmazonDynamoDB client;
  DynamoDBMapper mapper;

  Logger logger = Logger.getLogger(AdnDao.class.getName());

  public AdnDao() {
    client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
    mapper = new DynamoDBMapper(client);
  }

  public void saveAdn(String cadenaAdn){

    try {

      AdnVerified adnVerified = new AdnVerified();
      adnVerified.setCadenaAdn(cadenaAdn);
      mapper.save(adnVerified);

    } catch (Exception e) {
      logger.log(Level.WARNING, e.getMessage());
    }

  }

}
