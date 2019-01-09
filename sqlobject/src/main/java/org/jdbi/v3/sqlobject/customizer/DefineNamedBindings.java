/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jdbi.v3.sqlobject.customizer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jdbi.v3.meta.Beta;
import org.jdbi.v3.sqlobject.customizer.internal.DefineNamedBindingsFactory;

/**
 * Defines all bound arguments that don't already have a definition.
 * @see org.jdbi.v3.core.statement.SqlStatement#defineNamedBindings()
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@SqlStatementCustomizingAnnotation(DefineNamedBindingsFactory.class)
@Beta
public @interface DefineNamedBindings {}
