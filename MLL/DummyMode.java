import java.util.ArrayList;

public class DummyModel extends Model {

  public void train(ArrayList<DataPoint> data) {
    System.out.println("Complete");
  }

  public String test(ArrayList<DataPoint> data) {
    System.out.println("Complete");
  }

  public double getAccuracy() {
    return 1.00; 
  }

  public double getPrecision() {
    return 1.00; 
  }
}
