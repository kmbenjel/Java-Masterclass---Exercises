public class Road implements Mappable {
    private String name;
    private String city;

    public Road(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String getLabel() {
        return name + " (" + city.toUpperCase() + ")";
    }

    @Override
    public String getShape() {
        return "LINE";
    }

    @Override
    public String getMarker() {
        return "SOLID GREY LINE";
    }

    public String toJSON() {
        return  Mappable.super.toJSON() + """
                , "name": "%s", "city": "%s" """.formatted(name, city);
    }
}
