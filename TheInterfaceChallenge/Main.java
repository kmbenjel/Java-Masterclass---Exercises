import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Let's map some Riyadh's Mosques and Roads around QSS!
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Mosque("Al-Rajhi", "Al-Jazeera", "Riyadh"));
        mappables.add(new Mosque("Uthman Ibn Affan", "Qurtubah", "Riyadh"));
        mappables.add(new Mosque("Salam", "Salam Park", "Riyadh"));

        mappables.add(new Road("Uthman Ibn Affan Road", "Riyadh"));
        mappables.add(new Road("Airport Road", "Riyadh"));

        for (var m : mappables)
            Mappable.mapIt(m);
    }
}
