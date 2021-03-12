package org.jakarta.jdt.cdi;

import org.jakarta.codeAction.proposal.quickfix.RemoveAnnotationConflictQuickFix;

public class ConflictInjectObservesObservesAsyncQuickFix extends RemoveAnnotationConflictQuickFix  {
    
    public ConflictInjectObservesObservesAsyncQuickFix() {
        super(false, "jakarta.inject.Inject", "jakarta.enterprise.inject.Disposes", "jakarta.enterprise.event.Observes", "jakarta.enterprise.event.ObservesAsync");
    }
}
