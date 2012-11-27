package validation.listener;

import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ValidationEvent;

public class OurValidationListener implements IValidationListener {

	@Override
	public void validationOccurred(ValidationEvent event) {
		System.out.println("Validation result: " + event.getValidationResults());
	}

}
