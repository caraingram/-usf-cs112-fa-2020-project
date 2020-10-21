public class DataPoint {
  private double f1,f2;
  private String label,type;

  public DataPoint() {
    this.f1 = 0.0;
    this.f2 = 0.0;
  }

  public DataPoint(double p1, double p2, String p3, String p4) {
    this.f1 = p1;
    this.f2 = p2;
    this.label = p3;
    this.type = p4;
  }

  // Accessors
  public double getF1() { return this.f1; }
  public double getF2() { return this.f2; }
  public String getLabel() { return this.label; }
  public String getType() { return this.type; }

  // Mutators
  public void setF1(double in) { f1 = in; }
  public void setF2(double in) { f2 = in; }
  public void setLabel(String in) { this.label = in; }
  public void setType(String in) { this.type = in; }

}
