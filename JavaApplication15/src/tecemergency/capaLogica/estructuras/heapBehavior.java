package tecemergency.capaLogica.estructuras;


public interface heapBehavior<X> extends StructureBehavior<X> {
	public boolean isEmpty();
	public String toString();
	public X min();
}
