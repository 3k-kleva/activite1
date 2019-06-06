/**
 * Opération sur les tableaux.
 * @author KLEVA KOUGBLENOU
 */
public final class TabAlgos {
  /** Constructeur pour empêcher l'instanciation.*/
  private TabAlgos() { }
  /**
   * Renvoie la valeur la plus grande d'un tableau.
   * @param tab tableau d'entier
   * @return grand la valeur la plus grand
   */
  public static int plusGrand(final int[] tab) {
    int tampon = tab[0];
    for (int i = 1; i < tab.length; i++) {
        if (tab[i] > tampon) {
           tampon = tab[i];
        }
    }
    return tampon;
  }
  /** Calcul la moyenne des valeurs d'un tableau.
   * @param tab tableau d'entier
   * @return la moyenne
   */
  public static double moyenne(final int[] tab) {
    int somme = 0;
    double moy;
    for (int i = 0; i < tab.length; i++) {
        somme += tab[i];
    }
    moy = somme / tab.length;
    return moy;
  }
  /** Teste si 2 tableaux sont identiques.
   * (avec les elements dans le meme ordre)
   * @param tab1 est un tableau d'entier
   * @param tab2 est un tableau d'entier
   * @return true / false
   */
  public static boolean egaux(final int[] tab1, final int[] tab2) {
    if (tab1.length == tab2.length) {
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                i = tab1.length;
                return false;
            }
        }
        return true;
    } else {
    return false;
    }
  }
}
