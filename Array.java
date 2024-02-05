public class Array {
  // 
  Node[] nodes = new Node[9999999];
  int length = 0;

  // Membuat array
  public Array(int value) {
    Node newNode = new Node(value);
    nodes[length] = newNode;
    length++;
  }

  // Menampilkan seluruh node pada array
  public void printArray() {
    System.out.print("Array: ");
    for (int i = 0; nodes[i] != null; i++) {
      System.out.print(nodes[i].getValue() + " ");
    }
    System.out.println();
  }

  // Mendapatkan panjang array terkini
  public int getLength() {
    return length;
  }

  // Menambahkan node di akhir
  public void append(int value) {
    Node newNode = new Node(value);
    nodes[length] = newNode;
    length++;
  }

  // Menambahkan node di awal
  public void prepend(int value) {
    length++;
    for (int i = length - 1; i > 0; i--) {
      nodes[i] = nodes[i - 1];
    }
    Node newNode = new Node(value);
    nodes[0] = newNode;
  }

  // Menghapus node terakhir
  public Node removeLast() {
    if (length > 0) {
      nodes[length - 1] = null;
      length--;
    }
    return null;
  }

  // Menghapus node pertama
  public Node removeFirst() {
    if (length > 0) {
      Node node = nodes[0];
      for (int i = 0; i < length; i++) {
        nodes[i] = nodes[i + 1];
      }
      nodes[length - 1] = null;
      length--;
      return node;
    }

    return null;
  }

  /*
   * Pada praktikum kali ini silakan lengkapi function/method:
   * 1. get() -> untuk mendapatkan node berdasarkan index
   * 2. insert() -> untuk menambahkan node berdasarkan index
   * 3. remove() -> untuk menghapus node berdasarkan index
   * 4. reverse() -> untuk membalikkan urutan node pada array
   * 
   * Silahkan modifikasi kode sehingga dapat menampilkan output seperti di soal.
   * Modfifikasi kode hanya diperbolehkan pada bagian yang ditandai
   * dan diperbolehkan.
   * 
   * Selamat mengerjakan!
   */

    /*
    JAWABAN INI MILIK
    RAKASYAEL HIZKIA KOLONDAM
    2023105490 - SISTEM INFORMASI
    */

  // Mendapatkan node berdasarkan indeks
  public Node get(int index) {
    if(index >= 0 && index <= length){
      return nodes[index];
    }
    else{
      return null;
    }
  }

  // Menambahkan node berdasarkan indeks
  public void insert(int index, int value) {
    for(int i = length; i >= 1; i--){
      nodes[i] = nodes[i - 1];
    }

    nodes[index] = new Node(value);
    length++;
  }

  // Menghapus node berdasarkan indeks
  public Node remove(int index) {
    if(index >= 0 && index < length){
      Node removedNode = nodes[index];
      for(int i = index + 1; i < length; i++){
        nodes[i - 1] = nodes[i];
      }
      nodes[length - 1] = null;
      length--;
      return removedNode;
    }
    else{
      return null;
    }
  }

  // Membalikkan urutan node pada array
  public void reverse() {
    int left = 0;
    int right = length - 1;
    
    while(left < right){
      Node temp = nodes[left];
      nodes[left] = nodes[right];
      nodes[right] = temp;

      left++;
      right--;
    }
  }
}
