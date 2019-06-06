/**
 * Ma class d'exemple.
 */
public class Exemple {
  /**
   * t est une chaine de caractère.
   */
   private final String t;
   /**
    * v est un entier.
    */
    private final int v;
    /**
     * Constructeur.
     * @param a est une chaine de caractère
     */
    public Exemple(final String a) {
       t = a;
    }
    /**
     * getter.
     * @return la valeur de v
     */
    public int getV() {
      return this.v;
    }
    /**
     * setter.
     * @param b est un entier
     */
    public final void setV(final int b) {
       this.v = b;
    }
    /**
     * @return t si v est positif.
     */
    public final String getT() {
        if (v > 0) {
            return t;
        }
    }
}
