package String;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class CountSegment {

    public int countSegments(String s) {

        s = s.trim();

        if(s.length() == 0){
            return 0;
        }

        return s.split("\\s+").length;
    }
}
