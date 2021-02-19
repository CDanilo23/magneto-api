package co.com.magneto.business;

import co.com.magneto.transfer.Adn;

public class MagnetoAdnProcess {


  public static boolean isMutant(Adn adn) {

    String fila1 = adn.getDna()[0];
    String fila2 = adn.getDna()[1];
    String fila3 = adn.getDna()[2];
    String fila4 = adn.getDna()[3];
    String fila5 = adn.getDna()[4];
    String fila6 = adn.getDna()[5];

    String [] filaDividida1 = fila1.split("");
    String [] filaDividida2 = fila2.split("");
    String [] filaDividida3 = fila3.split("");
    String [] filaDividida4 = fila4.split("");
    String [] filaDividida5 = fila5.split("");
    String [] filaDividida6 = fila6.split("");


    String [][] adnBidi = new String[6][6];

    for(int i = 0; i < 6; i++) {
      adnBidi[0][i]= filaDividida1[i];
    }

    for(int i = 0; i < 6; i++) {
      adnBidi[1][i]= filaDividida2[i];
    }

    for(int i = 0; i < 6; i++) {
      adnBidi[2][i]= filaDividida3[i];
    }

    for(int i = 0; i < 6; i++) {
      adnBidi[3][i]= filaDividida4[i];
    }

    for(int i = 0; i < 6; i++) {
      adnBidi[4][i]= filaDividida5[i];
    }

    for(int i = 0; i < 6; i++) {
      adnBidi[5][i]= filaDividida6[i];
    }

    int mutante = 0;

    for (int x = 0; x < adnBidi[0].length; x++) {

      for (int y = 0; y < adnBidi[0].length; y++) {

        if ((y >= 0 && y <= 2) && (x >= 0 && x <= 2)) {
          boolean igualdad = evaluarIgualdad(adnBidi[x][y], adnBidi[x + 1][y + 1],
              adnBidi[x + 2][y + 2], adnBidi[x + 3][y + 3]);
          if (igualdad) {
            mutante = mutante + 1;
          }
        }

        if (y >= 0 && y <= 2) {

          boolean igualdad = evaluarIgualdad(adnBidi[x][y], adnBidi[x][y + 1], adnBidi[x][y + 2],
              adnBidi[x][y + 3]);
          if (igualdad) {
            mutante = mutante + 1;
          }
        }

        if (x >= 0 && x <= 2) {
          boolean igualdad = evaluarIgualdad(adnBidi[x][y], adnBidi[x + 1][y], adnBidi[x + 2][y],
              adnBidi[x + 3][y]);
          if (igualdad) {
            mutante = mutante + 1;
          }
        }
      }
    }

    return mutante > 1;

  }

  static boolean evaluarIgualdad(String letra1, String letra2, String letra3, String letra4) {

    if (letra1.equals(letra2)
        && letra2.equals(letra3)
        && letra3.equals(letra4)) {
      return true;
    }

    return false;
  }
}
