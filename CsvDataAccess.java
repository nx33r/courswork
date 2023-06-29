class CsvDataAccess {
    private static final String FILE_PATH = "data/";

    public static void saveEntityToFile(String entityName, List<String> headers, List<String> data) {
        String fileName = entityName + "-" + LocalDate.now() + ".csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH + fileName, true))) {
            if (headers != null) {
                writer.println(String.join(",", headers));
            }
            writer.println(String.join(",", data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
