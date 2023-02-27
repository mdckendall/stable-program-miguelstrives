class Horse {
  String name;
  int weight;
  boolean tame;
  
  public Horse(String name, int weight, boolean tame) {
    this.name = name;
    this.weight = weight;
    this.tame = tame;
  }
  public String getName() {
    return this.name;
  }
  public int getWeight() {
    return this.weight;
  }
  public boolean getTame() {
    return this.tame;
  }
}