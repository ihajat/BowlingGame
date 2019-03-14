import java.util.ArrayList;
import java.util.List;

public class Converter {

    public List<Integer> convert(String f){
        List<Integer> rolls = new ArrayList<>();
        String[] frames = f.split(" ");
        for (String frame : frames) {
            String[] balls = frame.split("");
            for (String ball : balls) {
                rolls.add(Integer.valueOf(ball));
            }
        }
        return rolls;
    }
}