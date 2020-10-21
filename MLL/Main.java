import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    ArrayList<DataPoint> trainingData = new ArrayList<>();
    trainingData.add(new DataPoint(0, 0, "Red", "Training"));
    trainingData.add(new DataPoint(1, 1, "Red", "Training"));
    trainingData.add(new DataPoint(2, 2, "Blue", "Training"));
    trainingData.add(new DataPoint(3, 3, "Blue", "Training"));

    ArrayList<DataPoint> testData = new ArrayList<>();
    testData.add(new DataPoint(1.5, 1.5, "", ""));
    testData.add(new DataPoint(0.5, 1.0, "", ""));
    testData.add(new DataPoint(2.0, 2.5, "", ""));

    DummyModel newModel = new DummyModel();
    newModel.train(trainingData);
    
    String result = newModel.test(testData);

    JFrame newPane = new JFrame("Java Project Part 1");
    newPane.setSize(100, 100);

    JLabel newLabel = new JLabel(result);

    newPane.add(newLabel);
    newPane.setVisible(true);

  }
}
