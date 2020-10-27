package org.checkerframework.checker.templatefora;

import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.common.basetype.BaseTypeVisitor;
import org.checkerframework.javacutil.AnnotationBuilder;

import javax.lang.model.element.AnnotationMirror;
import java.util.Collections;
import java.util.Set;

public class TemplateforaVisitor extends BaseTypeVisitor<TemplateforaAnnotatedTypeFactory> {
    /**
     * @param checker the type-checker associated with this visitor (for callbacks to {@link
     *                TypeHierarchy#isSubtype})
     */
    public TemplateforaVisitor(BaseTypeChecker checker) {
        super(checker);
    }

    /**
     * Change the default for exception parameter lower bounds to bottom (the default), to prevent
     * false positives. I think it might be a bug in the Checker Framework that these locations are
     * always defaulted to top - that doesn't make sense for checkers that use bottom as the default.
     *
     * @return a set containing only the bottom annotation
     */
    @Override
    protected Set<? extends AnnotationMirror> getExceptionParameterLowerBoundAnnotations() {
        return Collections.singleton(atypeFactory.BOTTOM);
    }
}
