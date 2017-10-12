import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/*
 * Liste 
 */
public class IdMap<T> {	
	
	public WeakHashMap<Integer,T> hMap;
	
	public IdMap(WeakHashMap hMap) {
		this.hMap = hMap;
	}
	
	public void put(int id,T obj)
	{
		this.hMap.put(id, obj);
	}
	
	public T get(int id)
	{
		return this.hMap.get(id);
	}
	
	public void del (int id)
	{
		this.hMap.remove(id);
	}
}
