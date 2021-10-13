package strategy;

public interface IRatingHandler {
	void setNext(IRatingHandler handler);
	Float handle(String rawRating);
}
