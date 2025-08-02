public class Mosque implements Mappable {
    private String name;
    private String location;
    private String city;

    public Mosque(String name, String location, String city) {
        this.name = name;
        this.location = location;
        this.city = city;
    }

    @Override
    public String getLabel() {
        return name + ", " + location + " (" + city.toUpperCase() + ")";
    }

    @Override
    public String getShape() {
        return "POINT";
    }

    @Override
    public String getMarker() {
        return "MINARET ICON";
    }

    public String toJSON() {
        return  Mappable.super.toJSON() + """
                , "name": "%s", "location": "%s", "city": "%s"
                """.formatted(name, location, city);
    }
}
