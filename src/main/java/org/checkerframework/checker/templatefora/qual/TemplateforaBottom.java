package org.checkerframework.checker.templatefora.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

/**
 * The value is definitely TODO. It is safe to use for TODO.
 */
@SubtypeOf({TemplateforaUnknown.class})
@Retention(RetentionPolicy.RUNTIME)
@DefaultQualifierInHierarchy
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({TypeUseLocation.EXCEPTION_PARAMETER})
public @interface TemplateforaBottom {}
