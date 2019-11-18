package afandi.percobaan2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
            mListCountry.add("Indonesia");
            mListCountry.add("Malaysia");
            mListCountry.add("German");
            
            System.out.println(mListCountry);
            System.out.format("List index 0 = %s\n", mListCountry.get(0));
            System.out.format("List index 2 = %s\n", mListCountry.get(2));
            
        }
    }