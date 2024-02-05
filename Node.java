/*
 * JAWABAN INI MILIK
 * RAKASYAEL HIZKIA KOLONDAM
 * 2023105490 - SISTEM INFORMASI
 * 
 * Saya menggunakan setters dan getters untuk node value nya
 * untuk akses dan mutasi kelas OOP Java
 */

public class Node {

    int value;

    public Node(int value)
    {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
    //fungsi ini digunakan untuk mengubah alamat node menjadi string
    //override disini akan dipakai di get, remove, insert, dan reverse
    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
