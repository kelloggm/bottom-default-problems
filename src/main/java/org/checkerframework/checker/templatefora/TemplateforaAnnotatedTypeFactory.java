package org.checkerframework.checker.templatefora;

import org.checkerframework.checker.templatefora.qual.TemplateforaBottom;
import org.checkerframework.checker.templatefora.qual.TemplateforaUnknown;
import org.checkerframework.common.basetype.BaseAnnotatedTypeFactory;
import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.javacutil.AnnotationBuilder;

import javax.lang.model.element.AnnotationMirror;

public class TemplateforaAnnotatedTypeFactory extends BaseAnnotatedTypeFactory {
    public final AnnotationMirror TOP, BOTTOM;

    public TemplateforaAnnotatedTypeFactory(BaseTypeChecker checker) {
        super(checker);
        TOP = AnnotationBuilder.fromClass(elements, TemplateforaUnknown.class);
        BOTTOM = AnnotationBuilder.fromClass(elements, TemplateforaBottom.class);
        this.postInit();
    }
}
