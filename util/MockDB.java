package util;

import java.util.Map;

public class MockDB<K, V> implements MockDBBase<K, V> {

  public Map<K, V> data;

  public MockDB(Map<K, V> data) {
    this.data = data;
  }
  
  public MockDB() {};

  @Override
  public void save(K key, V value) {
    data.put(key, value);
  }

  @Override
  public void update(K key, V value) {
    data.replace(key, value);
  }

  @Override
  public V get(K key) {
   return data.get(key);
  }

  public void deleteAll() {
    data.clear();
  }
}
