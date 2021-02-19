package co.com.magneto.transfer;

import java.util.Arrays;

public class Adn {

  public String [] dna;

  public String[] getDna() {
    return dna;
  }

  public void setDna(String[] dna) {
    this.dna = dna;
  }

  @Override
  public String toString() {
    return "Adn{" +
        "dna=" + Arrays.toString(dna) +
        '}';
  }
}
