package validation.constraints;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

public class Constraint1 extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		return ctx.createFailureStatus(new Object[] {ctx.getTarget()});
	}

}
