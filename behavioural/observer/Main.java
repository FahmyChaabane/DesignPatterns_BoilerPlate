package observer;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        // push style
        // SpreadSheet sheet = new SpreadSheet();
        // Chart chart = new Chart();
        // pull style
        SpreadSheet sheet = new SpreadSheet(dataSource);
        Chart chart = new Chart(dataSource);
        dataSource.addObserver(sheet);
        dataSource.addObserver(chart);
        dataSource.setValue(50);
        System.out.println("~~~~~");
        dataSource.removeObserver(sheet);
        dataSource.setValue(25);
    }
}
