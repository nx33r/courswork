@Data
class Route {
    private String id;
    private String departureAddress;
    private String destinationAddress;
    private List<String> stops;
    private double fareBetweenStops;
    private double ticketPrice;
    private double distanceBetweenStops;
    private double totalDistance;
}
