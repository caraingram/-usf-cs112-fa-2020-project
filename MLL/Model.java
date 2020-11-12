import java.util.ArrayList;

public abstract class Model {

  public abstract void train(ArrayList<DataPoint> data);
  public abstract String test(ArrayList<DataPoint> data);
  public abstract double getAccuracy(ArrayList<DataPoint> data);
  public abstract double getPrecision(ArrayList<DataPoint> data);

}
