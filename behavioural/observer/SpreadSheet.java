package observer;

public class SpreadSheet implements Observer {
    DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // push style
    // @Override
    // public void update(int value) {
    //     System.out.println("Update in SpreadSheet using value: " + value);        
    // }

    // pull style
    @Override
    public void update() {
        System.out.println("Update in SpreadSheet using value: " + dataSource.getValue());        
    }
}
