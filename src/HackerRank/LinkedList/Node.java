package HackerRank.LinkedList;

/**
 * Created by srnegi on 3/18/2017.
 */
public class Node {

  private int data;
  private Node nextNode;

  public Node(int data) {
    this.data = data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }

  public int getData() {
    return data;
  }

  public Node getNextNode() {
    return nextNode;
  }
  //to print integer we override toString method -to return data of the current node
@Override
  public String toString(){
  return "Data: " +this.data;
}
}
