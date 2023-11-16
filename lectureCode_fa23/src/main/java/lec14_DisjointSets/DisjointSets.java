package lec14_DisjointSets;


/**
 * DisjointSets
 */
public interface DisjointSets {
    
    void connect(int p, int q);

    boolean isConnected(int p, int q);
}


