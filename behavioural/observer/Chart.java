package observer;

public class Chart implements Observer {
    DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // push style
    // @Override
    // public void update(int value) {
    //     System.out.println("Update in Chart using value: " + value);
    // }

    // pull style
    @Override
    public void update() {
        System.out.println("Update in Chart using value: " + dataSource.getValue());        
    }
}
