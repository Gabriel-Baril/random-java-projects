package strategy;

public abstract class BaseRatingHandler implements IRatingHandler
{
	private IRatingHandler next;

	@Override
	public void setNext(IRatingHandler next) {
		this.next = next;
	}

	@Override
	public Float handle(String rawRating) {
		if(next != null) {
			return next.handle(rawRating);
		}
		return null;
	}
}
