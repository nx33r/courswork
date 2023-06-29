@RestController
@RequestMapping("/api")
class BusController {
    private final Map<String, Bus> busMap = new HashMap<>();

    @PostMapping("/bus")
    public Bus addBus(@RequestBody Bus bus) {
        bus.setId(UUID.randomUUID().toString());
        busMap.put(bus.getId(), bus);
        return bus;
    }

    @GetMapping("/bus/{id}")
    public Bus getBusById(@PathVariable String id) {
        return busMap.get(id);
    }

    @GetMapping("/bus")
    public List<Bus> getAllBuses() {
        return new ArrayList<>(busMap.values());
    }

    @PutMapping("/bus/{id}")
    public Bus updateBus(@PathVariable String id, @RequestBody Bus updatedBus) {
        if (busMap.containsKey(id)) {
            updatedBus.setId(id);
            busMap.put(id, updatedBus);
            return updatedBus;
        }
        return null;
    }

    @DeleteMapping("/bus/{id}")
    public void deleteBus(@PathVariable String id) {
        busMap.remove(id);
    }
}
