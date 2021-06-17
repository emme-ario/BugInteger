package buginteger;

/**
 * @version 1.0
 * @author Mariottini
 * @author Gregorelli
 * @author Palestro
 * @author Sakurti
 */

public class CustomizedException extends Exception {
    private final String descrizione;
    
    public CustomizedException(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Exception {" + descrizione + "}";
    }
}
