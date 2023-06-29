 public static List<String> readEntityFromFile(String entityName) {
        List<String> entityData = new ArrayList<>();
        File folder = new File(FILE_PATH);
        File[] files = folder.listFiles((dir, name) -> name.startsWith(entityName) && name.endsWith(".csv"));
        if (files != null) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        entityData.add(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return entityData;
    }
