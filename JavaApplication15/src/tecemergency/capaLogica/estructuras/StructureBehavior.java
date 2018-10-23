package tecemergency.capaLogica.estructuras;
public interface StructureBehavior<X> {
	public void create(X element);
	public X extract();
	public String toString();
	public void clear();
}
