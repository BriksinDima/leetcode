class OrderedStream {
  String[] stream;
  int startIdx = 1;

  public OrderedStream(int n) {
    this.stream = new String[n + 1];
  }

  public List<String> insert(int idKey, String value) {
    stream[idKey] = value;
    List<String> chunk = new ArrayList<>();
    while (startIdx < stream.length && stream[startIdx] != null) {
      chunk.add(stream[startIdx]);
      startIdx++;
    }
    return chunk;
  }
}