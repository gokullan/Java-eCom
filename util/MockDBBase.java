package util;

public interface MockDBBase<K, V> {
  V get(K key);

  void save(K key, V value);

  void update(K key, V value);
}
