import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class KNNModel extends Model {

  private ArrayList<DataPoint> trainSet;
  private int k;
  private int survived;
  private int deceased;

  public KNNModel() {
    this.trainSet = new ArrayList<DataPoint>();
    this.survived = 0;
    this.deceased = 0;
  }

  private double getDistance(DataPoint p1, DataPoint p2) {
    double x1 = p1.getF1();
	  double y1 = p1.getF2();
	  double x2 = p2.getF1();
	  double y2 = p2.getF2();
	  return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
  }

  public void train(ArrayList<DataPoint> data) {

    for(DataPoint dataPoint : data) {
      if (dataPoint.getType() == "train") { trainSet.add(dataPoint);  }
      if (dataPoint.getLabel() == "0") {  this.survived += 1; }
      else {
          this.deceased += 1;
		  }
      this.trainSet = data;
  }
}

  public String test(ArrayList<DataPoint> data) { return "Test";  }
  public double getAccuracy(ArrayList<DataPoint> data) {  return 1.00; }
  public double getPrecision(ArrayList<DataPoint> data) {  return 1.00; }

}
