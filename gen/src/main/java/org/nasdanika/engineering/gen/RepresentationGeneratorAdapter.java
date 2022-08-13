package org.nasdanika.engineering.gen;

import java.util.Objects;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.engineering.Representation;
import org.nasdanika.exec.Call;
import org.nasdanika.html.model.app.Action;

public class RepresentationGeneratorAdapter extends AdapterImpl {

	protected org.nasdanika.common.Context context;

	public RepresentationGeneratorAdapter(Representation target, org.nasdanika.common.Context context) {
		setTarget(target);
		this.context = context;
	}

	public void generate(Action action, org.nasdanika.html.emf.EObjectActionResolver.Context resolverContext, ProgressMonitor progressMonitor) {
		Representation representation = (Representation) getTarget();
		Call generator = representation.getGenerator();
		if (generator != null) {
			RepresentationGenerator.Supplier.Factory factory = Objects.requireNonNull(EObjectAdaptable.adaptTo(generator, RepresentationGenerator.Supplier.Factory.class), "Cannot adapt " + generator + " to " + RepresentationGenerator.class);
			Consumer<Diagnostic> diagnosticConsumer = new Consumer<Diagnostic>() {
				
				@Override
				public void accept(Diagnostic diagnostic) {
					System.err.println(diagnostic);					
				}
			};
			
			try {
				RepresentationGenerator adapter = Objects.requireNonNull(org.nasdanika.common.Util.call(factory.create(context), progressMonitor, diagnosticConsumer, org.nasdanika.common.Status.ERROR, org.nasdanika.common.Status.FAIL), "Cannot create representation generator adapter");
				adapter.generate(representation, action, resolverContext, progressMonitor);
			} catch (NasdanikaException e) {
				throw e;
			} catch (Exception e) {
				throw new NasdanikaException(e);
			}
		}
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type == RepresentationGeneratorAdapter.class;
	}

}


