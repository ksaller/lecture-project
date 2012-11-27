import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.validation.service.ILiveValidator;

public class LiveValidationAdapter extends EContentAdapter {

	private ILiveValidator validator;

	public LiveValidationAdapter(ILiveValidator validator) {
		super();
		this.validator = validator;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		super.setTarget(newTarget);
		System.out.println("New target added to adapter: " + newTarget);
	}

	@Override
	public void notifyChanged(final Notification notification) {
		super.notifyChanged(notification);
		System.out.println("Adapter received a Notification:");
		System.out.println("Event: " + notification.getEventType());
		System.out.println("Feature: " + notification.getFeature());
		System.out.println("Old Value: " + notification.getOldValue());
		System.out.println("New Value: " + notification.getNewValue());
		System.out.println("Position: " + notification.getPosition());
		validator.validate(notification);
	}

}
