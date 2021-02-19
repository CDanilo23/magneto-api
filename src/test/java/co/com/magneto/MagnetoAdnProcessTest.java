package co.com.magneto;

import co.com.magneto.business.MagnetoAdnProcess;
import co.com.magneto.model.entity.dao.AdnDao;
import co.com.magneto.transfer.Adn;
import org.junit.Assert;
import org.junit.Test;

public class MagnetoAdnProcessTest {

  AdnDao adnDao;

  @Test
  public void test_That_validate_process(){
    String [] cadenaAdn = {"TTGCGA","CTGTGC","TTATGT","AGAAGG","CCCCAA","TCACTA"};
    Adn adn = new Adn();
    adn.setDna(cadenaAdn);

    Assert.assertEquals(MagnetoAdnProcess.isMutant(adn), true);
  }

  @Test
  public void test_That_validate_process_with_bean(){
    String [] arrayAdn = {"TTGCGA","CTGTGC","TTATGT","AGAAGG","CCCCAA","TCACTA"};

    String cadenaAdn = String.join(",", arrayAdn);

    adnDao = new AdnDao();
    adnDao.saveAdn(cadenaAdn);
  }

}
