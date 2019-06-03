class Hat {
  String hatType = "CowBoy";
  int size = 10;

  @Override
  public String toString() {
    return hatType + ":" + size;
  }

  public static void main(String[] args) {
    Hat hat = new Hat();
    System.out.println(hat);
  }
}