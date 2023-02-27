import java.util.ArrayList;

class Stable {
  private String address;
  ArrayList<Horse> horses;

  public Stable(String address) {
    this.address = address;
    horses = new ArrayList<>();
  }
  public int stableSize() {
    return horses.size();
  }
  public void addHorse(Horse horse) {
    horses.add(horse);
  }
  public Horse getHorse(int i) {
    return horses.get(i);
  }
}