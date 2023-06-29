  public static List<String> getFilesCreatedInCurrentMonth() {
        List<String> fileNames = new ArrayList<>();
        File folder = new File(FILE_PATH);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".csv"));
        if (files != null) {
            LocalDate currentDate = LocalDate.now();
            int currentYear = currentDate.getYear();
            int currentMonth = currentDate.getMonthValue();
            for (File file : files) {
                String fileName = file.getName();
                String[] parts = fileName.split("-");
                if (parts.length == 3) {
                    String fileDate = parts[1];
                    String[] dateParts = fileDate.split("_");
                    if (dateParts.length == 3) {
                        int year = Integer.parseInt(dateParts[0]);
                        int month = Integer.parseInt(dateParts[1]);
                        if (year == currentYear && month == currentMonth) {
                            fileNames.add(fileName);
                        }
                    }
                }
            }
        }
        return fileNames;
    }
}
