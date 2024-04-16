import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int numWords = 0; 
    for(int i = 0; i < myList.size(); i++){
    String store = myList.get(i);
      if(store.size() == len)
       numWords++;
    }
    return numWords;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
for(int i = 0; i < myList.size(); i++){
    String store = myList.get(i);
      if(store.size() == len)
       myList.remove(i);
    }
    return myList;
  }
}
