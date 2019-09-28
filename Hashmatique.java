import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> tracks = new HashMap<String, String>();
        tracks.put("whole foods parking lot", "Since they took Kombucha off the self");
        tracks.put("SUmertime", "blah blah, blah");
        tracks.put("sunshine", "Sundress,blah, blah, blah");
        tracks.put("fly", "flying with the eagles blah blah blah");
        
        System.out.println(tracks.get("fly")); 
        Set<String> keys = tracks.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(tracks.get(key));       
        }
    }
}