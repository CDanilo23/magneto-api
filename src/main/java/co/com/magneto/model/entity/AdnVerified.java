package co.com.magneto.model.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import java.io.Serializable;

@DynamoDBTable(tableName = "Adn")
public class AdnVerified implements Serializable {

  @DynamoDBHashKey
  private String cadenaAdn;


  public String getCadenaAdn() {
    return cadenaAdn;
  }

  public void setCadenaAdn(String cadenaAdn) {
    this.cadenaAdn = cadenaAdn;
  }
}
