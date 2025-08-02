public interface Mappable {
    String getLabel();
    String getShape();
    String getMarker();

    String JSON_PROPERTY = """
            "properties": {%s} """;

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
