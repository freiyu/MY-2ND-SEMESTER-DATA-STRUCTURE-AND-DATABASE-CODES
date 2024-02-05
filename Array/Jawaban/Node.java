public class Node {

    //jika ada fungsi yang return node, maka akan diubah menjadi string
    @Override
    public String toString() {
        return String.valueOf(value);
    }

    int value;

    public Node(int value)
    {
        this.value = value;
    }
}
